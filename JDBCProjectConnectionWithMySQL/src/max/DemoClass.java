package max;

import java.sql.DriverManager;

public class DemoClass {

	public static void main(String[] args) throws Exception 
	{
		
		   //Pqr obj=new Pqr();
		
		
			Class.forName("max.Pqr");
			//Class.forName("max.Pqr").newInstance();
		
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			Class.forName("com.mysql.cj.jdbc.Driver");
	
	}
	
}
class Pqr
{
	static
	{
		System.out.println("in static block...");
	}
	{
		System.out.println("in instance block...");
	}
}
