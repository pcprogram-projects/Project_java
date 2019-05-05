<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body {
	background-color: rgba(110, 24, 122, 0.4);
}

.for {
	width: 100%;
	height: 400px;
	background-color: rgba(110, 24, 120, 0.7);
	border-radius: 15px;
	border-color: black;
	border-size: 3px;
	border-style: solid;
	alaign-items: center;
}

.btn {
	border-radius: 15px;
	width: 100px;
	height: 20px;
	float: left;
	margin-top: 15px;
	margin-left: 130px;
}

.in {
	margin-left: 5px;
	margin-top: 15px;
	position: relative;
	margin-left: 90px;
}

.im {
	width: 360px;
	height: 300px;
	background-color: rgba(49, 104, 123, 0.5);
	border-radius: 15px;
	margin-left: 450px;
	margin-top: 50px;
}
</style>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="for">
		<form method="POST" action="Controlador">
			<section class="im"> 
		

        <input type="hidden" name="action" value="consulta">

			<input class="btn" type="submit" value="cosultar">

			</section>

		</form>

	</div>

</body>
</html>