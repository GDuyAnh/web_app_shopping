<%@page import="bean.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ManagerServlet?mod=2" method = "post">
<table>

<%
	List<User> users = (List<User>)request.getSession().getAttribute("users");
	if(users != null){
%>
		<tr>
    		<th>id</th>
    		<th>name</th>
    		<th>del</th>
  		</tr>
<%
		for(int i = 0 ; i<users.size(); i++){
%>
		
  		<tr>
			<td><%= users.get(i).getId()%></td>
			<td><%= users.get(i).getName()%></td>
			<td><input type = "checkbox" name = "selected" value = "<%= users.get(i).getId()%>"></input></td>
		</tr>	
		
		
			
<%
		}
	}else{
	}

%>

<a href = "home.jsp"> <input type = "text" > </input></a>

<a href = "AddUsers.jsp" >Add User</a>
<input type="submit" value="Delete User" />

</table>
</form>

</body>
</html>