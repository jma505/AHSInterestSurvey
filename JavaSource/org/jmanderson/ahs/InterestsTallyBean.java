package org.jmanderson.ahs;

import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import javax.sql.DataSource;

import org.jmanderson.ahs.da.TopicsDA;
import org.jmanderson.ahs.dataobjects.TallyItemBean;
import org.jmanderson.ahs.dataobjects.TopicListBean;
import org.jmanderson.ahs.util.Counter;

/**
 * NOTE: special processing for the small form (tally string with "2"
 *       in the 3rd position) --> any hit in any category results in
 *       only 1 point for that category
 *
 *       Exceptions:
 *         (1) item sa202, if checked, subtracts 1 point from its category
 *         (2) the Media category can have up to 3 points:
 *             (a) 1 point if anything checked me200 through me214
 *             (b) 1 point if anything checked me215 through me222
 *             (c) 1 point if anything checked me223 through me231
 */

public class InterestsTallyBean {

	private TreeMap tallyCounters;
	private Hashtable tallyRules;

	public InterestsTallyBean(DataSource ds) throws Exception, SQLException {

		TopicsDA tda = new TopicsDA(ds);
		Vector v = tda.getMainTopics();

		tallyCounters = new TreeMap();
		TopicListBean tlb;
		String topic;
		int max1, max2;

		for (int i = 0; i < v.size(); i++) {
			tlb = (TopicListBean) v.get(i);
			topic = tlb.getTopic();
			max1 = tda.getMax1(topic);
			max2 = tda.getMax2(topic);
			tallyCounters.put(topic, new Counter(0, max1, max2));
		}

		tallyRules = new Hashtable();
		TallyItemBean tib;
		v = tda.getTallyTopics();

		String stemp = "";
		Vector vtemp = new Vector();
		;

		for (int i = 0; i < v.size(); i++) {
			tib = (TallyItemBean) v.get(i);
			if (stemp.equals(tib.getItem())) {
				vtemp.add(tib);
			} else {
				if (!stemp.equals("")) {
					tallyRules.put(stemp, vtemp);
					vtemp = new Vector();
				}
				stemp = tib.getItem();
				vtemp.add(tib);
			}
		}
		tallyRules.put(stemp, vtemp);

	}

	public void reset() {

		Iterator iter = tallyCounters.values().iterator();
		while (iter.hasNext())
			 ((Counter) iter.next()).reset();

		return;

	}

	public void tally(String s) {

		Vector v;

		try {
			v = (Vector) tallyRules.get(s);
			TallyItemBean tib;
			Counter ctr;
			for (int vi = 0; vi < v.size(); vi++) {
				tib = (TallyItemBean) v.get(vi);
				ctr = (Counter) tallyCounters.get(tib.getTopic());
				ctr.addCheck();
				ctr.add(tib.getPoints());
			}
		} catch (NullPointerException e) {
			System.out.println("InterestsTallyBean.tally(): bad string \"" + s + "\"");
		}

	}

	private int calculateSmallFormPoints(int points, TallyItemBean tib) {
		if (tib.getPoints() == 0) {
			points = 1;
		} else {
			points += tib.getPoints();
		}
		return points;
	}

	public Vector getResults() {

		return getResults(1);

	}

	public void calculateFormPercentages(boolean form1) {
		Map.Entry me;
		Set set = tallyCounters.entrySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			me = (Map.Entry) iter.next();
//			doCalc((String) me.getKey(), (Counter) me.getValue(), form1);
			((Counter) me.getValue()).calculate(form1);
		}
	}
	
	public Vector getResults(int min) {

		Vector v = new Vector(50);
		Map.Entry me;

		Set set = tallyCounters.entrySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			me = (Map.Entry) iter.next();
			if (((Counter) me.getValue()).get() >= min)
				v.add(me);
		}

		v.trimToSize();
		return v;

	}

