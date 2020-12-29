<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2> Registration Form </h2>

<form method="post" action="Register">

		Enter UserName: <input type="text" name="uname" required> <br/> <br/>
		Enter UserEmail: <input type="email" name="uemail" required> <br/> <br/>
		Enter UserPassword: <input type="password" name="upassword" required> <br/> <br/>
		Enter UserCity: <input type="text" name="ucity" required> <br/> <br/>

<button type="submit"> Register </button>   <br/> <br/>   <br/> <br/>

<p> <b>Already Registered then Login </b></p>
<button> <a href="Login.jsp"> Login </a></button>
</form>
</body>
</html>