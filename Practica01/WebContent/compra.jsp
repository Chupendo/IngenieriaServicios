<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<!-- Define la codificación de caracteres a usar-->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		
		<title>Lista de productos</title>
		
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
		
		<form method="post" action="http://localhost:<%=puerto%>/Practica01/Sumar">
			<c:forEach items="${lista}" var="n">
				<div class="col-xs-4">
			   	<div class="thumbnail">
   					<img src="${n.imagen}" alt="imagen">
			      		<div class="caption text-center">
          			  	<h3>
			          		"<c:out value = "${n.nombre}"/>" 
			          	</h3>
				          
			          	<p class="text-right">
		          			ID:<c:out value = "${n.id}"/>
					  	</p>
						  
			          	<p class="text-muted text-center">
			          		Descripción:
			          	</p>
				          
		          		<textarea class="form-control" rows="3" disabled="yes">
   							<c:out value = "${n.concepto}" /> 
   						</textarea>
        					
			          	<p>
			          		Precio: ${n.importe} (Euros).
			          	</p>
				          
			          	<p>  	
	          				<input type="checkbox" name="opcion" value="${n.id}" />Incluir
			          	</p>
				      </div>
				   </div>
				 </div>
			</c:forEach>
			
			<p class="text-center col-xs-12">
				<button type="submit" class="btn btn-primary">Comprar</button>
			</p>
			
		</form>
	</body>
</html>