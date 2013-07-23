package org.jmanderson.ahs.da;

import java.sql.SQLException;
import java.util.Vector;

import javax.sql.DataSource;

import org.jmanderson.ahs.common.CloverDA;
import org.jmanderson.ahs.dataobjects.InterestBean;
import org.jmanderson.ahs.dataobjects.MiniInterestBean;
import org.jmanderson.ahs.dataobjects.MiniStudentBean;

public class InterestsDA extends CloverDA {

	public InterestsDA(DataSource ds) {
		super(ds);
	}

	public Vector getInterestDetails(int topicId) throws Exception,
			SQLException {
		return getInterestDetails(topicId, 2, null);
	}

	public Vector getInterestDetails(int topicId, int threshold)
			throws Exception {
		return getInterestDetails(topicId, threshold, null);
	}

	public Vector getInterestDetailsFiltered(int topicId, boolean minorities)
			throws Exception {
		if (minorities) {
			return getInterestDetails(topicId, 2, " and a.minority = true");
		} else {
			return getInterestDetails(topicId, 2, " and a.minority = false");
		}
	}

	public Vector getInterestDetailsFiltered(int topicId, int threshold,
			boolean minorities) throws Exception {
		if (minorities) {
			return getInterestDetails(topicId, threshold,
					" and a.minority = true");
		} else {
			return getInterestDetails(topicId, threshold,
					" and a.minority = false");
		}
	}

	public Vector getInterestDetails(int topicId, int threshold, String where)
			throws Exception, SQLException {

		StringBuffer sb = new StringBuffer();
		sb
				.append("select a.student_id, a.lastname, a.firstname, c.count, b.lastname, ");
		sb
				.append("b.grade from students as a, teachers as b, interests as c where c.interest = ");
		sb.append("(select topic from topics where topic_id = ")
				.append(topicId);
		sb.append(") and c.count >= ").append(threshold);
		sb
				.append(" and a.student_id = c.fkstudent_id and b.teacher_id = a.fkteacher_id ");
		if (where != null) {
			sb.append(where);
		}
		sb.append(" order by b.grade, a.lastname, a.firstname, b.lastname");

		Vector v = new Vector();
		MiniStudentBean msb = null;

		try {
			establishConnection();
			pStmt = dc.prepareStatement(sb.toString());

			rs = pStmt.executeQuery();

			while (rs.next()) {
				msb = new MiniStudentBean(rs.getInt(1), rs.getString(2), rs
						.getString(3), rs.getInt(4), rs.getString(5), rs
						.getInt(6));
				v.add(msb);
			}
		} catch (SQLException e) {
			System.out
					.println("SQL Error in InterestsDA getInterestDetails(): "
							+ e);
			throw e;
		} catch (Exception e) {
			System.out.println("Error in InterestsDA getInterestDetails(): "
					+ e);
			throw e;
		} finally {
			releaseConnection();
		}

		v.trimToSize();
		return v;

	}

	public Vector getAllCounts() throws Exception, SQLException {
		return getAllCounts(2, null);
	}

	public Vector getAllCounts(int threshold) throws Exception {
		return getAllCounts(threshold, null);
	}

	public Vector getAllCountsFiltered(boolean minority) throws Exception {
		if (minority) {
			return getAllCounts(2, "and minority = true");
		} else {
			return getAllCounts(2, "and minority = false");
		}
	}

	public Vector getAllCountsFiltered(int threshold, boolean minority)
			throws Exception {
		if (minority) {
			return getAllCounts(threshold, "and minority = true");
		} else {
			return getAllCounts(threshold, "and minority = false");
		}
	}

	public Vector getAllCounts(int threshold, String where) throws Exception,
			SQLException {

		StringBuffer sb = new StringBuffer();
		sb.append("select interest, count(interest), topic_id ");
		sb.append("from interests, topics, students where count >= ");
		sb.append(threshold).append(
				" and topic = interest and student_id = fkstudent_id ");
		if (where != null) {
			sb.append(where);
		}
		sb.append(" group by interest, topic_id, topic order by interest");

		Vector v = new Vector();
		MiniInterestBean mib = null;

		try {
			establishConnection();
			pStmt = dc.prepareStatement(sb.toString());

			rs = pStmt.executeQuery();

			while (rs.next()) {
				mib = new MiniInterestBean(rs.getString(1), rs.getInt(2), rs
						.getInt(3));
				v.add(mib);
			}
		} catch (SQLException e) {
			System.out.println("SQL Error in InterestsDA getAllCounts(): " + e);
			throw e;
		} catch (Exception e) {
			System.out.println("Error in InterestsDA getAllCounts(): " + e);
			throw e;
		} finally {
			releaseConnection();
		}

		v.trimToSize();
		return v;

	}

	public Vector getInterestsAll(int teacherId) throws Exception, SQLException {
		return getInterests(teacherId, 2, null);
	}

	public Vector getInterestsAll(int teacherId, int threshold)
			throws Exception {
		return getInterests(teacherId, threshold, null);
	}

	public Vector getInterestsFiltered(int teacherId, boolean minorities)
			throws Exception {
		if (minorities) {
			return getInterests(teacherId, 2, " and minority = true ");
		} else {
			return getInterests(teacherId, 2, " and minority = false ");
		}
	}

	public Vector getInterestsFiltered(int teacherId, int threshold,
			boolean minorities) throws Exception {
		if (minorities) {
			return getInterests(teacherId, threshold, " and minority = true ");
		} else {
			return getInterests(teacherId, threshold, " and minority = false ");
		}
	}

	public Vector getInterests(int teacherId, int threshold, String where)
			throws Exception, SQLException {

		StringBuffer sb = new StringBuffer();
		sb.append("select interest, count, fkstudent_id, lastname, firstname ");
		sb
				.append("from interests, students where student_id = fkstudent_id and ");
		sb.append("fkteacher_id = ").append(teacherId);
		sb.append(" and count >= ").append(threshold);
		if (where != null) {
			sb.append(where);
		}
		sb.append(" order by interest, count desc, lastname, firstname");

		Vector v = new Vector();
		InterestBean ib = null;
		String currentInterest = "";

		try {
			establishConnection();
			pStmt = dc.prepareStatement(sb.toString());

			rs = pStmt.executeQuery();

			while (rs.next()) {
				if (!currentInterest.equals(rs.getString(1))) {
					if (!currentInterest.equals(""))
						v.add(ib);
					ib = new InterestBean();
					ib.setInterestName(rs.getString(1));
					currentInterest = rs.getString(1);
				}
				ib.addStudent(rs.getInt(3), rs.getString(4), rs.getString(5),
						rs.getInt(2));
			}
			if (!currentInterest.equals(""))
				v.add(ib);

		} catch (SQLException e) {
			System.out.println("SQL Error in InterestsDA getInterests(): " + e);
			throw e;
		} catch (Exception e) {
			System.out.println("Error in InterestsDA getInterests(): " + e);
			throw e;
		} finally {
			releaseConnection();
		}

		v.trimToSize();
		return v;

	}

}

