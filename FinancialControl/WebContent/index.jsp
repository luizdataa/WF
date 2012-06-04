<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Controle de Finanças</title>
	</head>
	<body>
		<f:view>
			<h:form id="formulario">
				<h:outputText value="Nome: "></h:outputText>
				<h:inputText ></h:inputText>
				<h:commandButton value="Salvar" type="button"></h:commandButton>
				<h:outputLabel value="#{testeBean.nome}"></h:outputLabel>
			</h:form>
		</f:view>
	</body>
</html>