package org.jmanderson.ahs.actions;

/**
 * Updated for 2002-2003
 */

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

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
import org.jmanderson.ahs.da.StudentsDA;
import org.jmanderson.ahs.dataobjects.StudentBean;
import org.jmanderson.ahs.dataobjects.User;
import org.jmanderson.ahs.actions.ListStudentAction;

/**
 * ListStudentAction
 */

public final class ListStudentAction extends Action {

	private static final String GLOBAL_FORWARD_login = "login";
	private static final String GLOBAL_FORWARD_exception = "exception";
	
	private static final String FORWARD_successSmall = "successSmall";
	private static final String FORWARD_successBig = "successBig";
	
	private static final Log logger = LogFactory.getLog(ListStudentAction.class);
	
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
    		sb.append("ListStudentAction: User is not logged on in session ");
    		sb.append(session.getId());
    		logger.debug(sb.toString());
    	}
      return (mapping.findForward(GLOBAL_FORWARD_login));
    }

    // Get the ServletContext for later use!
    ServletContext context = servlet.getServletContext();

    // Get the DataSource for later use!
    DataSource ds = (DataSource) context.getAttribute("cloverDB");


    // Get the studentId we're looking for
    int sid = Integer.parseInt(request.getParameter("studentId"));
    
    if (logger.isDebugEnabled()) {
    	StringBuffer sb = new StringBuffer();
    	sb.append("ListStudentAction: processing request for studentId ").append(sid);
    	logger.debug(sb.toString());
    }
    
    // Set up the application and session objects
    try {
    	PrepareSession.checkSessionObjects(session, 
    				servlet.getServletContext(), ds);
    } catch (AppException ae) {
    	session.setAttribute("AppException", ae);
        return (mapping.findForward(GLOBAL_FORWARD_exception));
    }
    
    // Create the StudentBean in the Request scope
    StudentBean sb;

    try {

      StudentsDA sda = new StudentsDA(ds);
      sb = sda.getStudent(sid);

    } catch (Exception e) {
      AppException ae = new AppException("Error creating the Student bean", e);
      session.setAttribute("AppException", ae);
      return (mapping.findForward(GLOBAL_FORWARD_exception));
    }
    request.setAttribute("student", sb);

    // Forward control to the specified success URI

    ResourceBundle rb = ResourceBundle.getBundle("org.jmanderson.ahs.LocalResources");
    String gradeString = rb.getString("bigform.lowest.grade");
    int grade = 4;
    try {
    	grade = Integer.parseInt(gradeString);
    }
    catch (NumberFormatException e) {
    	// ignore, take default of grade 4
    }
    if (sb.getGrade() >= grade)
      return (mapping.findForward(FORWARD_successBig));
    else
      return (mapping.findForward(FORWARD_successSmall));

  }

}

