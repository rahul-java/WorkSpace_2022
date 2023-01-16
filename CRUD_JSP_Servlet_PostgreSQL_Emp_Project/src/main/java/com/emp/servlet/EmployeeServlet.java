package com.emp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.emp.connection.DBConnection;
import com.emp.dao.EmpDao;
import com.emp.model.Employee;


@WebServlet("/saveEmp")
public class EmployeeServlet extends HttpServlet {
	
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		Double salary = Double.parseDouble(request.getParameter("salary"));
		String designation = request.getParameter("designation");
		
		Employee employee=new Employee(name,email,address,salary,designation);
		EmpDao empDao = new EmpDao(DBConnection.getConnection());
		boolean saveEmployee = empDao.saveEmployee(employee);
		
		HttpSession session = request.getSession();
		
		if(saveEmployee)
		{
			session.setAttribute("successMsg", "Employee Added Successfully !!!");
			response.sendRedirect("index.jsp");
		}
		else
		{
			session.setAttribute("errorMsg", "Something went WRONG...");
			response.sendRedirect("index.jsp");
		}	
			
	}

}
