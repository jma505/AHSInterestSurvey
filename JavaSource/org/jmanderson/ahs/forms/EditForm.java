package org.jmanderson.ahs.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public final class EditForm extends ActionForm {

	private String id;
	private String firstname;
	private String lastname;

	public void setId(String s) {
		id = s;
	}
	public void setFirstname(String s) {
		firstname = s;
	}
	public void setLastname(String s) {
		lastname = s;
	}

	public String getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();

		try {
			Integer.parseInt(id);
		} catch (Exception e) {
			errors.add("id", new ActionError("error.id.invalid"));
		}
		if ((firstname == null) || (firstname.length() < 1))
			errors.add("firstname", new ActionError("error.firstname.required"));
		if ((lastname == null) || (lastname.length() < 1))
			errors.add("lastname", new ActionError("error.lastname.required"));

		return errors;

	}

}
