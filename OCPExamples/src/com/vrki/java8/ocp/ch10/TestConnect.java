package com.vrki.java8.ocp.ch10;

import java.sql.*;

public class TestConnect {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
		System.out.println(conn);
	}
}
