<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="model.ProductModel"%>
<%@ page import="model.DanhmucModel"%>
<%@ page import="entities.Product"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form enctype="multipart/form-data"
		action="ProductServlet?action=update" method="post">
		<table>
			<tr>
				<td>Masp</td>
				<td><input type="text" name="txtmasp"
					value="<%=request.getParameter("masp")%>" disabled="disabled"></td>
			</tr>
			<tr>
				<td>Tensp</td>
				<td><input type="text" name="txttensp"
					value="<%=request.getParameter("tensp")%>"></td>
			</tr>
			<tr>
				<td>Gia</td>
				<td><input type="text" name="txtgia"
					value="<%=request.getParameter("gia")%>"></td>
			</tr>
			<tr>
				<td>Hinh</td>
				<td><script
						src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
					<input type="file" id="file1" name="file1"> <img
					src="images/<%=request.getParameter("hinh")%>" id="img1"
					class="img1" height="100px" width="100px"><br> <script
						type="text/javascript">
						$('#file1')
								.change(
										function(event) {
											var tmppath = URL
													.createObjectURL(event.target.files[0]);
											$(this).next("img").attr('src',
													tmppath);
										});
					</script></td>
			</tr>
			<tr>
				<td>Danh muc</td>
				<%
					ArrayList list = new DanhmucModel().getList();
				%>
				<td><select name="madm">
						<c:forEach var="p" items="<%=list%>">
							<option value="${p.madm }"
								${p.madm == param.madm ? 'selected' : '' }>${p.tendm }</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>
</body>
</html>