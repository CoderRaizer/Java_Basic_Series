<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
h1.round2
{
    border: 2px solid MediumSeaGreen;
    border-radius: 5px;
    width:120px;
}


</style>
</head>
<body>

<h1 class="round2">INSERT</h1>
<form action="AccountServlet?task=insert" method="post">

<table>
<tr>
<td>Username
<td><input type="text" name="txtname">
</tr>

<tr>
<td>Password
<td><input type="password" name="txtpassword">
</tr>

<tr>
<td></td>
<td><input type="submit" style="background-color:MediumSeaGreen; border: 1px solid MediumSeaGreen;" value="Insert">
</tr>

</table>
</form>
</body>
</html>