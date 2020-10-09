<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Primitive Data</title>
</head>
<body>
	<% 
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	%>
	<h2>Id : ${id}</h2>
	<h2>Name : ${name}</h2>
</body>
</html>