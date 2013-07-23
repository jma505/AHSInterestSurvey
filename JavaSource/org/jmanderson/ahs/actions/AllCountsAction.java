package org.jmanderson.ahs.actions;

import java.util.Locale;
import java.util.Vector;

import javax.servlet.ServletContext;
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
import org.jmanderson.ahs.da.InterestsDA;
import org.jmanderson.ahs.da.StudentsDA;
import org.jmanderson.ahs.dataobjects.User;
import org.jmanderson.ahs.actions.AllCountsAction;

/**
 * AllCountsAction
 */

public final class AllCountsAction extends Action {

	private static final String GLOBAL_FORWARD_login = "login";

	private static final String GLOBAL_FORWARD_exception = "exception";

	private static final String FORWARD_success = "success";

	private static Log logger = LogFactory.getLog(AllCountsAction.class);

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		// Extract attributes we will need
		Locale locale = getLocale(request);
		HttpSession session = request.getSession();
		// Is there a logged in user?
		User user = (User) session.getAttribute("user");
		if ((user == null) || (!user.getIs_validated())) {
			if (logger.isDebugEnabled()) {
				StringBuffer sb = new StringBuffer();
				sb.append("AllCountsAction: User is not logged on in session ");
				sb.append(session.getId())
						.append(" - Forwarding to Login page");
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
		int threshold = Integer.parseInt((String) request
				.getParameter("threshold"));

		// Get the minorities parameter
		String minority = (String) request.getParameter("minority");
		if (minority == null || minority.length() == 0)
			minority = "both";
		
		Vector interestsV;
		int student_count = 0;

		// TODO NEED TO DO MINORITY FILTERING!!!

		try {

			InterestsDA ida = new InterestsDA(ds);
			StudentsDA sda = new StudentsDA(ds);
			if (minority.equals("both")) {
			interestsV = ida.getAllCounts(threshold);
			student_count = sda.getStudentCountAll();
			}
			else {
				boolean minorities = (minority.equals("yes") ? true : false);
				interestsV = ida.getAllCountsFiltered(threshold, minorities);
				student_count = sda.getStudentCountFiltered(minorities);
			}

		} catch (Exception e) {
			AppException ae = new AppException(
					"Error creating the Interests vector", e);
			session.setAttribute("AppException", ae);
			return (mapping.findForward(GLOBAL_FORWARD_exception));
		}
		request.setAttribute("interests", interestsV);
		request.setAttribute("threshold", new Integer(threshold).toString());
		request.setAttribute("count", new Integer(student_count).toString());
		request.setAttribute("minority", minority);

		if (logger.isDebugEnabled()) {
			StringBuffer sb = new StringBuffer();
			sb.append("AllCountsAction: returning ");
			sb.append(interestsV.size()).append(" interests");
			logger.debug(sb.toString());
		}

		return (mapping.findForward(FORWARD_success));

	}

}

