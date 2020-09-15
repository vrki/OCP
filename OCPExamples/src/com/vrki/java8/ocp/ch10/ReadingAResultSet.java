package com.vrki.java8.ocp.ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class ReadingAResultSet {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:derby:zoo";
		
		try (Connection conn = DriverManager.getConnection(url)) {
			
			Statement stmt = conn.createStatement();
//			Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY); // default
			
			Map<Integer, String> idToNameMap = new HashMap<>();
			
			ResultSet rs = stmt.executeQuery("select id, name from species");
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				idToNameMap.put(id, name);
			}
			
			System.out.println(idToNameMap); // {1=African Elephant, 2=Zebra}
		}
	}
}
