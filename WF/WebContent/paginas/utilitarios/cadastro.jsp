<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Modulo Financeiro Woolsk</title>
	</head>
	<body>
		<form id="formulario" action="http://localhost:8080/ModuloFinanceiro/sistema" method="post">
			<input type="hidden" id="operacao" name="operacao" value="cadastro">
			<h2>Novo Cadastro</h2>
			<p>
				<b>Nome Completo:</b>
				<input type="text" id="nome" name="nome">
			</p>			
			<p>
				<b>Úsuario:</b>
				<input type="text" id="nomeUsuario" name="nomeUsuario">
			</p>
			<p>
				<b>Senha:</b>
				<input type="password" id="senha" name="senha">
			</p>
			<p>
			<b>E-mail:</b>
				<input type="text" id="email" name="email">
			</p>					
			<input type="submit" value="Continuar">
		</form>
		<p>
			<c:if test="${sucesso != null}">
				<b>${sucesso}.</b>
				<a href="http://localhost:8080/ModuloFinanceiro/index.jsp">Clique para entrar.</a>
			</c:if>
			<c:if test="${aviso != null}">
				<b>${avsio}</b>
			</c:if>
		</p>
	</body>
</html>