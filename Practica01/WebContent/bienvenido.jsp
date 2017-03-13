<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
	<head>
		<!-- Define la codificación de caracteres a usar-->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		
		<title>Web de usuario</title>
		
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
		
		Hola <c:out value = "${usuario.nombre},${usuario.apellidos}" />  qué tal.
		<p> Su carrito: </p>
		<ul>
			<c:forEach items="${lista}" var="n">
				<li>Producto:${n.nombre},Concepto:${n.concepto},Precio:${n.importe} Euros</li>
			</c:forEach>
		</ul>
		<a href="http://localhost:<%=puerto%>/Practica01/Productos" class="btn btn-info" role="button">Comprar</a>
	</body>
</html>