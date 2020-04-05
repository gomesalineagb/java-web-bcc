<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="br.com.web.model.VeiculoModel"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Veiculos</title>
</head>
<body>

<%
ArrayList <VeiculoModel> veiculos = (ArrayList) request.getAttribute("veiculos");

%>
<%-- <%=
for (int i = 0; i < veiculos.size(); i++){
	veiculos.get(i).getNome();
} %> --%>

<h1><%=veiculos.get(0).getNome()%></h1>
<h1><%=veiculos.get(1).getNome()%></h1>
<h1><%=veiculos.get(2).getNome()%></h1>

<%-- <c:forEach var="valor" items="${veiculos}">
	<span><b>Nome: </b>${valor.getNome}</span> -
	<span><b>Valor: </b>${valor.getValor}</span> -
	<span><b>isAlugado: </b>${valor.getIsAlugado}</span> </br>
</c:forEach> --%>
	
</body>
</html>