<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Registro</title>
	</head>
	<body>
		web del usuario.
		<center>
			<h1> Registro: POST METHOD </h1>
			<form action="http://localhost:8080/Practica01/Registro" method=post>
				Nombre: <input type=text name=name required><br>
				Apellidos: <input type=text name=apellidos required><br>
				E-mail: <input type=email name=email required><br>
				Contraseña: <input type=text name=key required><br>
				<input type=submit value=Send>
			</form>
		</center>
		</form>
	</body>
</html>