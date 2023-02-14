<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ArraysInJSP</title>
</head>
<body>
	<%!int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };%>
	<!-- Declaration tag -->
	<%
	for (int i = 0; i < array.length; i++) {
	%>
	<!-- --Scriplet tag works like a method block as in java -->
	<h1><%=array[i]%></h1>
	<%
	}
	%>
</body>
</html>