package org.jmanderson.ahs.dataobjects;

/**
 * Updated for 2002-2003
 */

public class TeacherBean {

	private int id;
	private String lastname;
	private int grade;

	public TeacherBean() {
		id = 0;
		lastname = "";
		grade = 0;
	}

	public void setId(int i) {
		id = i;
	}
	public void setLastname(String s) {
		lastname = s;
	}
	public void setGrade(int i) {
		grade = i;
	}

	public int getId() {
		return id;
	}
	public String getLastname() {
		return lastname;
	}
	public int getGrade() {
		return grade;
	}

	public String getXml() {
		StringBuffer sb = new StringBuffer(80);
		sb.append("<teacher><id>" + id + "</id>");
		sb.append("<lastname>" + lastname + "</lastname>");
		sb.append("<grade>" + grade + "</grade></teacher>");
		return sb.toString();
	}

}
