<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1 style="color:MediumSeaGreen">LOGIN</h1>
<form action= "loginServlet" method="post">
<table>

<tr>
<td>Username
<td><input type="text" name="txtname"><!-- day la bien de dua vao loginServlet de check -->
</tr>

<tr>
<td>Password
<td><input type="password" name="txtpassword"><!-- day la bien de dua vao loginServlet de check -->
</tr>

<tr>
<td></td>
<td><input type="submit" value="Login"></td>
</tr>
</table>
</form>
</body>
</html>