package org.jmanderson.ahs.dataobjects;

import java.util.Vector;

import org.jmanderson.ahs.dataobjects.MiniStudentBean;

public class InterestBean {

	private String interestName;
	private Vector students;

	public InterestBean() {
		interestName = "";
		students = new Vector();
	}

	public void setInterestName(String s) {
		interestName = s;
	}
	public void addStudent(int id, String lname, String fname, int count) {
		MiniStudentBean msb = new MiniStudentBean(id, lname, fname, count);
		students.add(msb);
	}

	public String getInterestName() {
		return interestName;
	}

	public Vector getStudentsAsVector() {
		return students;
	}

	public String getStudents() {
		return getStudents(2);
	}

	public String getStudents(int threshold) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < students.size(); i++) {
			MiniStudentBean msb = (MiniStudentBean) students.get(i);
			if (msb.getCount() >= threshold) {
				sb.append(msb.getStudentLastFirstName());
				sb.append(" (" + msb.getCount() + ")<br>");
			}
		}
		return sb.toString();
	}

	public int getCount() {
		return students.size();
	}

}
