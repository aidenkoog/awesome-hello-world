<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Hello</title>
</head>
<body>
	<p>Hello World! AidenKooG!</p>

	<%
	out.println("Hello World! AidenKooG!");
	%>
	Current Time:
	<%=new java.util.Date()%>
</body>
</html>

