package org.jmanderson.ahs.da;

import java.sql.SQLException;
import java.util.Vector;

import javax.sql.DataSource;

import org.jmanderson.ahs.common.CloverDA;
import org.jmanderson.ahs.dataobjects.TeacherBean;

public class TeachersDA extends CloverDA {
	private static final String selectTeacher = "select lastname, grade " + "from teachers where teacher_id = ?";
	private static final String selectTeachers = "select teacher_id, " + "lastname, grade from teachers order by lastname, grade";

	public TeachersDA(DataSource ds) {
		super(ds);
	}

	public TeacherBean getTeacher(int teacherId) throws Exception, SQLException {

		TeacherBean tb = new TeacherBean();
		tb.setId(teacherId);

		try {
			establishConnection();
			pStmt = dc.prepareStatement(selectTeacher);
			pStmt.setInt(1, teacherId);

			rs = pStmt.executeQuery();

			while (rs.next()) {
				tb.setLastname(rs.getString("lastname"));
				tb.setGrade(rs.getInt("grade"));
			}

		} catch (SQLException e) {
			System.out.println("SQL Error in TeachersDA getTeacher(): " + e);
			throw e;
		} catch (Exception e) {
			System.out.println("Error in TeachersDA getTeacher(): " + e);
			throw e;
		} finally {
			releaseConnection();
		}

		return tb;

	}

	public Vector getTeachers() throws Exception, SQLException {

		Vector v = new Vector(30);
		TeacherBean tb = null;

		try {
			establishConnection();
			pStmt = dc.prepareStatement(selectTeachers);

			rs = pStmt.executeQuery();

			while (rs.next()) {
				tb = new TeacherBean();
				tb.setId(rs.getInt("teacher_id"));
				tb.setLastname(rs.getString("lastname"));
				tb.setGrade(rs.getInt("grade"));
				v.add(tb);
			}

		} catch (SQLException e) {
			System.out.println("SQL Error in TeachersDA getTeachers(): " + e);
			throw e;
		} catch (Exception e) {
			System.out.println("Error in TeachersDA getTeachers(): " + e);
			throw e;
		} finally {
			releaseConnection();
		}

		v.trimToSize();
		return v;

	}

}
