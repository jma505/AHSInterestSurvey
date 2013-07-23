package org.jmanderson.ahs;

import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Vector;

import javax.sql.DataSource;

import org.jmanderson.ahs.da.TopicsDA;
import org.jmanderson.ahs.dataobjects.TopicListBean;

public class TopicsLookup {

	private String[] topic;
	private Hashtable id;

	public TopicsLookup(DataSource ds) throws Exception, SQLException {

		topic = new String[100];
		id = new Hashtable(100);

		TopicsDA tda = new TopicsDA(ds);
		Vector v = tda.getTopics();
		TopicListBean tlb;

		for (int i = 0; i < v.size(); i++) {
			tlb = (TopicListBean) v.get(i);
			topic[tlb.getId()] = tlb.getTopic();
			//sub[tlb.getId()] = tlb.getSub();
			//id.put(tlb.getSub(), new Counter(tlb.getId()));
		}

	}

	public String topicFromId(int id) {

		return topic[id];

	}

	/**
	  public String subFromId(int id) {
	
	    return sub[id];
	
	  }
	
	  public int idFromSub(String sub) {
	
	    return ((Counter) id.get(sub)).i;
	
	  }
	
	  public String mainFromSub(String sub) {
	
	    return main[idFromSub(sub)];
	
	  }
	  */

}
