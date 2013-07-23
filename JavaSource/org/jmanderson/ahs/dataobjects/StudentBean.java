package org.jmanderson.ahs.dataobjects;

/**
 * Updated for 2002-2003
 */

import java.util.*;

import org.jmanderson.ahs.common.*;
import org.jmanderson.ahs.util.*;
import org.jmanderson.ahs.common.CheckBoxes;
import org.jmanderson.ahs.dataobjects.TeacherBean;
import org.jmanderson.ahs.util.Counter;

public class StudentBean {

	/**
	 * Common fields
	 */

	private int id;
	private String firstname;
	private String lastname;
	private TeacherBean tb;
	Vector interests; // !! vector of Map.Entry objects !!

	CheckBoxes checkBoxes;

	public StudentBean() {
		id = 0;
		firstname = "";
		lastname = "";
		tb = null;
		checkBoxes = null;
		interests = new Vector();
	}

	public void setId(int i) {
		id = i;
	}
	public void setFirstname(String s) {
		firstname = s;
	}
	public void setLastname(String s) {
		lastname = s;
	}
	public void setTb(TeacherBean t) {
		tb = t;
	}
	public void setCheckBoxes(CheckBoxes c) {
		checkBoxes = c;
	}
	public void setInterests(Vector v) {
		interests.clear();
		interests.addAll(v);
	}

	public int getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getTeacherName() {
		return tb.getLastname();
	}
	public int getGrade() {
		return tb.getGrade();
	}
	public CheckBoxes getCheckBoxes() {
		return checkBoxes;
	}
	public int getTeacherId() {
		return tb.getId();
	}
	public String getInterests() {
		return getInterests(1);
	}
	public Vector getInterestsV() {
		return interests;
	}
	public String getInterests(int threshold) {
		Map.Entry me;
		Vector v = new Vector();
		for (int i = 0; i < interests.size(); i++) {
			me = (Map.Entry) interests.get(i);
			if (((Counter) me.getValue()).get() >= threshold)
				v.add((String) me.getKey());
		}
		return v.toString();
	}
	public String getStudentFullname() {
		return firstname + " " + lastname;
	}
	public String getStudentFullnameRev() {
		return lastname + ", " + firstname;
	}

	public void prepareForTransport() {
		interests.trimToSize();
	}

	public String getXml() {
		StringBuffer sb = new StringBuffer(600);
		sb.append("<student><id>" + id + "</id>");
		sb.append("<firstname>" + firstname + "</firstname>");
		sb.append("<lastname>" + lastname + "</lastname>");
		sb.append(tb.getXml());
		sb.append("<interests>");
		Map.Entry me;
		Counter counter;
		if (!interests.isEmpty()) {
			for (int i = 0; i < interests.size(); i++) {
				me = (Map.Entry) interests.get(i);
				sb.append("<interest count=\"");
				counter = (Counter) me.getValue();
				sb.append(counter.get()).append("\" max1=\"");
				sb.append(counter.getMax1()).append("\" max2=\"");
				sb.append(counter.getMax2()).append("\" checks=\"");
				sb.append(counter.getChecks()).append("\">");
				sb.append("<name>").append((String) me.getKey());
				sb.append("</name></interest>");
			}
		}
		sb.append("</interests>");
		sb.append(checkBoxes.getXML());

		sb.append("</student>");

		return sb.toString();

	}

}
