package org.jmanderson.ahs.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.jmanderson.ahs.dataobjects.MiniStudentBean;

/**
 * ActionForm for editing a student's name and minority indicator.
 */
public class EditNameMinorityForm extends ActionForm {

	private String firstName;

	private String lastName;

	private int id;

	private boolean minority;

	private int tid;

	public EditNameMinorityForm() {
		firstName = "";
		lastName = "";
		id = 0;
		tid = 0;
		minority = false;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMinority(boolean minority) {
		this.minority = minority;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getId() {
		return id;
	}

	public boolean getMinority() {
		return minority;
	}

	public int getTid() {
		return tid;
	}

	public Integer getTeacherIDInteger() {
		return new Integer(tid);
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		lastName = "";
		firstName = "";
		id = 0;
		minority = false;
	}

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();

		if ((firstName == null) || (firstName.length() < 1)) {
			errors.add("firstName", new ActionError(
					"error.studentFirstName.required"));
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append(firstName.substring(0, 1).toUpperCase());
			sb.append(firstName.substring(1).toLowerCase());
			firstName = sb.toString();
		}
		if (hasInvalidCharacter(firstName)) {
			errors.add("firstName", new ActionError(
					"error.invalid.character"));
		}
		if ((lastName == null) || (lastName.length() < 1)) {
			errors.add("lastName", new ActionError(
					"error.studentLastName.required"));
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append(lastName.substring(0, 1).toUpperCase());
			sb.append(lastName.substring(1).toLowerCase());
			lastName = sb.toString();
		}
		if (hasInvalidCharacter(lastName)) {
			errors.add("lastName", new ActionError(
					"error.invalid.character"));
		}

		return errors;
	}

	private boolean hasInvalidCharacter(String s) {
		if (s != null) {
			if ((s.indexOf('\'') != -1) || (s.indexOf('\\') != -1))
				return true;
		}
		return false;
	}

	public void loadFromStudent(MiniStudentBean sb) {
		this.firstName = sb.getStudentFirstname();
		this.lastName = sb.getStudentLastname();
		this.id = sb.getStudentId();
		this.tid = sb.getTeacherId();
		this.minority = sb.getMinority();
	}
}