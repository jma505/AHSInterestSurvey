package org.jmanderson.ahs.dataobjects;

public class TopicListBean {

	private int id;
	private String topic;

	public TopicListBean() {
		id = 0;
		topic = "";
	}

	public TopicListBean(String topic, int id) {
		this.id = id;
		this.topic = topic;
	}

	public void setId(int i) {
		id = i;
	}
	public void setTopic(String s) {
		topic = s;
	}

	public int getId() {
		return id;
	}
	public String getTopic() {
		return topic;
	}

}
