package org.jmanderson.ahs.actions;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.jmanderson.ahs.AppException;
import org.jmanderson.ahs.PrepareSession;
import org.jmanderson.ahs.dataobjects.User;

/*
 * Processes a login.
 * 
 * <br> 11/11/03 Initial development. <br> 07/31/04 Updated for new development.
 */
public class LoginAction extends org.apache.struts.action.Action {

	// Global Forwards
	public static final String GLOBAL_FORWARD_login = "login";

	public static final String GLOBAL_FORWARD_exception = "exception";

	// Local Forwards
	public static final String FORWARD_success = "success";

	public static final String FORWARD_successStudent = "successStudent";
	
	public static final String FORWARD_successK12 = "successK12";

	public LoginAction() {
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		if (isCancelled(request)) {
			return mapping.findForward(FORWARD_success);
		}

		ActionErrors errors = new ActionErrors();
		User user = null;

		ResourceBundle rb = ResourceBundle
				.getBundle("org.jmanderson.ahs.LocalResources");
		
		try {
			user = getDsAndValidateUser(errors, form, request, rb);
		} catch (AppException ae) {
			request.getSession().setAttribute("AppException", ae);
			return mapping.findForward(GLOBAL_FORWARD_exception);
		} catch (Exception e) {
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.app"));
		}

		// Forward any errors back to the original form
		if (!errors.isEmpty()) {
			saveErrors(request, errors);
			return (new ActionForward(mapping.getInput()));
		}

		if (user != null && user.isStudent()) {
			return mapping.findForward(FORWARD_successStudent);
		} else if (user.isK12()) { 
			return mapping.findForward(FORWARD_successK12); }
		else {
			return mapping.findForward(FORWARD_success);
		}
	}

	/**
	 * Retrieves the DataSource and validates the username and password.
	 * 
	 * @param errors
	 *            ActionErrors object
	 * @param form
	 *            ActionForm (DynaActionForm)
	 * @param session
	 *            HttpSessions to store User
	 * @return User
	 * @throws Exception
	 */
	private User getDsAndValidateUser(ActionErrors errors, ActionForm form,
			HttpServletRequest request, ResourceBundle rb) throws AppException, Exception {
		DataSource ds = (DataSource) servlet.getServletContext().getAttribute(
				"cloverDB");
		User user = null;

		if (ds == null) {
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError(
					"error.database.missing"));
		} else {
			String username;
			String password;
			username = (String) PropertyUtils.getSimpleProperty(form,
					"username");
			password = (String) PropertyUtils.getSimpleProperty(form,
					"password");
			user = new User();
			user.setUsername(username);
			user.setPassword(password);
			if (!user.validate(ds, rb)) {
				errors.add(ActionErrors.GLOBAL_ERROR, new ActionError(
						"error.password.mismatch"));
			} else {
				// Put the UserBean into the session scope for future use
				HttpSession session = request.getSession(false);
				if (session != null) {
					session.invalidate();
				}
				session = request.getSession(true);
				session.setAttribute("user", user);
				PrepareSession.checkSessionObjects(session, servlet
						.getServletContext(), ds);
				servlet.log("User '" + user.getUsername()
						+ "' logged on in session " + session.getId());
			}
		}
		return user;
	}

}