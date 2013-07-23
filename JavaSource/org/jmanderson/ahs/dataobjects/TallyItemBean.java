package org.jmanderson.ahs.dataobjects;

public class TallyItemBean {

	private String item;
	private String topic;
	private int points;

	public TallyItemBean() {
		item = "";
		topic = "";
		points = 0;
	}

	public TallyItemBean(String item, String main, int points) {
		this.item = item;
		this.topic = main;
		this.points = points;
	}

	public void setItem(String s) {
		item = s;
	}
	public void setTopic(String s) {
		topic = s;
	}
	public void setPoints(int i) {
		points = i;
	}

	public String getItem() {
		return item;
	}
	public String getTopic() {
		return topic;
	}
	public int getPoints() {
		return points;
	}

}
