package org.jmanderson.ahs.dataobjects;

public class MiniStudentBean {

	private int studentId;
	private int teacherId;
	private String studentLastname;
	private String studentFirstname;
	private int count;
	private String teacher;
	private boolean minority = false;

	public MiniStudentBean() {
		studentId = 0;
		studentLastname = "";
		studentFirstname = "";
		count = 0;
		teacher = "";
	}

	public MiniStudentBean(int id, String lname, String fname, int count) {
		studentId = id;
		studentLastname = lname;
		studentFirstname = fname;
		this.count = count;
		teacher = "";
	}

	public MiniStudentBean(int id, String lname, String fname, int count, String teacher, int grade) {
		studentId = id;
		studentLastname = lname;
		studentFirstname = fname;
		this.count = count;
		this.teacher = teacher + " (grade " + grade + ")";
	}

	public MiniStudentBean(int id, String lname, String fname, boolean minority) {
		studentId = id;
		studentLastname = lname;
		studentFirstname = fname;
		this.minority = minority;
	}
	
	public void setStudentId(int i) {
		studentId = i;
	}
	public void setStudentLastname(String s) {
		studentLastname = s;
	}
	public void setStudentFirstname(String s) {
		studentFirstname = s;
	}
	public void setCount(int i) {
		count = i;
	}
	public void setTeacher(String s) {
		teacher = s;
	}

	public void setMinority(boolean b) {
		minority = b;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public String getStudentLastname() {
		return studentLastname;
	}
	public String getStudentFirstname() {
		return studentFirstname;
	}
	public int getCount() {
		return count;
	}
	public String getStudentLastFirstName() {
		return studentLastname + ", " + studentFirstname;
	}
	public String getTeacher() {
		return teacher;
	}
	public boolean getMinority() {
		return minority;
	}

	/**
	 * @return Returns the teacherId.
	 */
	public int getTeacherId() {
		return teacherId;
	}
	/**
	 * @param teacherId The teacherId to set.
	 */
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
}
