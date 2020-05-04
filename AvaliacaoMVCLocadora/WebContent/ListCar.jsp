<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<meta charset="UTF-8">
	<title>Principal</title>
</head>
<body>
<div class="container col-sm-12">
	<div class="card text-center">
		<%@include file="Menu.jsp" %>
			<div class="card-body">
		    	<div class="row">
	  				<table class="table table-striped">
				        <tr>
				            <th>Fabricante</th>
				            <th>Modelo</th>
				            <th>Year</th>
				            <th>Cor</th>
				            <th>Valor</th>
				            <th>Disponibilidade</th>
				        </tr>
						<c:forEach items="${lista}" var="carro">
						<tr>
							<td>${carro.getFabricanteCarro()}</td>
							<td>${carro.getModeloCarro()}</td>
							<td>${carro.getYearCarro()}</td>
							<td>${carro.getCorCarro()}</td>
							<td>${carro.getValorCarro()}</td>
							<td>${carro.getStringTaAlugado()}</td>
							
						</tr>
						</c:forEach>
				    </table>
	   				
				</div>
			</div>
	</div>
</div>
				

</body>
</html>