package max;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMySQL {

	public static void main(String[] args) {
		
		StudentDAO dao=new StudentDAO();
		//Student s1=dao.getStudent(4);
		//System.out.println(s1.rollNo+"\t"+s1.sName);
		
		Student s2=new Student();
		s2.rollNo=15;
		s2.sName="Nishu";
		dao.getConnection();
		dao.addStudent(s2);

	}

}

class StudentDAO
{
	Connection con=null;
	
	public void getConnection()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahuldb","root","root");
			
		} catch (Exception e) {


			System.out.println(e);
		}
		
	}
	
	public void addStudent(Student s)
	{
		String query="insert into student values(?,?)";
		
		PreparedStatement ps;
		try
		{
			ps = con.prepareStatement(query);
			ps.setInt(1, s.rollNo);
			ps.setString(2, s.sName);
			ps.executeUpdate();
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Student getStudent(int rollNo)
	{
		
		try
		{
			Student s=new Student();
			s.rollNo=rollNo;
			String name="";
			String query="select sname from student where rollno="+rollNo;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahuldb","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			name=rs.getString(1);
			s.sName=name;
			return s;
		} catch (Exception e) 
		{			
			System.out.println(e);
		}
		return null;
	}
}

class Student
{
	int rollNo;
	String sName;
	
}
