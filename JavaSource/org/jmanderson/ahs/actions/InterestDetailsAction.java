package org.jmanderson.ahs.actions;

import java.io.IOException;
import java.util.Locale;
import java.util.Vector;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.jmanderson.ahs.AppException;
import org.jmanderson.ahs.PrepareSession;
import org.jmanderson.ahs.TopicsLookup;
import org.jmanderson.ahs.da.InterestsDA;
import org.jmanderson.ahs.dataobjects.User;
import org.jmanderson.ahs.actions.InterestDetailsAction;

/**
 * InterestDetailsAction
 */

public final class InterestDetailsAction extends Action {

	private static final Log logger = LogFactory.getLog(InterestDetailsAction.class);
	
	private static final String GLOBAL_FORWARD_login = "login";
	private static final String GLOBAL_FORWARD_exception = "exception";
	
	private static final String FORWARD_success = "success";
	
  public ActionForward execute(ActionMapping mapping,
			       ActionForm form,
			       HttpServletRequest request,
			       HttpServletResponse response)
	throws IOException, ServletException {

    // Extract attributes we will need
    Locale locale = getLocale(request);
    HttpSession session = request.getSession();
    // Is there a logged in user?
    User user = (User) session.getAttribute("user");
    if ((user == null) || (! user.getIs_validated())) {
      if (logger.isDebugEnabled()) {
      	StringBuffer sb = new StringBuffer();
      	sb.append("InterestDetailsAction: User is not logged on in session ");
      	sb.append(session.getId());
        logger.debug(sb.toString());
      }
      return (mapping.findForward(GLOBAL_FORWARD_login));
    }

    // Get the ServletContext for later use!
    ServletContext context = servlet.getServletContext();

    // Get the DataSource for later use!
    DataSource ds = (DataSource) context.getAttribute("cloverDB");

    // Set up the session objects
    try {
      PrepareSession.checkSessionObjects(session, context, ds);
    } catch (AppException ae) {
      session.setAttribute("AppException", ae);
      return (mapping.findForward(GLOBAL_FORWARD_exception));
    }

    // Get the threshold parameter
    int threshold = Integer.parseInt((String) request.getParameter("threshold"));
    
    // Get the topicId parameter
    int topicId = Integer.parseInt((String) request.getParameter("topicId"));

    // Get the minorities setting
    String minority = (String) request.getParameter("minority");
    if (minority == null || minority.length() == 0) {
    	minority = "both";
    }
    
    Vector studentsV;

    try {

      InterestsDA ida = new InterestsDA(ds);
      if (minority.equals("both")) {
      	studentsV = ida.getInterestDetails(topicId, threshold);
      }
      else {
      	boolean minorities = (minority.equals("yes") ? true : false);
      	studentsV = ida.getInterestDetailsFiltered(topicId, threshold, minorities);
      }

    } catch (Exception e) {
      AppException ae = new AppException("Error creating the Students vector", e);
      session.setAttribute("AppException", ae);
      return (mapping.findForward(GLOBAL_FORWARD_exception));
    }
    request.setAttribute("students", studentsV);
    request.setAttribute("threshold", new Integer(threshold).toString());
    request.setAttribute("topicId", new Integer(topicId).toString());
    TopicsLookup lookup = (TopicsLookup) context.getAttribute("lookup");
    request.setAttribute("interest", lookup.topicFromId(topicId));
    request.setAttribute("minority", minority);

    if (logger.isDebugEnabled()) {
    	StringBuffer sb = new StringBuffer();
    	sb.append("InterestDetailsAction: returning ");
    	sb.append(studentsV.size()).append(" students");
    	logger.debug(sb.toString());
    }
    
    return (mapping.findForward(FORWARD_success));

  }

}

