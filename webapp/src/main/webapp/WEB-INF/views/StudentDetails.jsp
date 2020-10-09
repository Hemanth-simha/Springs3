<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.jspiders.webapp.first.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Student Details</title>
</head>
<body>
	<%
		Student std = (Student) request.getAttribute("student");
		out.println("Student Details : "+std);
	%>
</body>
</html>