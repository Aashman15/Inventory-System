package com.inventorysystem.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
     public static Connection getDb() throws SQLException {
    	 try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorysystemdb", "root", "");
    	 } catch (ClassNotFoundException e) {
			e.getMessage();
		}
		return null;
     }
}
