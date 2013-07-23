package org.jmanderson.ahs.forms;

/**
 * Updated for 2002-2003
 */

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public final class LoginForm extends ActionForm {

	private String username = null;
	private String password = null;

	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}

	public void setUsername(String s) {
		username = s;
	}
	public void setPassword(String s) {
		password = s;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.username = null;
		this.password = null;
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();

		if ((username == null) || (username.length() < 1))
			errors.add("username", new ActionError("error.username.required"));
		if ((password == null) || (password.length() < 1))
			errors.add("password", new ActionError("error.password.required"));

		return errors;

	}

}
