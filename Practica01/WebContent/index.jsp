<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<!-- Define la codificación de caracteres a usar-->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		
		<title>Inicio</title>
		
		<!-- Hoja de estilo externa enlazada al documento HTML  -->
		<link rel="stylesheet" type="text/css" href="extra/estilos.css"/>
		
		<!-- CSS de Bootstrap -->
		<link href="extra/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
		
		<!-- Escala en los móviles -->
		<meta name="viewport" content="width=device-width, initial-scale=1">
	</head>
	
	<body>
		<header class="container">
			<section class="row">
				<div class="col-xs-12 cols-sm-9 col-md-9 col-lg-9" id="nombreWeb">
					<h1>Carrito</h1>
				</div>
				
				<!-- SECCIÓN PARA LA INDENTIFICACIÓN DE USUARIOS -->
				<div class="col-xs-12 cols-sm-3 col-md-3 col-lg-3" id="identifica">
					<form method="post" action="http://localhost:8081/Practica01/Web">

						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
							<input class="form-control" placeholder="Username" type="text" name="name" id="search_bar" required>
						</div>
						
						<div class="form-group">
						   <label class="sr-only" for="inputPassword">Password</label>
						   <input type="password"  class="form-control"  placeholder="Password" name="key" required>
						</div>
														
						<div class="checkbox">
							<label><input type="checkbox" name="recordar"/> Recuerdame</label>
						</div>
					
						<!--Botones de acceso.-->
						<div class="form-group">
							<button type="submit" class="btn btn-primary">Enviar</button>
							<a href="http://localhost:8081/Practica01/Registro" class="btn btn-info" role="button">Registro</a>
						</div>
					</form>
				</div>
			</section>
		</header>
	</body>
</html>