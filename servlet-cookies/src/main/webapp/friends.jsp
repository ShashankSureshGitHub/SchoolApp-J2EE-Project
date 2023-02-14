<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>friends</title>
</head>
<body>
	<%
	Cookie[] c = request.getCookies();
	for (int i = 0; i < c.length; i++) {
		if (c[i].getName().equals("a")) {
	%>
	<h1>Welcome to friends page</h1>
	<%
	}
	}
	%>

</body>
</html>