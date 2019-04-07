<%@page import="entities.Item"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GIO HANG</title>
<style>
.tb
{
    width: 80%;
        border: 3px solid green;
    text-align: center;
    line: 1px;
        background-color: white;
    color: tomato;
}
h2.round2
{
    border: 2px solid yellow;
    border-radius: 2px;
    width:135px;
}
</style>
</head>
<body>
<h2 class="round2">GIO HANG</h2>
<% ArrayList <Item> cart = (ArrayList<Item>)request.getAttribute("list"); %>

<form action="CartServlet" method="post">
<table class="tb" border="1">
<tr>
<td>MA SP</td>
<td>TEN SP</td>
<td>HINH SP</td>
<td>GIA SP</td>
<td>SO LUONG</td>
<td>TOTAL</td>
<td>CHOICE</td>
</tr>

<c:forEach var="i" items="<%=cart%>">
<tr>
<td>${i.sanpham.masp}</td>
<td>${i.sanpham.tensp}</td>
<td><img src="images/${i.sanpham.hinh}" height="80px" width="60px"/></td>
<td>${i.sanpham.gia}</td>
<td>${i.soluong}</td>
<td>${i.sanpham.gia*i.soluong}</td>
<td>
<a href="CartServlet?action=delete&masp=${i.sanpham.masp}">DELETE</a>
</td>
</c:forEach>
</table>
<p> <b>Tong thanh toan: <%=request.getAttribute("totalcart") %></b></p>
<a href="CartServlet?action=removeall">Xoa Gio Hang</a>
<p></p>
<a href = "index.jsp">TIEP TUC MUA HANG</a>
<p>
<input type="submit" value="MUA HANG">
</p>
</form>
</body>
</html>