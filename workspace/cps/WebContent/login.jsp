<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:rich="http://richfaces.org/rich"
	xmlns:a4j="http://richfaces.org/a4j">

<head>
<title>Teste Login</title>
</head>
<!--  -->
<f:view>
	<h:form>
		<rich:panel style="width: 250px;">
			<f:facet name="header">
				<h:outputText value="Login Sistema" />
			</f:facet>
			<h:panelGrid columns="2">
				<h:column>
					<h:outputText value="Usuário: " />
				</h:column>
				<h:column>
					<h:inputText value="#{testeBean.usuario}"/>
				</h:column>
				<h:column>
					<h:outputText value="Senha: " />
				</h:column>
				<h:column>
					<h:inputSecret value="#{testeBean.senha}"/>
				</h:column>
				<h:column>
					<h:commandButton value="Logar" action="#{testeBean.login}" />
				</h:column>
			</h:panelGrid>
		</rich:panel>
	</h:form>
</f:view>
</html>
