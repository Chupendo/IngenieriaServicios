<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Registro. </title>
		<link rel="stylesheet" type="text/css" href="extra/estilos.css"/>
		<!-- CSS de Bootstrap -->
		<link href="extra/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
	</head>
	<body>
		<header class="container">
			<section class="row">
				<div class="col-xs-12 cols-sm-9 col-md-9 col-lg-9" id="nombreWeb">
					<h1>Carrito.</h1>
				</div>
			</section>
		</header>
		
		<center>
			<h6> Registro: POST METHOD </h6>	
			<form action="http://localhost:8081/Practica01/Registro" method=post>
				<div class="input col-xs-4">
					<div class="input-group">
						<span class="input-group-addon"><input type="checkbox"></span>
	      				<input class="form-control" type=text name=name placeholder="Nombre" required/>
					<br>
					</div>
					<div class="input-group">
					    <span class="input-group-addon"><input type="radio"></span>
	      				<input type="text" class="form-control" name=apellidos  placeholder="Apellidos"required>
					<br>
					</div>
					<div class="input-group">
						<span class="input-group-addon">@</span>
	  					<input type=email class="form-control" placeholder="aa@aa.a" name=email required />
	  				<br>
	  				</div>
	  				<div class="input-group">
						<span class="input-group-addon">Pass</span>
						<input type="password" class="form-control" name=key placeholder="Password" required>
					<br>
					</div>
					<input type=submit value=Send>
				</div>
			</form>
		</center>
	</body>
</html>