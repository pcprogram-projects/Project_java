<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.Crud.Libro" %>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

.res{

width:100%;
height:400px;
background-color:rgba(112, 114, 130, 0.7);
border-radius:15px;
border-color:black;
border-size:3px;
border-style:solid;

}
.re{
whidth:400px;
height:300px;

margin-left:30%;
margin-top:50px;
}


</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>





<section class="res">
<textarea class="re">
<%= request.getAttribute("libros") %>
</textarea>
<br/>
</section>

</body>
</html>