<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="CheckLoginServlet?mod1=login" method = "post">
		User:<input type="text" name="txtusername" /><br /> 
		PassWord:<input type="password" name="txtpassword" /><br />
		<input type="submit" value="OK">
		
</form>
<a class="dropdown-item" href="AddUsers.jsp">Register</a></li>

</body>
</html>