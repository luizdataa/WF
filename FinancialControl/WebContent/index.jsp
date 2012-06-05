<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="p" uri="http://primefaces.org/ui"%>
<f:view>
	<html>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title>Controle de Finan�as</title>
		</head>
		<body>
			<h:form id="formulario">
				<h:outputText value="Nome: "></h:outputText>
				<h:inputText ></h:inputText>
				<h:commandButton value="Salvar" type="button"></h:commandButton>
				<h:outputLabel value="#{testeBean.nome}"></h:outputLabel>
			</h:form>
		</body>
</html>
</f:view>