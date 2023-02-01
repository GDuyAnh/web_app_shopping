<%@page import="bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete User</title>
</head>
<body>
<form action="" method = "post">
	  <% User user = (User)request.getSession().getAttribute("user"); %>
		id       :   <%=user.getId() %><br />
		name     :   <%=user.getName() %><br />
		phone    :   <%=user.getPhone() %><br />
		gmail    :   <%=user.getGmail() %><br />
		gender   :   <%=user.isGender() %><br />
		address  :   <%=user.getAddress() %><br />
		age      :   <%=user.getAge() %><br />
		admin    :   <%=user.isAdmin() %><br />
		priceUser:   <%=user.getPriceUser() %><br />
		username :   <%=user.getUserName() %><br />
		password :   <%=user.getUserPassword() %><br />
		
		</form>

</body>
</html>