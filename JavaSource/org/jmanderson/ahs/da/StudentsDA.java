package org.jmanderson.ahs.da;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import javax.sql.DataSource;

import org.jmanderson.ahs.common.CheckBoxes;
import org.jmanderson.ahs.common.CloverDA;
import org.jmanderson.ahs.dataobjects.CheckBoxes1;
import org.jmanderson.ahs.dataobjects.CheckBoxes2;
import org.jmanderson.ahs.dataobjects.MiniStudentBean;
import org.jmanderson.ahs.dataobjects.StudentBean;
import org.jmanderson.ahs.dataobjects.TeacherBean;
import org.jmanderson.ahs.util.Counter;
import org.jmanderson.ahs.da.TeachersDA;

public class StudentsDA extends CloverDA {

	public StudentsDA(DataSource ds) {
		super(ds);
	}

	public int getStudentCountAll() throws Exception, SQLException {
		return getStudentCount(null);
	}

	public int getStudentCountFiltered(boolean minorities) throws Exception,
			SQLException {
		if (minorities) {
			return getStudentCount(" where minority = true");
		} else {
			return getStudentCount(" where minority = false");
		}
	}

	private int getStudentCount(String where) throws Exception, SQLException {

		StringBuffer sb = new StringBuffer();
		sb.append("select count(*) from students");
		if (where != null) {
			sb.append(where);
		}
		int count = 0;

		try {
			establishConnection();
			pStmt = dc.prepareStatement(sb.toString());
			rs = pStmt.executeQuery();
			rs.next();
			count = rs.getInt(1);
		} catch (SQLException e) {
			System.out.println("SQL Error in StudentsDA getStudentCount(): "
					+ e);
			throw e;
		} catch (Exception e) {
			System.out.println("Error in StudentsDA getStudentCount(): " + e);
			throw e;
		} finally {
			releaseConnection();
		}

		return count;

	}
	
	// TODO This method is temporary ... get rid of it sometime
	public List getStudentsToFix() throws Exception {
		List students = new ArrayList();
		try {
			establishConnection();
			pStmt = dc.prepareStatement("select student_id from students, teachers where teacher_id = fkteacher_id and grade < 3 order by student_id");
			rs = pStmt.executeQuery();
			while (rs.next()) {
				students.add(new Integer(rs.getInt("student_id")));
			}
		}
		catch (SQLException e) {
			System.out.println("SQL Error in StudentsDA getStudentsToFix(): " + e);
			throw e;
		}
		catch (Exception e) {
			System.out.println("Error in StudentsDA getStudentsToFix(): " + e);
			throw e;
		}
		finally {
			releaseConnection();
		}
		return students;
	}

	public int getStudentCountAll(int teacherId) throws Exception, SQLException {
		return getStudentCount(teacherId, null);
	}

	public int getStudentCountFiltered(int teacherId, boolean minorities)
			throws Exception, SQLException {
		if (minorities) {
			return getStudentCount(teacherId, " and minority = true");
		} else {
			return getStudentCount(teacherId, " and minority = false");
		}
	}

	private int getStudentCount(int teacherId, String where) throws Exception,
			SQLException {

		StringBuffer sb = new StringBuffer();
		sb.append("select count(*) from students where fkteacher_id = ");
		sb.append(teacherId);
		if (where != null) {
			sb.append(where);
		}
		int count = 0;

		if (teacherId > 0) {
			try {
				establishConnection();
				pStmt = dc.prepareStatement(sb.toString());
				rs = pStmt.executeQuery();
				rs.next();
				count = rs.getInt(1);
			} catch (SQLException e) {
				System.out
						.println("SQL Error in StudentsDA getStudentCount(): "
								+ e);
				throw e;
			} catch (Exception e) {
				System.out.println("Error in StudentsDA getStudentCount(): "
						+ e);
				throw e;
			} finally {
				releaseConnection();
			}
		}

		return count;

	}

