<%@page import="com.sun.org.apache.bcel.internal.generic.ACONST_NULL"%>
<%@page import="entities.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.ProductModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MYWEB</title>
<style>
.tb {
	width: 60%;
	border: 3px solid green;
	text-align: center;
	line: 1px;
	background-color: white;
	color: tomato;
}
</style>
</head>
<body>

	WEB BANG HANG

	<table class="tb" border="1">

		<tr>
			<th>MA DM</th>
			<th>MA SP</th>
			<th>TEN SP</th>
			<th>GIA</th>
			<th>HINH ANH</th>
			<th>ACTION</th>
			<th>ACTION</th>
		</tr>
		<%
			ProductModel promodel = new ProductModel();
		%>
		<c:forEach var="p" items="<%=promodel.getList()%>">

			<tr>
				<td>${p.madm}</td>
				<td>${p.masp}</td>
				<td>${p.tensp}</td>
				<td>${p.gia}</td>
				<td><img src="images/${p.hinh}" height="150px" width="120px" /></td>
				<td><a href="CartServlet?action=add&masp=${p.masp}">Add Cart</a></td>
				<td><a href="update.jsp?madm=${p.madm}">TEST</a></td>
			</tr>
		</c:forEach>
	</table>
	<td><a href="Insert.jsp">INSERT</a></td>
</body>
</html>