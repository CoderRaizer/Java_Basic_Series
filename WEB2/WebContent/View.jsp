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

table,th,td
{
	border: 1px solid Tomato;
}
th,td
{
	padding: 3px;text-align: left;
}
table#t01
{
	width: 100%;background-color: #f1f1c1;
}
table#t01 tr:nth-child(even)
{
    background-color: #ccc;
}
table#t01 tr:nth-child(odd)
{
   background-color:#fff;
}
table#t01 th
{
    background-color: Red;
    color: Tomato;
}




.city
{
    background-color: MediumSeaGreen;
    color: black;
    padding: 1px;
}
	</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>learncode.com</title>
</head>
<body style="background-image:url('D://cloud1.jpg');" align="center">
View page
<p style="color: Tomato;"align="left"> <%=request.getAttribute("thongbao") %></p>


	<h3 style="background-color: DodgerBlue;">Hello-Wellcome Website</h3>
	<p style="background-color: Tomato">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat</p>
	<p style="color: Black;" align="left">My name Duy Khanh</p>

<h4 style="border:1px solid Tomato;" align="left">Are you sure lean Coding?</h4>
<h4 style="border:1px solid DodgerBlue;" align="left">Don't Worry!!</h4>
<h4 style="border:1px solid Violet;" align="left">This is website best for Code!!</h4>
<h4 style="background-color:rgb(249,246,71);" align="left"> Enter coding anywhere you want! donate for you up to new level and we believe it will helpful with you </h4>
<p align="left">If you have any question about code or programing, please check link:</p>

<form align="left">
	<a href="http://stackoverflow.com" align="left">stackoverflow.com</a>
	<img src="D://vongxoay.gif" alt="Ahihi" width="80" height="40">
</form>
<!--table-->
<table style="width: 50%" border="1px" align="left" width="100" height="100">
	<caption><DETAILS>Detail Courser</DETAILS></caption>
	<tr>
		<th>name Couser learn</th>
		<th>Date Start</th>
		<th>lecturers</th>
	</tr>

	<tr>
		<td>C++</td>
		<td>11/11/2017</td>
		<td>Jill Smith</td>
	</tr>
	<tr>
		<td>Java Basic</td>
		<td>15/11/2017</td>
		<td>John David</td>
	</tr>
	<tr>
		<td>SQL Server</td>
		<td>20/11/2017</td>
		<td>Eve Jackin</td>
	</tr>
	<tr>
		<td>PHP development</td>
		<td>19/11/2017</td>
		<td>Donal Alide</td>
	</tr>
	<tr>
		<td>WorldPress</td>
		<td>05/12/2017</td>
		<td>Danil Voltrol</td>
	</tr>

</table>
<br>
<br><br><br><br><br><br><br><br><br>



<h2 class="city">London</h2>
<p>London is the capital of England.</p>

<h2 class="city">Paris</h2>
<p>Paris is the capital of France.</p>

<h2 class="city">Tokyo</h2>
<p>Tokyo is the capital of Japan.</p>





</body>
</html>