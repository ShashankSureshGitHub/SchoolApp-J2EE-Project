<%@page import="com.js.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students-List</title>
</head>
<body bgcolor="silver">
	<h2>Student Details</h2>
	<table border="4px" cellSpacing="10px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>

		<%
		List<Student> students = (List) request.getAttribute("list");
		for (Student s : students) {
		%>
		<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getName()%></td>
			<td><%=s.getAge()%></td>
			<td><%=s.getEmail()%></td>
			<td><%=s.getPhone()%></td>
			<td><a href="delete?id=<%=s.getId()%>">delete</a></td>
			<!-- url rewriting -->
			<td><a href="update?id=<%=s.getId()%>">update</a></td>


		</tr>

		<%
		}
		%>

	</table>

</body>
</html>