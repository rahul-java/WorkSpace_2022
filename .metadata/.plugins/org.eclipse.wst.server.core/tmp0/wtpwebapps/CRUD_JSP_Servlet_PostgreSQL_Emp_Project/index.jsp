<%@page import="com.emp.model.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.emp.connection.DBConnection"%>
<%@page import="com.emp.dao.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="css-js.jsp" %>
</head>
<body class="bg-light"> 
   <%@include file="navbar.jsp" %>


<div class="container p-4">



<div class="card">
  <div class="card-body">
  <h1 class="text-center">Employee Data</h1>
   <!-- Success MSg Error Msg -->
<c:if test="${not empty successMsg}">
  <p class="text-center alert-success" > ${successMsg} </p>
  <c:remove var="successMsg"></c:remove>
</c:if>

<c:if test="${not empty errorMsg}">
  <p class="text-center alert-danger">${errorMsg}</p>
  <c:remove var="errorMsg"></c:remove>
</c:if>
  
<a href="add-emp.jsp" class="btn btn-primary">Add Employee</a>
 

    <div class="row">
      <div class="col-12">
      
     
        <table class="table table-hover">
          <thead>
          <tr>
             <th>Name</th>
             <th>Email</th>
             <th>Address</th>
             <th>Salary</th>
             <th>Designation</th>
             <th>Action</th>
            </tr>
          </thead>
          <tbody>
           <%
      EmpDao dao=new EmpDao(DBConnection.getConnection());
      List<Employee> list=dao.getAllStudent();
      for(Employee emp:list)
      {
      %>
          <tr>
           <th><%=emp.getName() %></th>
           <td><%=emp.getEmail() %> </td>
           <td><%=emp.getaddress() %> </td>
           <td><%=emp.getSalary() %> </td>
           <td><%=emp.getDesignation() %> </td>
           <td>
              <a href="edit-emp.jsp?id=<%=emp.getId() %>" class="btn btn-primary btn-sm">edit</a>
              <a href="delete?id=<%=emp.getId() %>" class="btn btn-danger btn-sm">delete</a>
           </td>
          </tr>
          <%} %>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</div>
</div>
</body>
</html>