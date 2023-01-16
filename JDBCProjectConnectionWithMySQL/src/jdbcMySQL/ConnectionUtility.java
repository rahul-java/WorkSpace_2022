package jdbcMySQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtility 
{
   static Connection con=null;
	
	static
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahuldb","root","root");
			
		} catch (Exception e) 
		{
			System.out.println(e);
		}

	}
	
	public static Connection getConnection()
	{
		return con;
	}

}
