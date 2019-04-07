<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<!-- link CDN JQuery -->
<script
src="https://code.jquery.com/jquery-3.2.1.js"
integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE="
crossorigin="anonymous">
</script>

<script type="text/javascript">
$(document).ready(function(){
//click1
$('#btn1').click(function(){
var ten=$("#fullname").val();
$.ajax
({
type:"POST",
data:
{
fullname:ten,
action:"demo1"
},

url:'AjaxController',
success:function(result)
{
$("#demo1").text(result);
}
});
});//close1


//click2
$("#number1,#number2").keyup(function(){
var number1= $("#number1").val();
var number2= $("#number2").val();
$.ajax
({
type:"POST",
data:
{
number1:number1,
number2:number2,
action : "demo2"
},
url:'AjaxController',
success:function(result)
{
$("#demo2").text("KQ= "+result);
}
});
});//close2
	
	
});//Close ready
</script>



<title>Start Ajax</title>
</head>
<body>


<!-- Form 1 -->
<form>

<input type="text" id="fullname"/>
<input type="button" value="Hello" id="btn1"/>
<p id="demo1"></p></br>


<hr>
Number 1:<input type="text" id="number1"/></br>
Number 2:<input type="text" id="number2"/></br>
<p id="demo2"><p></br>
<input type="button" value="Sum" id="btn2"/>


</form>



</body>
</html>