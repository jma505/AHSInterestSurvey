package org.jmanderson.ahs.dataobjects;

/**
 * Updated for 2004
 */

import java.io.Serializable;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.sql.DataSource;

import org.jmanderson.ahs.da.UsersDA;

public final class User implements Serializable {

	private String username;

	private String password;

	private int user_security_level;
	
	/*
	 * 0 = unknown (default ... can do nothing but logoff)
	 * 1 = teacher (view)
	 * 2 = teacher (view with ability to edit names)
	 * 3 = data entry (put in data from the K-2 short form)
	 * 4 = administrator (view all)
	 * 5 = super administrator (access to everything, including data entry)
	 * 
	 * "student" login - access upper grades long entry form
	 * "k12" login - access lower grades short entry form
	 */

	private boolean is_validated;

	private boolean isStudent;
	private boolean isK12;

	public User() {
		username = "";
		password = "";
		user_security_level = 0;
		is_validated = false;
		//user_teacher = 0;
		isStudent = false;
		isK12 = false;
	}

	public void setUsername(String s) {
		username = s;
	}

	public void setPassword(String s) {
		password = s;
	}

	public String getUsername() {
		return username;
	}

	public boolean getIs_validated() {
		return is_validated;
	}

	public int getSecurityLevel() {
		return user_security_level;
	}

	public String getSecurity() {
		if (isSuperAdmin())
			return "Application Manager (full rights)";
		if (isViewAll())
			return "Administrator (full view)";
		if (isDataEntry())
			return "Data Entry";
		if (isEditor())
			return "Teacher (view by class and edit names)";
		if (isView())
			return "Teacher (view by class)";
		return "Unknown! (security level 0)";
	}

	public boolean isSuperAdmin() {
		return (user_security_level == 5 ? true : false);
	}

	public boolean isViewAll() {
		return (user_security_level > 3 ? true : false);
	}

	public boolean isDataEntry() {
		return (user_security_level == 3 || user_security_level == 5 ? true : false);
	}

	public boolean isView() {
		return (user_security_level > 0 ? true : false);
	}
	
	public boolean isEditor() {
		return (user_security_level > 1 ? true : false);
	}

	public boolean isStudent() {
		return isStudent;
	}
	
	public boolean isK12() {
		return isK12;
	}

	public boolean validate(DataSource ds, ResourceBundle rb) throws Exception {

		Properties props = null;

		if (rb.getString("student.entry.allowed").equalsIgnoreCase("yes")) {
			if (rb.getString("student.entry.name").equalsIgnoreCase(username)) {
				if (rb.getString("student.entry.password").equalsIgnoreCase(
						password)) {
					isStudent = true;
					is_validated = true;
					return true;
				}
			}
			else if (rb.getString("k12student.entry.name").equalsIgnoreCase(username)) {
				if (rb.getString("student.entry.password").equalsIgnoreCase(password)) {
					isK12 = true;
					is_validated = true;
					return true;
				}
			}
		}

		UsersDA uda = new UsersDA(ds);
		props = uda.getUser(username);

		if (!props.containsKey("password")
				|| !props.getProperty("password", "").equals(password)) {
			return false;
		}
		is_validated = true;

		user_security_level = Integer.parseInt(props.getProperty(
				"security_level", "0"));
		password = "";

		return true;
	}

}

