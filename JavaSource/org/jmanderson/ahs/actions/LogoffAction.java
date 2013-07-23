package org.jmanderson.ahs.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.jmanderson.ahs.dataobjects.User;

/*
 * Processes a login.
 * 
 * <br> 11/11/03 Initial development. <br> 07/31/04 Updated for new development.
 */
public class LogoffAction extends org.apache.struts.action.Action {

	// Global Forwards
	public static final String GLOBAL_FORWARD_login = "login";

	public static final String GLOBAL_FORWARD_exception = "exception";

	// Local Forwards
	public static final String FORWARD_success = "success";

	public static final String FORWARD_successStudent = "successStudent";

	public LogoffAction() {
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if (user != null) {
			session.removeAttribute("user");
		}
		StringBuffer sb = new StringBuffer();
		if (user != null) {
			sb.append("User \'").append(user.getUsername());
			sb.append("\' logged off in session ").append(session.getId());
			servlet.log(sb.toString());
		}
		session.invalidate();

		return mapping.findForward(GLOBAL_FORWARD_login);

	}

}