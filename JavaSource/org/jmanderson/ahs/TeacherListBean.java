package org.jmanderson.ahs;

/**
 * Updated for 2002-2003
 */

public class TeacherListBean {

	private final String label;
	private final int value;

	public TeacherListBean(String label, int value) {
		this.label = label;
		this.value = value;
	}

	public String getLabel() {
		return label;
	}
	public int getValue() {
		return value;
	}

}
