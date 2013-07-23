package org.jmanderson.ahs.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public abstract class CloverDA {

	protected ResultSet rs;
	protected PreparedStatement pStmt;
	protected DataSource ds;
	protected Connection dc;

	public CloverDA(DataSource ds) {
		this.ds = ds;
		dc = null;
	}

	public Connection getConnection() {
		return dc;
	}

	public void establishConnection() throws SQLException {
		if (dc == null) {
			dc = ds.getConnection();
		}
	}

	public void releaseConnection() throws SQLException {
		if (dc != null) {
			dc.close();
			dc = null;
		}
	}
}
