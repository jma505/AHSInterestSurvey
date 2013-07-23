package org.jmanderson.ahs.actions;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

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
import org.jmanderson.ahs.da.TeachersDA;
import org.jmanderson.ahs.dataobjects.TeacherBean;
import org.jmanderson.ahs.dataobjects.User;
import org.jmanderson.ahs.actions.PrepareEditAction;

/**
 * ListByTeacherAction
 */

public final class PrepareEditAction extends Action {

	private static final String GLOBAL_FORWARD_login = "login";

	private static final String GLOBAL_FORWARD_exception = "exception";

	private static final String FORWARD_success = "success";

	private static Log logger = LogFactory.getLog(PrepareEditAction.class);

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// Extract attributes we will need
		Locale locale = getLocale(request);
		HttpSession session = request.getSession();
		// Is there a logged in user?
		User user = (User) session.getAttribute("user");
		if ((user == null) || (!user.getIs_validated())) {
			if (logger.isDebugEnabled()) {
				StringBuffer sb = new StringBuffer();
				sb
						.append("PrepareEditAction: User is not logged on in session ");
				sb.append(session.getId());
				logger.debug(sb.toString());
			}
			return (mapping.findForward(GLOBAL_FORWARD_login));
		}

		// Get the ServletContext for later use!
		ServletContext context = servlet.getServletContext();

		// Get the DataSource for later use!
		DataSource ds = (DataSource) context.getAttribute("cloverDB");

		// Set up the application and session objects
		try {
			PrepareSession.checkSessionObjects(session, context, ds);
		} catch (AppException ae) {
			session.setAttribute("AppException", ae);
			return (mapping.findForward("exception"));
		}

		// Get the teacher ID
		String teacherID = (String) request.getParameter("teacherID");
		Integer teacherIDint = (Integer) request.getAttribute("teacherID");
		if ((teacherID == null || teacherID.length() == 0)
				&& teacherIDint == null) {
			AppException ae = new AppException(
					"Missing Teacher ID - system error");
			session.setAttribute("AppException", ae);
			return mapping.findForward(GLOBAL_FORWARD_exception);
		}

		int tid = 0;
		if (teacherIDint != null) {
			tid = teacherIDint.intValue();
		} else {
			try {
				tid = Integer.parseInt(teacherID);
			} catch (NumberFormatException e) {
				AppException ae = new AppException("Invalid Teacher ID: "
						+ teacherID);
				session.setAttribute("AppException", ae);
				return mapping.findForward(GLOBAL_FORWARD_exception);
			}
		}

		TeacherBean tb;
		try {
			TeachersDA tda = new TeachersDA(ds);
			tb = tda.getTeacher(tid);
		} catch (Exception e) {
			AppException ae = new AppException(
					"Error getting Teacher information", e);
			session.setAttribute("AppException", ae);
			return mapping.findForward(GLOBAL_FORWARD_exception);
		}

		List students;

		try {

			StudentsDA sda = new StudentsDA(ds);
			students = sda.getStudentsForMinorityUpdate(tid);

		} catch (Exception e) {
			AppException ae = new AppException(
					"Error creating the Students list", e);
			session.setAttribute("AppException", ae);
			return (mapping.findForward(GLOBAL_FORWARD_exception));
		}
		request.setAttribute("students", students);
		request.setAttribute("teacher", tb.getLastname());
		request.setAttribute("grade", new Integer(tb.getGrade()).toString());
		request.setAttribute("teacherID", teacherID);
		// Forward control to the specified success URI

		return (mapping.findForward(FORWARD_success));

	}

}

