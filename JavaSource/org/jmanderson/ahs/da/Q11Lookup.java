package org.jmanderson.ahs.da;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.jmanderson.ahs.common.CloverDA;

public class Q11Lookup extends CloverDA {

	private String[] q11text;

	public Q11Lookup(DataSource ds) throws Exception, SQLException {

		super(ds);

		q11text = new String[40];

		establishConnection();
		pStmt = dc.prepareStatement("select * from q11text order by q11text_id");

		rs = pStmt.executeQuery();

		while (rs.next()) {
			q11text[rs.getInt(1)] = rs.getString(2);
		}

		releaseConnection();

	}

	public String getText(int id) {

		return q11text[id];

	}

}
