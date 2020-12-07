package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConn {

	private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/cdac";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "root";
	private Connection con;
	public Connection getConn() throws ClassNotFoundException, SQLException {
		if(con == null || con.isClosed()) {
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		}
		return con;
	}
}
