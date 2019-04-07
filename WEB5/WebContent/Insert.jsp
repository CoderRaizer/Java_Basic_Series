<%@page import="java.util.ArrayList"%>
<%@page import="model.DanhmucModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
h2.round2
{
    border: 2px solid MediumSeaGreen;
    border-radius: 5px;
    width:120px;
}


</style>
</head>
<body>
	<h2 class="round2">INSERT</h2>
	<form enctype="multipart/form-data" action="ProductServlet?action=add"method="post">
	<table>
	<tr>
		<td>MASP </td>
		<td><input type="text" name="txtmasp"></td>
	</tr>
		<tr>
		<td>TEN SP </td>
		<td><input type="text" name="txttensp"></td>
	</tr>
		<tr>
		<td>GIA </td>
		<td><input type="text" name="txtgia"></td>
	</tr>
		<tr>
		<td>HINH </td>
		<td><input type="file" name="filehinh"></td>
	</tr>
		<tr>
		<td>MA DM </td>
		<td>
		<%
			ArrayList list = new DanhmucModel().getList();
		%>
		<select name="madm">
			<c:forEach var="dm" items="<%=list%>">
				<option value="${dm.madm}"${dm.madm == param.madm ? 'selected': ''}>${dm.tendm}</option>
			</c:forEach>
		</select>
		</td>
	</tr>
	<td><input type="submit" style="background-color:MediumSeaGreen; border: 1px solid MediumSeaGreen;" value="submit">
	</table>
	</form>
</body>
</html>