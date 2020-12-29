<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>
		Welcome <b><%=session.getAttribute("username")%> </b>
		
	</h2> 

	<h2>Dashboard</h2>
	<br/> <br/> <br/>
	

	<button type="submit"> <a href="Login.jsp">Logout</a></button>

</body>
</html>