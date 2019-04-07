<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
h2.round2
{
    border: 2px solid MediumSeaGreen;
    border-radius: 3px;
    width:120px;
}
</style>
</head>
<body>
<h2 class="round2">UPDATE</h2>
<form action="AccountServlet?task=update" method="post">

<table>
<tr>
<td>Username
<td><input type="text" name="txtname" value="<%=request.getParameter("username") %>">
</tr>

<tr>
<td>Password
<td><input type="password" name="txtpassword" value="<%=request.getParameter("password") %>">

</tr>

<tr>
<td></td>
<td><input type="submit" value="Update" style="background-color:Tomato;">
</tr>

</table>
</form>
</body>
</html>