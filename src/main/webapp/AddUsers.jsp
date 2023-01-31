<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
<form action="ManagerServlet?mod=1" method = "post">
		Enter Name:<input type="text" name="txtname" /><br /> 
		Enter id:<input type="text" name="txtid" /><br />
		<input type="submit" value="OK">
	</form>

</body>
</html>