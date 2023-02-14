<%@page import="com.js.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="silver">
	<%
	Student s = (Student) request.getAttribute("updatestu");
	%>
	<h2>Update Student Details</h2>
	<form action="ups">
		Id:<input type="text" name="id" readonly="readonly"
			value="<%=s.getId()%>"><br> <br> Name:<input
			type="text" name="name" value="<%=s.getName()%>"><br> <br>Age:<input
			type="number" name="age" value="<%=s.getAge()%>"><br> <br>
		Email:<input type="email" name="email" value="<%=s.getEmail()%>"><br>
		<br> Phone:<input type="number" name="phone"
			value="<%=s.getPhone()%>"> <br> <br> <input
			type="submit" value="Update">
	</form>
</body>
</html>