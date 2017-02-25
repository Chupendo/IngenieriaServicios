<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Identificación</title>
		
	</head>
	
	<body>
		<center>
			<h1> Identifiación: POST METHOD </h1>
			<form action="http://localhost:8080/Practica01/Web" method=post>
				E-mail: <input type=email name=name required>
				Contraseña: <input type=text name=key required>
				<input type=submit value=Send>
			</form>
			<br>
			<h1> Registrate como usuario: Get METHOD </h1>
			<form action="http://localhost:8080/Practica01/Registro" method=get>
				<input type=submit value=Registro>
			</form>
		</center>
	</body>
</html>