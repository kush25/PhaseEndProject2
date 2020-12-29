<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@page import="com.servlets.Register" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2> Registered Successfully</h2>
<h2> <%= session.getAttribute("username") %></h2>

<a href="Login.jsp"><b> Registered- Now you can Log in </b> </a>
</body>
</html>