//	private void doCalc(String category, Counter ctr, boolean form1) {
//		if (category.equals("Animals")) {
//			if (form1) ctr.calculate(9);
//			else ctr.calculate(4);
//		}
//		else if (category.equals("Art")) {
//			if (form1) ctr.calculate(5);
//			else ctr.calculate(2);
//		}
//		else if (category.equals("Athletics/Sports")) {
//			if (form1) ctr.calculate(7);
//			else ctr.calculate(2);
//		}
//		else if (category.equals("Building")) {
//			if (form1) ctr.calculate(5);
//			else ctr.calculate(1);
//		}
//		else if (category.equals("Business")) {
//			if (form1) ctr.calculate(8);
//		}
//		else if (category.equals("Childcare")) {
//			if (form1) ctr.calculate(6);
//			else ctr.calculate(1);
//		}
//		else if (category.equals("Clothing")) {
//			if (form1) ctr.calculate(6);
//			else ctr.calculate(1);
//		}
//		else if (category.equals("Competing")) {
//			if (form1) ctr.calculate(5);
//			else ctr.calculate(1);
//		}
//		else if (category.equals("Crafts")) {
//			if (form1) ctr.calculate(5);
//			else ctr.calculate(1);
//		}
//		else if (category.equals("Food")) {
//			if (form1) ctr.calculate(6);
//			else ctr.calculate(1);
//		}
//		else if (category.equals("Foreign Language")) {
//			if (form1) ctr.calculate(10);
//			else ctr.calculate(2);
//		}
//		else if (category.equals("Games")) {
//			if (form1) ctr.calculate(6);
//			else ctr.calculate(1);
//		}
//		else if (category.equals("History")) {
//			if (form1) ctr.calculate(14);
//			else ctr.calculate(4);
//		}
//		else if (category.equals("Humor")) {
//			if (form1) ctr.calculate(9);
//			else ctr.calculate(1);
//		}
//		else if (category.equals("Law")) {
//			if (form1) ctr.calculate(6);
//			else ctr.calculate(2);
//		}
//		else if (category.equals("Media")) {
//			if (form1) ctr.calculate(14);
//			else ctr.calculate(3);
//		}
//		else if (category.equals("Medicine")) {
//			if (form1) ctr.calculate(5);
//			else ctr.calculate(1);
//		}
//		else if (category.equals("Music")) {
//			if (form1) ctr.calculate(14);
//			else ctr.calculate(4);
//		}
//		else if (category.equals("Nature")) {
//			if (form1) ctr.calculate(6);
//			else ctr.calculate(2);
//		}
//		else if (category.equals("Performing Arts")) {
//			if (form1) ctr.calculate(9);
//			else ctr.calculate(4);
//		}
//		else if (category.equals("Politics")) {
//			if (form1) ctr.calculate(5);
//			else ctr.calculate(2);
//		}
//		else if (category.equals("Problem Solving")) {
//			if (form1) ctr.calculate(6);
//			else ctr.calculate(6);
//		}
//		else if (category.equals("Reading")) {
//			if (form1) ctr.calculate(7);
//			else ctr.calculate(1);
//		}
//		else if (category.equals("Relationships")) {
//			if (form1) ctr.calculate(4);
//			else ctr.calculate(4);
//		}
//		else if (category.equals("School Subjects")) {
//			if (form1) ctr.calculate(11);
//			else ctr.calculate(8);
//		}
//		else if (category.equals("Science")) {
//			if (form1) ctr.calculate(3);
//			else ctr.calculate(6);
//		}
//		else if (category.equals("Social Awareness")) {
//			if (form1) ctr.calculate(10);
//			else ctr.calculate(2);
//		}
//		else if (category.equals("Technology")) {
//			if (form1) ctr.calculate(5);
//			else ctr.calculate(1);
//		}
//		else if (category.equals("Toys")) {
//			if (form1) ctr.calculate(3);
//			else ctr.calculate(3);
//		}
//		else if (category.equals("Travel/Culture")) {
//			if (form1) ctr.calculate(9);
//			else ctr.calculate(1);
//		}
//		else if (category.equals("Vehicles")) {
//			if (form1) ctr.calculate(23);
//			else ctr.calculate(8);
//		}
//		else if (category.equals("Weather")) {
//			if (form1) ctr.calculate(7);
//			else ctr.calculate(3);
//		}
//		else if (category.equals("Writing")) {
//			if (form1) ctr.calculate(6);
//			else ctr.calculate(2);
//		}
//	}
}
