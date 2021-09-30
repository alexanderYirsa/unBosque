<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usuarios</title>
<link rel="stylesheet" href="css/estilo_usuarios.css">
</head>
<div class="tienda">

	<h2>Mi tienda</h2>

</div>
<body>
	<nav class="nav">
		<a href="#"> Usuarios </a> 
		<a href="#"> Clientes</a> 
		<a href="#"> Proveedores </a> 
		<a href="#"> Productos</a> 
		<a href="#"> Ventas </a> 
		<a href="#"> Reportes </a>
	</nav>
	<br>
	<section class="formulario">
		<input type="text" placeholder="Cedula" class="campos"> 
		<input type="text" placeholder="Nombre completo" class="campos"> 
		<input type="email" placeholder="Correo Electronico" class="campos">
		<input type="text" placeholder="Usuario" class="campos"> 
		<input type="password" placeholder="Contraseña" class="campos"> 
		<br>
		<br> 
		<input type="submit" class="botones" value="Consultar">
		<input type="submit" class="botones" value="Crear"> 
		<input type="submit" class="botones" value="Actualizar"> 
		<input type="submit" class="botones" value="Borrar">
	</section>
</body>
</html>