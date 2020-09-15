package com.vrki.java8.ocp.ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstDatabaseConnection {
	
	public static void main(String[] args) throws SQLException {
	
		String url = "jdbc:derby:zoo";
		// String url2 = "jdbc:derby://localhost:1527/zoo";
		
		try (Connection conn = DriverManager.getConnection(url);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select name from animal")) {
			while (rs.next())
				System.out.println(rs.getString(1));
		}
	}
}
