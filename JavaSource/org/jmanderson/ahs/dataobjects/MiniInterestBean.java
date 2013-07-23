package org.jmanderson.ahs.dataobjects;


public class MiniInterestBean {

	private String interestName;
	private int count;
	private int topicId;

	public MiniInterestBean() {
		interestName = "";
		count = 0;
		topicId = 0;
	}

	public MiniInterestBean(String interestName, int count) {
		this.interestName = interestName;
		this.count = count;
	}

	public MiniInterestBean(String interestName, int count, int topicId) {
		this.interestName = interestName;
		this.count = count;
		this.topicId = topicId;
	}

	public void setInterestName(String s) {
		interestName = s;
	}

	public void setCount(int i) {
		count = i;
	}

	public void setTopicId(int i) {
		topicId = i;
	}

	public String getInterestName() {
		return interestName;
	}

	public int getCount() {
		return count;
	}

	public int getTopicId() {
		return topicId;
	}

}
