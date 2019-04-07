<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">





<!-- link CDN JQuery -->
<script src="https://code.jquery.com/jquery-3.2.1.js"
	integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE="
	crossorigin="anonymous">
</script>

<script src="js/jquery-2.2.3.js"> </script>
<script src="js/jquery.validate.min.js"></script>


<script>
	$(document).ready(function(){
		//Ajax
		$("#user").keyup(function(){
			var user = $("#user").val();
			$.ajax({
				type : "POST",
				data :
				{
					user : user,
					action : "checkuser"
				},
				url : 'AccountServlet',
				success : function(result) {
					$("#demo").html("--->" + result);
				}
			});
		});//close2

	});//Close ready
</script>

<script>
$(document).ready(function() {
	$("#form").validate({
		 rules:
		 {
			 txtname: "required",
			 txtpassword: "required",
         },
         messages:
         {
        	 txtname: "Nhập họ tên người dùng",
        	 txtpassword: "Nhập password",
         }

	});
});
</script>

<title>Insert title here</title>
<style>
h1.round2 {
	border: 2px solid MediumSeaGreen;
	border-radius: 5px;
	width: 120px;
}
</style>


</head>
<body>

	<h1 class="round2">INSERT</h1>
	<form action="AccountServlet?task=insert" method="post" id="form">

		<table>
			<tr>
				<td>Username
				<td><input type="text" id="user" name="txtname">
				<td><p id="demo">
					<p>
			</tr>

			<tr>
				<td>Password
				<td><input type="password" id="pass" name="txtpassword">
			</tr>

			<tr>
				<td></td>
				<td><input type="submit"
					style="background-color: MediumSeaGreen; border: 1px solid MediumSeaGreen;"
					value="Insert">
			</tr>

		</table>
	</form>
</body>
</html>