	public void deleteStudent(int studentId) throws Exception, SQLException {

		String deleteSQL = "delete from students where " + "student_id = "
				+ studentId;

		if (studentId > 0) {
			try {
				establishConnection();
				pStmt = dc.prepareStatement(deleteSQL);
				pStmt.executeUpdate();
			} catch (SQLException e) {
				System.out.println("SQL Error in StudentsDA deleteStudent(): "
						+ e);
				throw e;
			} catch (Exception e) {
				System.out.println("Error in StudentsDA deleteStudent(): " + e);
				throw e;
			} finally {
				releaseConnection();
			}
		}

		return;

	}

	public void updateStudent(StudentBean sb) throws Exception {
		try {
			establishConnection();
			writeEntryForm(sb.getCheckBoxes(), sb.getId(), false);
			writeInterests(sb.getInterestsV(), sb.getId(), false);
		} catch (Exception e) {
			throw e;
		} finally {
			releaseConnection();
		}
	}

	public int writeNewStudent(StudentBean sb) throws Exception, SQLException {

		int studentId = 0;

		try {
			establishConnection();
			studentId = writeStudent(sb);
			writeEntryForm(sb.getCheckBoxes(), studentId);
			writeInterests(sb.getInterestsV(), studentId);
		} catch (Exception e) {
			try {
				if (studentId > 0)
					deleteStudent(studentId);
			} catch (Exception e2) {
			}
			throw e;
		} finally {
			releaseConnection();
		}

		return studentId;

	}

	private void writeEntryForm(CheckBoxes cb, int studentId) throws Exception {
		writeEntryForm(cb, studentId, true);
	}

	private void writeEntryForm(CheckBoxes cb, int studentId, boolean newStudent)
			throws Exception {
		String insertSQL = "insert into checkboxes (fkstudent_id, blob) values (?, ?)";
		String updateSQL = "update checkboxes set blob = ? where fkstudent_id = ?";

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(cb);

		if (newStudent) {
			pStmt = dc.prepareStatement(insertSQL);
			pStmt.setInt(1, studentId);
			pStmt.setBytes(2, baos.toByteArray());
		} else {
			pStmt = dc.prepareStatement(updateSQL);
			pStmt.setBytes(1, baos.toByteArray());
			pStmt.setInt(2, studentId);
		}

		pStmt.executeUpdate();
	}

	private int getGrade(int studentId) throws Exception, SQLException {

		return getGrade(studentId, true);

	}

	private int getGrade(int studentId, boolean release) throws Exception,
			SQLException {

		int grade = 0;
		String SQL = "select grade from students, teachers where student_id = "
				+ studentId + " and teacher_id = fkteacher_id";

		try {
			establishConnection();
			pStmt = dc.prepareStatement(SQL);

			ResultSet rs = pStmt.executeQuery();

			rs.next();

			grade = rs.getInt(1);
		} catch (Exception e) {
		} finally {
			if (release)
				releaseConnection();
		}

		return grade;

	}

	public StudentBean getStudent(int studentId) throws Exception, SQLException {

		StudentBean sb = null;

		sb = new StudentBean();

		sb.setId(studentId);

		try {
			establishConnection();
			readStudent(sb, studentId);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			releaseConnection();
		}

		sb.prepareForTransport();
		return sb;

	}

	public StudentBean getLastStudentEntered() throws SQLException, Exception {
		String SQL;
		String SQLa;
		StudentBean sb = null;

		SQLa = "select max(student_id) from students";
		SQL = "select firstname, students.lastname, fkteacher_id from "
				+ "students where student_id = (select max(student_id) "
				+ "from students";
		try {
			establishConnection();
			pStmt = dc.prepareStatement(SQLa); // WTF ???
			ResultSet rs = pStmt.executeQuery(); // WTF ???
			rs.next(); // WTF ???
			getGrade(rs.getInt(1)); // WTF ???
			sb = new StudentBean();

			pStmt = dc.prepareStatement(SQL);

			rs = pStmt.executeQuery();

			rs.next();

			sb.setFirstname(rs.getString(1));
			sb.setLastname(rs.getString(2));

			TeachersDA tda = new TeachersDA(ds);
			sb.setTb(tda.getTeacher(rs.getInt(3)));

		} catch (SQLException e) {
		} catch (Exception e) {
		} finally {
			releaseConnection();
		}

		return sb;

	}

