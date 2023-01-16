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


@WebServlet("/delete")
public class DeleteEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		EmpDao empDao = new EmpDao(DBConnection.getConnection());
		boolean deleteEmployee = empDao.deleteEmployee(id);
		
		HttpSession session = request.getSession();
		
		if(deleteEmployee)
		{
			session.setAttribute("successMsg", "Employee DELETED Successfully !!!");
			response.sendRedirect("index.jsp");
		}
		else
		{
			session.setAttribute("errorMsg", "Something went WRONG...");
			response.sendRedirect("index.jsp");
		}	
	}

}
