<%@page import="entities.Account"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bycode.com</title>

<style>

h3.round2
{
    border: 1px solid red;
    border-radius: 6px;
    width:60px;
    height:20px;
}

a:link
{
    color: red;
    background-color: transparent;
    text-decoration: none;
}


table, td, th
{    
    border: 1px solid tomato;
    text-align: center;
}

table
{
    border-collapse: collapse;
    width: 60%;
}


table#t01 th
{
    background-color: black;
    color: white;
    border: 1px solid black;
}


p.p00
{
    background-color: MediumSeaGreen;
    color: white;
    border: 1px solid MediumSeaGreen;
    width: 150px;
}
</style>
</head>
<body>
 <p class="p00"> <%=request.getAttribute("thongbao") %></p>
 
 <table id="t01">
 <tr>
 <th>Account</th>
 <th>Password</th>
 <th>Action</th>
 <th>Action</th>
 </tr>
 
 <% ArrayList list = (ArrayList)session.getAttribute("accountList");
 for(Object a:list)
 {Account acc = (Account) a;
 %>
 
 
 <tr>
 <td><%=acc.getUsername() %></td>
 <td><%=acc.getPassword() %></td>
 
 <td>
 <a href ="updateaccount.jsp?username=<%=acc.getUsername() %>&password=<%=acc.getPassword() %>">Update</a>
 </td>
 
 <td>
<a href ="AccountServlet?task=delete&username=<%=acc.getUsername() %>">Delete</a>
 </td>
 
 </tr>
 <% } %>
 </table>
 
 <h3 class="round2"><a href="insertaccount.jsp">Insert</a></p>
</body>
</html>