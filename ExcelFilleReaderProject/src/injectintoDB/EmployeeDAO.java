package injectintoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class EmployeeDAO 
{
	static Connection con= null;
	
	public static void insertIntoDB(List<EmployeeBean> empList)
	{
		con=ConnectionUtility.getConnection();
		for(EmployeeBean emp:empList) 
		{
			
		try {
			PreparedStatement ps=con.prepareStatement("insert into excel_employee values (?,?,?,?,?)");
			ps.setInt(1, emp.getEmpId());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getSalary());
			ps.setString(4, emp.getDepartment());
			ps.setString(5, emp.getDesignation());
			
			int n=ps.executeUpdate();
			
			if(n>0)
			{
				System.out.println("data inserted successfully"+ emp.getEmpId());
				}
			else
			{
				System.out.println("Something went wrong...");
				
			}
			
			
		   } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
