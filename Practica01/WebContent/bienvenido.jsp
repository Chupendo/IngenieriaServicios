<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Web Usuario.</title>
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
		Hola <c:out value = "${usuario.nombre},${usuario.apellidos}" />  que tal.
		<p> Su carrito: </p>
		<ul>
			<c:forEach items="${usuario.lista}" var="n">
				<li>Producto:${n.nombre},Concepto:${n.concepto},Precio:${n.importe} Euros</li>
			</c:forEach>
		</ul>
		<a href="http://localhost:8081/Practica01/Productos" class="btn btn-info" role="button">Comprar</a>
	</body>
</html>