package org.jmanderson.ahs.da;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.sql.DataSource;

import org.jmanderson.ahs.common.CloverDA;
import org.jmanderson.ahs.dataobjects.TallyItemBean;
import org.jmanderson.ahs.dataobjects.TopicListBean;

public class TopicsDA extends CloverDA {

	public TopicsDA(DataSource ds) {
		super(ds);
	}

	public Vector getTopics() throws Exception, SQLException {

		String selectSQL = "select topic_id, topic from topics order by topic";

		Vector v = new Vector(50);
		TopicListBean tb = null;

		try {
			establishConnection();
			pStmt = dc.prepareStatement(selectSQL);

			rs = pStmt.executeQuery();

			while (rs.next()) {
				tb = new TopicListBean();
				tb.setId(rs.getInt("topic_id"));
				tb.setTopic(rs.getString("topic"));
				v.add(tb);
			}

		} catch (SQLException e) {
			System.out.println("SQL Error in TopicsDA getTopics(): " + e);
			throw e;
		} catch (Exception e) {
			System.out.println("Error in TopicsDA getTopics(): " + e);
			throw e;
		} finally {
			releaseConnection();
		}

		v.trimToSize();
		return v;

	}

	public Vector getMainTopics() throws Exception, SQLException {

		String selectSQL = "select topic_id, topic from topics order by topic";

		Vector v = new Vector(50);
		TopicListBean tb = null;

		try {
			establishConnection();
			pStmt = dc.prepareStatement(selectSQL);

			rs = pStmt.executeQuery();

			while (rs.next()) {
				tb = new TopicListBean();
				tb.setId(rs.getInt("topic_id"));
				tb.setTopic(rs.getString("topic"));
				v.add(tb);
			}

		} catch (SQLException e) {
			System.out.println("SQL Error in TopicsDA getMainTopics(): " + e);
			throw e;
		} catch (Exception e) {
			System.out.println("Error in TopicsDA getMainTopics(): " + e);
			throw e;
		} finally {
			releaseConnection();
		}

		v.trimToSize();
		return v;

	}

	public Vector getTallyTopics() throws Exception, SQLException {

		String selectSQL = "select item, topic, points from tallytopics order by item";

		Vector v = new Vector(150);
		TallyItemBean tb = null;

		try {
			establishConnection();
			pStmt = dc.prepareStatement(selectSQL);

			rs = pStmt.executeQuery();

			while (rs.next()) {
				tb = new TallyItemBean();
				tb.setItem(rs.getString("item"));
				tb.setTopic(rs.getString("topic"));
				tb.setPoints(rs.getInt("points"));
				v.add(tb);
			}

		} catch (SQLException e) {
			System.out.println("SQL Error in TopicsDA getTallyTopics(): " + e);
			throw e;
		} catch (Exception e) {
			System.out.println("Error in TopicsDA getTallyTopics(): " + e);
			throw e;
		} finally {
			releaseConnection();
		}

		v.trimToSize();
		return v;

	}

	public int getMax1(String topic) throws Exception,	SQLException {

		String SQL = "select max1 from topics where topic = '" + topic + "'";
		int max = 99;

		try {
			establishConnection();
			pStmt = dc.prepareStatement(SQL);

			ResultSet rs = pStmt.executeQuery();

			rs.next();

			max = rs.getInt(1);
		} catch (Exception e) {
		} finally {
			releaseConnection();
		}

		return max;

	}

	public int getMax2(String topic) throws Exception,	SQLException {

		String SQL = "select max2 from topics where topic = '" + topic + "'";
		int max = 99;

		try {
			establishConnection();
			pStmt = dc.prepareStatement(SQL);

			ResultSet rs = pStmt.executeQuery();

			rs.next();

			max = rs.getInt(1);
		} catch (Exception e) {
		} finally {
			releaseConnection();
		}

		return max;

	}

}
