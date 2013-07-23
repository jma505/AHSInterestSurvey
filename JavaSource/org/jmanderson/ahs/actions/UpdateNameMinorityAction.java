package org.jmanderson.ahs.actions;

import java.util.Locale;

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
import org.jmanderson.ahs.da.StudentsDA;
import org.jmanderson.ahs.dataobjects.User;
import org.jmanderson.ahs.forms.EditNameMinorityForm;
import org.jmanderson.ahs.actions.UpdateNameMinorityAction;

/**
 * AddBigEntryAction - prepare a task bean
 */

public final class UpdateNameMinorityAction extends Action {

	// Global forwards
	public static final String GLOBAL_FORWARD_login = "login";
	public static final String GLOBAL_FORWARD_logoff = "logoff";
	public static final String GLOBAL_FORWARD_exception = "exception";

	// Local forwards
	public static final String FORWARD_success = "success";
	public static final String FORWARD_cancel = "cancel";

	private static Log logger = LogFactory.getLog(UpdateNameMinorityAction.class);

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
				logger.debug("User is not logged on in session "
						+ session.getId());
			}
			return mapping.findForward(GLOBAL_FORWARD_login);
		}

		// Was this transaction cancelled?
		if (isCancelled(request)) {
			logger.debug("Transaction was cancelled");
			if (mapping.getAttribute() != null)
				session.removeAttribute(mapping.getAttribute());
			if (user.isStudent()) {
				return mapping.findForward(GLOBAL_FORWARD_logoff);
			}
			request.setAttribute("teacherID", ((EditNameMinorityForm) form).getTeacherIDInteger());
			return mapping.findForward(FORWARD_cancel);
		}

		// prepare to populate the form
		if (form == null) {
			if (logger.isDebugEnabled()) {
				logger.debug("Creating new EditNameMinorityForm bean under key "
						+ mapping.getAttribute());
			}
			form = new EditNameMinorityForm();
			if ("request".equals(mapping.getScope()))
				request.setAttribute(mapping.getAttribute(), form);
			else
				session.setAttribute(mapping.getAttribute(), form);
		}
		EditNameMinorityForm eform = (EditNameMinorityForm) form;

		// Get the ServletContext for later use!
		ServletContext context = servlet.getServletContext();

		// Get the DataSource for later use!
		DataSource ds = (DataSource) context.getAttribute("cloverDB");

		// Set up the application and session objects
		try {
			PrepareSession.checkSessionObjects(session, servlet
					.getServletContext(), ds);
		} catch (AppException ae) {
			session.setAttribute("AppException", ae);
			return mapping.findForward(GLOBAL_FORWARD_exception);
		}

		try {
			StudentsDA sda = new StudentsDA(ds);
			sda.updateStudent(eform.getId(), eform.getFirstName(), eform.getLastName(), eform.getMinority());
		}
		catch (Exception e) {
			AppException ae = new AppException("Student update was unsuccessful", e);
			session.setAttribute("AppException", ae);
			return mapping.findForward(GLOBAL_FORWARD_exception);
		}
		
		request.setAttribute("teacherID", eform.getTeacherIDInteger());
		return mapping.findForward(FORWARD_success);
	}

}

