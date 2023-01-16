package com.emp.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static Connection con=null;
	
	public static Connection getConnection()
	{
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/spring_boot_db","postgres","postgres");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
