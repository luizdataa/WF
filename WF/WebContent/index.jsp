<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Modulo Financeiro Woolsk</title>
	</head>
	<body>
		<form id="formulario" action="sistema" method="post">
			<input type="hidden" id="operacao" name="operacao" value="acesso">
			<h2>Acesso</h2>
			<p>
				<b>Úsuario:</b>
				<input type="text" id="usuario" name="usuario">
			</p>
			<p>
				<b>Senha:</b>
				<input type="password" id="senha" name="senha">
			</p>							
			<p>
				<c:if test="${sucesso != null}">
					<b>${sucesso}</b>
				</c:if>
				<c:if test="${aviso != null}">
					<b>${avsio}</b>
				</c:if>
			</p>
			<input type="submit" value="Continuar">
		</form>
		<p>
			<a href="http://localhost:8080/ModuloFinanceiro/paginas/utilitarios/cadastro.jsp">Novo Cadastro</a>
		</p>
				<p>
			<a href="http://localhost:8080/ModuloFinanceiro/paginas/master/cadastroAction.jsp">Woolsk</a>
		</p>
	</body>
</html>
 
