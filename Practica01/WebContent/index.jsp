<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Index</title>
		<link rel="stylesheet" href="styles/main.css" type="text/css"/>
		
	</head>
	
	<body>
		<center>
			<h1> TEST SERVLET: GET METHOD </h1>
			<form action="http://localhost:8080/Practica01" method=get>
				Name: <input type=text name=name required>
				Contrasena: <input type=text name=key required>
				<input type=submit value=Send>
			</form>
			<br>
			<form action="http://localhost:8080/Practica01" method=post>
				Name: <input type=text name=name required>
				Contrasena: <input type=text name=key required>
				<input type=submit value=Send>
			</form>
		</center>
	</body>
</html>