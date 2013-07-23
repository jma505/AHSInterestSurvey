package org.jmanderson.ahs.da;

/**
 * Updated for 2002-2003
 */

import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.jmanderson.ahs.common.CloverDA;

public class UsersDA extends CloverDA {

	private static final String selectSQL = "select user_password, user_security_level from users where user_name = ?";

	public UsersDA(DataSource ds) {
		super(ds);
	}

	public Properties getUser(String username) throws Exception, SQLException {

		Properties props = new Properties();

		try {
			establishConnection();
			pStmt = dc.prepareStatement(selectSQL);
			pStmt.setString(1, username);

			rs = pStmt.executeQuery();

			while (rs.next()) {
				props.setProperty("password", rs.getString("user_password"));
				props.setProperty("security_level", rs
						.getString("user_security_level"));
				//				props.setProperty("user_teacher",
				// rs.getString("user_teacher"));
			}

		} catch (SQLException e) {
			System.out.println("SQL Error in UsersDA getUser(): " + e);
			throw e;
		} catch (Exception e) {
			System.out.println("Error in UsersDA getUser(): " + e);
			throw e;
		} finally {
			releaseConnection();
		}

		return props;

	}

}