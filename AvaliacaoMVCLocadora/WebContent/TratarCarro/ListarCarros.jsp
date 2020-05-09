<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script type="text/javascript" src="JavaScript/script.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<meta charset="UTF-8">
	<title>Principal</title>
</head>
<body>
<div class="container col-sm-12">
	<div class="card text-center">
		<%@include file="/Menu.jsp" %>
			<div class="card-body">
		    	<div class="row">
	  				<table class="table">
						<thead class="thead-light">
							<tr>
								<th>Fabricante</th>
								<th>Modelo</th>
								<th>Ano</th>
								<th>Cor</th>
								<th>Valor</th>
								<th>Disponibilidade</th>
							</tr>
						</thead>
						<tr>
				        </tr>
						<c:forEach items="${lista}" var="carro">
						<tr>
							<c:if test="${carro.getTaAlugado() == 1}">
								<td class="text-secondary" style="text-decoration: line-through;">${carro.getFabricanteCarro()}</td>
								<td class="text-secondary" style="text-decoration: line-through;">${carro.getModeloCarro()}</td>
								<td class="text-secondary" style="text-decoration: line-through;">${carro.getYearCarro()}</td>
								<td class="text-secondary" style="text-decoration: line-through;">${carro.getCorCarro()}</td>
								<td class="text-secondary" style="text-decoration: line-through;">${carro.getValorCarro()}</td>
								<td class="text-secondary" style="text-decoration: line-through;">${carro.getStringTaAlugado()}</td>
							</c:if>
							<c:if test="${carro.getTaAlugado() == 0}">
								<td>${carro.getFabricanteCarro()}</td>
								<td>${carro.getModeloCarro()}</td>
								<td>${carro.getYearCarro()}</td>
								<td>${carro.getCorCarro()}</td>
								<td>${carro.getValorCarro()}</td>
								<td class="text-success">${carro.getStringTaAlugado()}</td>
							</c:if>
							
						</tr>
						</c:forEach>
				    </table>
	   				
				</div>
			</div>
	</div>
</div>
				

</body>
</html>