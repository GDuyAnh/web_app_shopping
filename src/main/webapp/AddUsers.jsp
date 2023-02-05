<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
<form action="CheckLoginServlet?mod1=add" method = "post">
		Enter id:<input type="text" name="txtid" /><br /> 
		Enter name:<input type="text" name="txtname" /><br />
		Enter phone:<input type="text" name="txtphone" /><br /> 
		Enter gmail:<input type="text" name="txtgmail" /><br />
		Enter gender:<input type="text" name="txtgender" /><br /> 
		Enter address:<input type="text" name="txtaddress" /><br />
		Enter age:<input type="text" name="txtage" /><br /> 
		Enter admin:<input type="text" name="txtadmin" /><br />
		Enter priceUser:<input type="text" name="txtpriceUser" /><br /> 
		Enter username:<input type="text" name="txtusernameregister" /><br />
		Enter password:<input type="text" name="txtpasswordregister" /><br /> 
		
		
		<input type="submit" value="OK">
	</form>

</body>
</html>