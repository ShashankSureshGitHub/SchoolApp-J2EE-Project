<%@page import="java.util.List"%>
<%@page import="com.js.dto.Teacher"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teachers-List</title>
</head>
<body>
<body bgcolor="silver">
	<h2>Student Details</h2>
	<table border="4px" cellSpacing="10px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Qualification</th>
			<th>Salary</th>
			<th>Delete</th>
		</tr>

		<%
		List<Teacher> teachers = (List) request.getAttribute("teacherslist");
		for (Teacher t :  teachers) {
		%>
		<tr>
			<td><%=t.getTid()%></td>
			<td><%=t.getName()%></td>
			<td><%=t.getAge()%></td>
			<td><%=t.getEmail()%></td>
			<td><%=t.getPhone()%></td>
			<td><%=t.getQualification()%></td>
			<td><%=t.getSalary()%></td>
			<td><a href="deleteteacher?id=<%=t.getTid()%>">delete</a></td>  <!-- url rewriting -->	
		</tr>

		<%
		}
		%>

	</table>


</body>
</html>