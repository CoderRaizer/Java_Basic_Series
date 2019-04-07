<%@page import="entities.Account"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<style>
	a:link{
    color: blue;
    background-color: transparent;
    text-decoration: none;
}


p.round2 {
    border: 1px solid Tomato;
    border-radius: 8px;
    width:140px;
}

table,th,td
{
	border: 1px solid Tomato;
	align:center;
}
th,td
{
	padding: 1px;text-align: center;
}
table
{
	width: 500px;
}
	</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>learncode.com</title>
</head>
<body>
<form>
<table>

View page
<p class="round2"> <%=request.getAttribute("thongbao") %></p>
<tr>
	<th>Account</th>
	<th>Password</th>
</tr>


	<%
		ArrayList list = (ArrayList) session.getAttribute("accountList");
		for (Object a : list)
		{
		Account acc = (Account) a;
	%>

	<tr>
		<td><%=acc.getUsername()%></td>
		<td><%=acc.getPassword()%></td>
	</tr>

	<%}%>
		
		
</table>
</form>
</body>
</html>