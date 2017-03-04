<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Lista de Prodctos </title>
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
		<form method="post" action="http://localhost:8080/Practica01/Sumar">
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
				          	Descripcion:
				          </p class="text-left">
				          	<textarea class="form-control" rows="3" disabled="yes">
        						<c:out value = "${n.concepto}" /> 
        					</textarea>
				          <p>
				          	Precio: ${n.importe} (Euros).
				          </p>
				          <p>  	
				          		<input type="radio" name="opcion" value="${n.id}" >Incluir
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
<body>

</body>
</html>