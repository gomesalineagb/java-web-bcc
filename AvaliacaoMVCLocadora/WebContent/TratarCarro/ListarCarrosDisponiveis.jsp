<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
 	<script type="text/javascript" src="JavaScript/script.js"></script>
 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>	
	<script src='https://kit.fontawesome.com/a076d05399.js'></script>
	<meta charset="UTF-8">
	<title>Principal</title>
</head>
<body onload="erro();">
<div class="container col-sm-12">
	<div class="card text-center">
		<%@include file="/Menu.jsp" %>
		<div class="card-body">
	    	<div class="row">
  				<table class="table table-striped">
			        <tr>
			            <th>Fabricante</th>
			            <th>Modelo</th>
			            <th>Ano</th>
			            <th>Cor</th>
			            <th>Valor</th>
			            <th>Opções</th>
			        </tr>
					<c:forEach items="${lista}" var="carro">
					<tr>
						<td>${carro.getFabricanteCarro()}</td>
						<td>${carro.getModeloCarro()}</td>
						<td>${carro.getYearCarro()}</td>
						<td>${carro.getCorCarro()}</td>
						<td>${carro.getValorCarro()}</td>
						<td>
							<a href="http://localhost:8080/AvaliacaoMVCLocadora/CarroServlet?logica=AlugarCarro&id=${carro.getIdCarro()}" class="fas">&#xf274;</a>
							<a href="http://localhost:8080/AvaliacaoMVCLocadora/CarroServlet?logica=ExcluirCarro&id=${carro.getIdCarro()}" class="close text-danger">&times;</a>
							<a href="http://localhost:8080/AvaliacaoMVCLocadora/CarroServlet?logica=AtualizarCarro&action=form&id=${carro.getIdCarro()}" class="fas">&#xf044;</a>
						</td>
					</tr>
					</c:forEach>
			    </table>
			</div>
		</div>
	</div>
</div>

</body>
</html>