package com.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.emp.connection.DBConnection;
import com.emp.model.Employee;

public class EmpDao {

	Connection con=null;
	
	public EmpDao(Connection con) {
		super();
		this.con=con;
	}
	
	public boolean saveEmployee(Employee employee)
	{
		boolean f=false;
		
		try {
			String sql="insert into emp_crud (name,email,address,salary,designation) values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getEmail());
			ps.setString(3, employee.getaddress());
			ps.setDouble(4, employee.getSalary());
			ps.setString(5, employee.getDesignation());
			
			int i = ps.executeUpdate();
			if(i>0)
			{
				f=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	 return f;	
	}
	
	public boolean updateEmployee(Employee employee)
	{
		boolean f=false;
		System.out.println("@@@@@@@@@@@@@@@@@@@@@"+employee);
		try {
			String sql="update emp_crud set name=?,email=?,address=?,salary=?,designation=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getEmail());
			ps.setString(3, employee.getaddress());
			ps.setDouble(4, employee.getSalary());
			ps.setString(5, employee.getDesignation());
			ps.setInt(6, employee.getId());
			int i = ps.executeUpdate();
			if(i>0)
			{
				f=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public List<Employee> getAllStudent()
	{
		List<Employee> list=new ArrayList<>();
		Employee emp=null;
		try {
			String sql="select * from emp_crud";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				emp=new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setEmail(rs.getString("email"));
				emp.setaddress(rs.getString("address"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setDesignation(rs.getString("designation"));
				
				list.add(emp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	public Employee getEmployeeById(int id)
	{
		Employee emp=new Employee();;
		try {
			String sql="select * from emp_crud where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setEmail(rs.getString("email"));
				emp.setaddress(rs.getString("address"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setDesignation(rs.getString("designation"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("===================="+emp);
		return emp;
	}
	
	public boolean deleteEmployee(int id)
	{
		boolean f=false;
		try {
			String sql="delete from emp_crud where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if(i>0)
			{
				f=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
}
