<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cadastro de Página</title>
	</head>
	<body>
		<form id="formulario" action="http://localhost:8080/ModuloFinanceiro/sistema" method="post">
			<input type="hidden" id="operacao" name="operacao" value="cadastroAction">
			<h2>Cadastro Página</h2>
			<p>
				<b>Action:</b>
				<input type="text" id="action" name="action">
			</p>
			<p>
				<b>Caminho:</b>
				<input type="text" id="caminho" name="caminho">
			</p>							
			<input type="submit" value="Continuar">
		</form>
	</body>
</html>
 