	public int exists(String lastname, String firstname, int tid)
			throws SQLException {

		String SQL;
		int studentId = -1;

		SQL = "select student_id from students where lastname = '" + lastname
				+ "' and firstname = '" + firstname + "' and "
				+ "fkteacher_id = " + tid;
		try {
			establishConnection();
			pStmt = dc.prepareStatement(SQL);

			ResultSet rs = pStmt.executeQuery();

			if (rs.next()) {
				studentId = rs.getInt("student_id"); // only get here if an id
				// was returned ...
			}
		} catch (SQLException e) {
		} catch (Exception e) {
		} finally {
			releaseConnection();
		}

		return studentId;

	}

	public void readStudent(StudentBean sb, int studentId) throws Exception,
			SQLException {

		String selectSQL = "select firstname, lastname, fkteacher_id from "
				+ "students where student_id = " + studentId;
		TreeMap tm;
		Vector vi;
		Map.Entry me;

		TeacherBean tb;

		pStmt = dc.prepareStatement(selectSQL);

		TeachersDA tda = new TeachersDA(ds);

		ResultSet rs = pStmt.executeQuery();
		rs.next();
		sb.setFirstname(rs.getString(1));
		sb.setLastname(rs.getString(2));
		tb = tda.getTeacher(rs.getInt(3));
		sb.setTb(tb);
		StringBuffer sb2 = new StringBuffer();
		sb2
				.append("select interest, count, checks, max1, max2 from interests, topics where fkstudent_id = ");
		sb2.append(sb.getId()).append(" and interest = topic order by interest");
		pStmt = dc.prepareStatement(sb2.toString());
		ResultSet rs2 = pStmt.executeQuery();
		tm = new TreeMap();
		vi = new Vector();
		Counter counter;
		while (rs2.next()) {
			counter = new Counter(rs2.getInt("count"), rs2.getInt("max1"), rs2.getInt("max2"));
			counter.setChecks(rs2.getInt("checks"));
			tm.put(rs2.getString(1), counter);
		}
		Set set = tm.entrySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			me = (Map.Entry) iter.next();
			vi.add(me);
		}
		sb.setInterests(vi);
		sb2.delete(0, sb2.length());
		sb2.append("select blob from checkboxes where fkstudent_id = ");
		sb2.append(sb.getId());
		pStmt = dc.prepareStatement(sb2.toString());
		ResultSet rs3 = pStmt.executeQuery();
		rs3.next();
		ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(
				rs3.getBytes("blob")));
		CheckBoxes cb = (CheckBoxes) ois.readObject();
		sb.setCheckBoxes(cb);

		return;

	}

	public Vector getStudentsAll(String searchfor) throws Exception,
			SQLException {
		return getStudents(searchfor, null);
	}

	public Vector getStudentsFiltered(String searchfor, boolean minorities)
			throws Exception, SQLException {
		if (minorities) {
			return getStudents(searchfor,
					", students where student_id = fkstudent_id and minority = true");
		} else {
			return getStudents(searchfor,
					", students where student_id = fkstudent_id and minority = false");
		}
	}

	private Vector getStudents(String searchfor, String where)
			throws Exception, SQLException {
		StringBuffer sb = new StringBuffer();
		sb.append("select fkstudent_id, checkboxes from checkboxes");
		if (where != null) {
			sb.append(where);
		}
		Vector v = new Vector();
		CheckBoxes cb;

		try {
			pStmt = dc.prepareStatement(sb.toString());
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				ObjectInputStream ois = new ObjectInputStream(
						new ByteArrayInputStream(rs.getBytes("blob")));
				cb = (CheckBoxes) ois.readObject();
				if (checkSearch(cb, searchfor)) {
					v.add(getStudent(rs.getInt("fkstudent_id")));
				}
			}
		} catch (SQLException se) {
			System.out.println("SQLError in StudentsDA getStudents(): " + se);
			throw se;
		} catch (Exception e) {
			System.out.println("Error in StudentsDA getStudents(): " + e);
			throw e;
		}

		return v;
	}

	private int writeStudent(StudentBean sb) throws Exception, SQLException {

		String selectSQL = "select student_id from students where "
				+ "firstname = '" + sb.getFirstname() + "' and "
				+ "lastname = '" + sb.getLastname() + "' and "
				+ "fkteacher_id = '" + sb.getTeacherId() + "'";
		String insertSQL = "insert into students (lastname, firstname, "
				+ "fkteacher_id) values('" + sb.getLastname() + "', '"
				+ sb.getFirstname() + "', " + sb.getTeacherId() + ")";
		int studentId = 0;

		try {
			pStmt = dc.prepareStatement(insertSQL);

			pStmt.executeUpdate();

			pStmt = dc.prepareStatement(selectSQL);

			rs = pStmt.executeQuery();

			rs.next();
			studentId = rs.getInt(1);

		} catch (SQLException e) {
			System.out.println("SQL Error in StudentsDA writeStudent(): " + e);
			throw e;
		} catch (Exception e) {
			System.out.println("Error in StudentsDA writeStudent(): " + e);
			throw e;
		}

		return studentId;

	}

	private String addComma(StringBuffer sb) {

		return ((sb.length() > 0) ? ", " : "");

	}

	private void writeInterests(Vector intV, int studentId) throws SQLException {
		writeInterests(intV, studentId, true);
	}

	private void writeInterests(Vector intV, int studentId, boolean newStudent)
			throws SQLException {

		Map.Entry me;

		if (!newStudent) {
			pStmt = dc
					.prepareStatement("delete from interests where fkstudent_id = ?");
			pStmt.setInt(1, studentId);
			pStmt.executeUpdate();
		}
		
		StringBuffer sb = new StringBuffer();
		Counter counter;
		for (int i = 0; i < intV.size(); i++) {
			me = (Map.Entry) intV.get(i);
			sb.delete(0, sb.length());
			sb.append("insert into interests (fkstudent_id, interest, count, checks) values (");
			sb.append(studentId).append(", '");
			sb.append((String) me.getKey()).append("', ");
			counter = (Counter) me.getValue();
			sb.append(counter.get()).append(", ");
			sb.append(counter.getChecks()).append(")");
			
			pStmt = dc.prepareStatement(sb.toString());

			pStmt.executeUpdate();
		}

		return;

	}

	public Vector getAllStudentsShortAll(int teacherId, int threshold)
			throws Exception, SQLException {
		return getAllStudentsShort(teacherId, threshold, null);
	}

	public Vector getAllStudentsShortFiltered(int teacherId, int threshold,
			boolean minorities) throws Exception, SQLException {
		if (minorities) {
			return getAllStudentsShort(teacherId, threshold,
					"and minority = true ");
		} else {
			return getAllStudentsShort(teacherId, threshold,
					"and minority = false ");
		}
	}

	private Vector getAllStudentsShort(int teacherId, int threshold,
			String where) throws Exception, SQLException {

		StringBuffer sb = new StringBuffer();
		sb
				.append("select student_id, firstname, lastname from students where fkteacher_id = ");
		sb.append(teacherId).append(' ');
		if (where != null) {
			sb.append(where);
		}
		sb.append("order by lastname, firstname");
		String s;

		Vector v = new Vector();
		Vector vi;
		Map.Entry me;
		TreeMap tm;

		StudentBean sbean;
		TeacherBean tb;

		try {
			establishConnection();

			pStmt = dc.prepareStatement(sb.toString());

			TeachersDA tda = new TeachersDA(ds);

			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				getGrade(rs.getInt(1), false); // WTF ???
				sbean = new StudentBean();
				sbean.setId(rs.getInt(1));
				sbean.setFirstname(rs.getString(2));
				sbean.setLastname(rs.getString(3));
				tb = tda.getTeacher(teacherId);
				sbean.setTb(tb);
				s = "select interest, count from interests where fkstudent_id = "
						+ sbean.getId() + " and count >= '" + threshold + "'";
				pStmt = dc.prepareStatement(s);
				ResultSet rs2 = pStmt.executeQuery();
				tm = new TreeMap();
				vi = new Vector();
				while (rs2.next()) {
					tm.put(rs2.getString(1), new Counter(rs2.getInt(2)));
				}
				Set set = tm.entrySet();
				Iterator iter = set.iterator();
				while (iter.hasNext()) {
					me = (Map.Entry) iter.next();
					vi.add(me);
				}
				sbean.setInterests(vi);
				sbean.prepareForTransport();
				v.add(sbean);
			}

		} catch (SQLException e) {
			System.out
					.println("SQL Error in StudentsDA getAllStudentsShort(): "
							+ e);
			throw e;
		} catch (Exception e) {
			System.out.println("Error in StudentsDA getAllStudentsShort(): "
					+ e);
			throw e;
		} finally {
			releaseConnection();
		}

		v.trimToSize();
		return v;

	}

	private boolean checkSearch(CheckBoxes cb, String searchfor)
			throws Exception {
		if (cb instanceof CheckBoxes1) {
			CheckBoxes1 cb1 = (CheckBoxes1) cb;
			if (searchfor.equals("Dog")) {
				return ((cb1.getAn1())[5]);
			}
		} else if (cb instanceof CheckBoxes2) {
			CheckBoxes2 cb2 = (CheckBoxes2) cb;
			if (searchfor.equals("Dog")) {
				return false;
			}
		}
		return false;
	}

	public MiniStudentBean getMiniStudent(int studentId) throws Exception {
		StringBuffer sb = new StringBuffer();
		sb
				.append("select firstname, lastname, minority, fkteacher_id from students ");
		sb.append("where student_id = ").append(studentId);

		MiniStudentBean msb = new MiniStudentBean();
		try {
			establishConnection();
			pStmt = dc.prepareStatement(sb.toString());
			ResultSet rs = pStmt.executeQuery();
			rs.next();
			msb.setMinority(rs.getBoolean("minority"));
			msb.setStudentFirstname(rs.getString("firstname"));
			msb.setStudentId(studentId);
			msb.setStudentLastname(rs.getString("lastname"));
			msb.setTeacherId(rs.getInt("fkteacher_id"));
		} catch (SQLException e) {
			System.out
					.println("SQLException caught in StudentsDA getMiniStudent: "
							+ e);
			throw e;
		} catch (Exception e) {
			System.out
					.println("Exception caught in StudentsDA getMiniStudent: "
							+ e);
			throw e;
		} finally {
			releaseConnection();
		}
		return msb;
	}

	public List getStudentsForMinorityUpdate(int teacherId) throws Exception,
			SQLException {
		List list = new ArrayList();
		StringBuffer sb = new StringBuffer();
		sb
				.append("select student_id, firstname, lastname, minority from students ");
		sb.append("where fkteacher_id = ").append(teacherId);
		sb.append(" order by lastname, firstname");

		MiniStudentBean msb;
		int id;
		String firstname;
		String lastname;
		boolean minority;
		try {
			establishConnection();
			pStmt = dc.prepareStatement(sb.toString());
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				id = rs.getInt("student_id");
				firstname = rs.getString("firstname");
				lastname = rs.getString("lastname");
				minority = rs.getBoolean("minority");
				msb = new MiniStudentBean(id, lastname, firstname, minority);
				list.add(msb);
			}
		} catch (SQLException e) {
			System.out
					.println("SQLException caught in StudentsDA getStudentsForMinorityUpdate: "
							+ e);
			throw e;
		} catch (Exception e) {
			System.out
					.println("Exception caught in StudentsDA getStudentsForMinorityUpdate: "
							+ e);
			throw e;
		} finally {
			releaseConnection();
		}
		return list;
	}

	public void updateStudent(int id, String firstname, String lastname,
			boolean minority) throws SQLException, Exception {

		try {
			establishConnection();
			pStmt = dc
					.prepareStatement("update students set firstname = ?, lastname = ?, minority = ? where student_id = ?");
			pStmt.setString(1, firstname);
			pStmt.setString(2, lastname);
			pStmt.setBoolean(3, minority);
			pStmt.setInt(4, id);
			pStmt.executeUpdate();
		} catch (SQLException e) {
			System.out
					.println("SQLException caught in StudentsDA updateMinority(): "
							+ e);
			throw e;
		} catch (Exception e) {
			System.out
					.println("Exception caught in StudentsDA updateMinority(): "
							+ e);
			throw e;
		} finally {
			releaseConnection();
		}
	}
}

