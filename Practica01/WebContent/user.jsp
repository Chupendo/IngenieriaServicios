<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<!-- Define la codificación de caracteres a usar-->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		
		<title>Registro</title>
		
		<!-- Hoja de estilo externa enlazada al documento HTML  -->
		<link rel="stylesheet" type="text/css" href="extra/estilos.css"/>
		
		<!-- CSS de Bootstrap -->
		<link href="extra/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
		
		<!-- Escala en los móviles -->
		<meta name="viewport" content="width=device-width, initial-scale=1">
	</head>
	
	<body>
		<%! int puerto = 8080; %>
		<header class="container">
			<section class="row">
				<div class="col-xs-12 cols-sm-9 col-md-9 col-lg-9" id="nombreWeb">
					<h1>Carrito</h1>
				</div>
			</section>
		</header>
		
		<div style="text-align:center">
		
			<!-- Formulario de registro -->
			<form action="http://localhost:<%=puerto%>/Practica01/Registro" method=post>
			
				<div class="input col-xs-4">
				
					<!-- Nombre -->
					<div class="input-group">
						<span class="input-group-addon"><input type="checkbox"></span>
	      				<input class="form-control" type=text name=name placeholder="Nombre" required/>
					</div>
					
					<!-- Apellidos -->
					<div class="input-group">
					    <span class="input-group-addon"><input type="radio"></span>
	      				<input type="text" class="form-control" name=apellidos  placeholder="Apellidos"required>
					</div>
					
					<!-- Email -->
					<div class="input-group">
						<span class="input-group-addon">@</span>
	  					<input type=email class="form-control" placeholder="aa@aa.a" name=email required />
	  				</div>
	  				
	  				<!-- Contraseña -->
	  				<div class="input-group">
						<span class="input-group-addon">Pass</span>
						<input type="password" class="form-control" name=key placeholder="Password" required>
					</div>
					
					<input type=submit value=Send>
				</div>
			</form>
		</div>
	</body>
</html>