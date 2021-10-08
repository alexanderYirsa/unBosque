<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="CalcularFechaNacimiento" method="get">
<h1>Bienvenido</h1>
<br>
<br>
<h1>Digite su nombre</h1>
<input type="text" name="nombre">
<h1>digite su año de nacimiento</h1>
<input type="text" name="ano">
<input type="submit" value="Enviar">

<% if(request.getAttribute("nombre")!= null){

	String nombre = (String)request.getAttribute("nombre");
	String anoNac = (String)request.getAttribute("anoNac");
	String edad = (String)request.getAttribute("edad");
	%>
	<h1>Hola <%= nombre%></h1>
	<h1>ud nació en <%= anoNac%>, por lo tanto, ud tiene <%= edad%> años</h1>
	<% 
}
	%>


</form>

</body>
</html>