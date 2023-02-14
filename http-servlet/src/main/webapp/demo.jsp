<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>demo jsp</title>
</head>
<body>
	<!-- JSP is used to create dynamic web pages----->
	<%!String s = "Shank";%>
	<!--declaration tag----similar to declaration in java---->
	<%!int a = 10;
	int b = 20;%>

	<%!Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();%> <!-- Should give input in console only -->

	<h1><%=s%></h1>
	<!--Expression tag-----Used to print the value in the variable----similar to System.out.println statement--->
	<h1><%=a + b%></h1>
	<h1><%=s1%></h1>
</body>
</html>