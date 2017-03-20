<%-- 
    Document   : index
    Created on : 09-dic-2007, 20:16:33
    Author     : jtagua
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>

<html>
	<head>
		<!-- Define la codificación de caracteres a usar-->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		
		<title>Administración</title>
		
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
		
		<h1> Web del administrador. </h1>
		<p> En esta web se muestran las cookie disponibles </p>
		<div class="table-responsive">
			<table class="table">
    			<c:forEach items="${cookie}" var="user">
		 		<tr>
		    		<td>
		    			<c:out value="${user.value.name}" />: 
		    		</td>
		    		<td>
		    		    <c:out value="${user.value.value}" />
		    		</td>
		    	</tr>
		  	 
		 		</c:forEach>
  			</table>
		</div>
		
	</body>
</html>