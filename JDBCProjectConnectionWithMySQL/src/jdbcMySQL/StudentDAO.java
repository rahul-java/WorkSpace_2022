package jdbcMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO 
{
	public int addStudent(Student s)
	{		
		try
		{
			Connection con=ConnectionUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
			ps.setInt(1, s.rollNo);
			ps.setString(2, s.sName);
			int i=ps.executeUpdate();
			if(i>0) 
			{
				return i;
			}
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public Student getStudent(int rollNo)
	{
		
		try
		{
			Student s=new Student();
			s.rollNo=rollNo;
			String name="";
			Connection con=ConnectionUtility.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select sname from student where rollno="+rollNo);
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
	
	public void getAllStudent()
	{
		try
		{
		Connection con=ConnectionUtility.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		}
		}
		catch (Exception e) 
		{
	     System.out.println(e);
		}
	}
}

