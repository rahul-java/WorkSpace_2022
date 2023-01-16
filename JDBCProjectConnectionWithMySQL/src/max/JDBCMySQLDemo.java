package max;

import java.sql.*;

public class JDBCMySQLDemo {

	public static void main(String[] args) throws Exception 
	{
		String url="jdbc:mysql://localhost:3306/rahuldb";
		String uname="root";
		String pass="root";
		
		int rollNo=101;
		String sName="Jerry";
		
		//String query="insert into student values (5,'Mohini')";    //String query="select * from student";
		String query="insert into student values (?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");   //video on class.forname work
		//Class.forName("com.mysql.jdbc.Driver");    //old driver syntax
		Connection con=DriverManager.getConnection(url,uname,pass);
		//Statement st=con.createStatement();
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, rollNo);
		st.setString(2, sName);
		//ResultSet rs= st.executeQuery(query);
		int count=st.executeUpdate();    //int count=st.executeUpdate(query);

		/*
		 * while(rs.next()) { String name=rs.getString("sname"); //rs.getString(1);
		 * String rollno=rs.getString("rollno"); //rs.getString(2);
		 * 
		 * System.out.println(rollno+":\t"+name); }
		 */
		System.out.println("Rows affected : "+count);
		st.close();
		con.close();
		
	}

}
