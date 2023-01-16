<%@page import="com.emp.connection.DBConnection"%>
<%@page import="com.emp.dao.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div class="row">
<div class="col-6 offset-3">
<div class="card">
  <div class="card-body">

      <h1 class="text-center">ADD Employee</h1>
		 <form action="saveEmp" method="post">
		    <div class="mb-3">
				<label class="form-label">Name</label> 
				  <input type="text" class="form-control" name="name">
			</div>
			<div class="mb-3">
				<label  class="form-label">Email address</label> 
				  <input type="email" class="form-control" name="email">
			</div>
			<div class="mb-3">
				<label class="form-label">Address</label> 
				  <input type="text" class="form-control" name="address">
			</div>
			<div class="mb-3">
				<label  class="form-label">Salary</label> 
				  <input type="text" class="form-control" name="salary">
			</div>
			<div class="mb-3">
				<label class="form-label">Designation</label> 
				  <input type="text" class="form-control" name="designation">
			</div>
			
							
			<button type="submit" class="btn btn-primary col-12">Submit</button>
		</form>
	</div>
    </div>
  </div>
</div>
</div>
</body>
</html>