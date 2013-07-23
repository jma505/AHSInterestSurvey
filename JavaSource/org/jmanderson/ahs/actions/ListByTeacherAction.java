package org.jmanderson.ahs.actions;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
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
import org.jmanderson.ahs.da.InterestsDA;
import org.jmanderson.ahs.da.StudentsDA;
import org.jmanderson.ahs.da.TeachersDA;
import org.jmanderson.ahs.dataobjects.TeacherBean;
import org.jmanderson.ahs.dataobjects.User;
import org.jmanderson.ahs.forms.ChooseTeacherForm;
import org.jmanderson.ahs.actions.ListByTeacherAction;

/**
 * ListByTeacherAction
 */

public final class ListByTeacherAction extends Action {

	private static final String GLOBAL_FORWARD_login = "login";

	private static final String GLOBAL_FORWARD_exception = "exception";

	private static final String FORWARD_successStudents = "successStudents";

	private static final String FORWARD_successInterests = "successInterests";

	private static final String FORWARD_successCounts = "successCounts";

	private static Log logger = LogFactory.getLog(ListByTeacherAction.class);

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
						.append("ListByTeacherAction: User is not logged on in session ");
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
			return (mapping.findForward(GLOBAL_FORWARD_exception));
		}

		// Get the teacherId we're looking for
		ChooseTeacherForm ctform = (ChooseTeacherForm) form;

		// Get the minorities setting
		String minority = ctform.getMinority();
		if (minority == null || minority.length() == 0) {
			minority = "both";
		}

		int tid = ctform.getTeacherId();
		TeachersDA tda = new TeachersDA(ds);
		TeacherBean tb = null;

		try {
			tb = tda.getTeacher(tid);
		} catch (Exception e) {
			AppException ae = new AppException(
					"Error creating the Students vector", e);
			session.setAttribute("AppException", ae);
			return (mapping.findForward(GLOBAL_FORWARD_exception));
		}

		ResourceBundle rb = ResourceBundle
				.getBundle("org.jmanderson.ahs.LocalResources");
		String gradeString = rb.getString("bigform.lowest.grade");
		int grade = 4;
		try {
			grade = Integer.parseInt(gradeString);
		} catch (NumberFormatException e) {
			// ignore - use default of 4
		}
		int threshold = ctform.getThreshold();
		
		// The following two lines are no longer valid as of 1/7/2005
//		if (tb.getGrade() < grade)
//			threshold = 1;
		
		int student_count = 0;

		// Process according to display choice ...

		if (ctform.getDisplay().equals("student")) {

			// Create the vector of Students in the Request scope
			Vector studentsV;

			try {

				StudentsDA sda = new StudentsDA(ds);
				if (minority.equals("both")) {
					studentsV = sda.getAllStudentsShortAll(tid, threshold);
					student_count = sda.getStudentCountAll(tid);
				} else {
					boolean minorities = (minority.equals("yes") ? true : false);
					studentsV = sda.getAllStudentsShortFiltered(tid, threshold,
							minorities);
					student_count = sda
							.getStudentCountFiltered(tid, minorities);
				}

			} catch (Exception e) {
				AppException ae = new AppException(
						"Error creating the Students vector", e);
				session.setAttribute("AppException", ae);
				return (mapping.findForward(GLOBAL_FORWARD_exception));
			}
			request.setAttribute("students", studentsV);
			request.setAttribute("minority", minority);
			request.setAttribute("teacher", tb.getLastname());
			request
					.setAttribute("grade", new Integer(tb.getGrade())
							.toString());
			request.setAttribute("thold", new Integer(threshold).toString());
			request.setAttribute("teacherId", new Integer(tid).toString());
			request.setAttribute("display", ctform.getDisplay());
			request
					.setAttribute("count", new Integer(student_count)
							.toString());

			// Forward control to the specified success URI

			return (mapping.findForward(FORWARD_successStudents));

		} else {

			// Create the vector of Interests in the Request scope
			Vector interestsV;

			try {

				InterestsDA ida = new InterestsDA(ds);
				StudentsDA sda = new StudentsDA(ds);
				if (minority.equals("both")) {
					interestsV = ida.getInterestsAll(tid, threshold);
					student_count = sda.getStudentCountAll(tid);
				} else {
					boolean minorities = (minority.equals("yes") ? true : false);
					interestsV = ida.getInterestsFiltered(tid, threshold,
							minorities);
					student_count = sda
							.getStudentCountFiltered(tid, minorities);
				}

			} catch (Exception e) {
				AppException ae = new AppException(
						"Error creating the Interests vector", e);
				session.setAttribute("AppException", ae);
				return (mapping.findForward(GLOBAL_FORWARD_exception));
			}
			interestsV.trimToSize();
			//			if (interestsV.size() == 0) {
			//				AppException ae = new AppException(
			//						"No Interests for this Teacher at the chosen Threshold of "
			//								+ threshold);
			//				session.setAttribute("AppException", ae);
			//				return (mapping.findForward(GLOBAL_FORWARD_exception));
			//			}
			if (logger.isDebugEnabled()) {
				StringBuffer sb = new StringBuffer();
				sb.append("ListByTeacherAction: ").append(interestsV.size());
				sb.append(" interests returned");
				logger.debug(sb.toString());
			}

			request.setAttribute("interests", interestsV);
			request.setAttribute("minority", minority);
			try {
				tb = tda.getTeacher(tid);
				request.setAttribute("teacher", tb.getLastname());
				request.setAttribute("grade", new Integer(tb.getGrade())
						.toString());
				request
						.setAttribute("thold", new Integer(threshold)
								.toString());
				request.setAttribute("teacherId", new Integer(tid).toString());
				request.setAttribute("display", ctform.getDisplay());
				request.setAttribute("count", new Integer(student_count)
						.toString());
			} catch (Exception e) {
				AppException ae = new AppException("Unexpected Exception", e);
				session.setAttribute("AppException", ae);
				return (mapping.findForward(GLOBAL_FORWARD_exception));
			}

			// Forward control to the specified success URI

			if (ctform.getDisplay().equals("interest")) {
				return (mapping.findForward(FORWARD_successInterests));
			} else {
				return (mapping.findForward(FORWARD_successCounts));
			}

		}

	}

}

