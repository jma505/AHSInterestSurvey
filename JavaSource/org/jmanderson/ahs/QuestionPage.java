package org.jmanderson.ahs;

public class QuestionPage {

	private final String label;
	private final int value;

	public QuestionPage(String label, int value) {
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
