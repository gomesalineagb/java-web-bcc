<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>	
	<meta charset="UTF-8">
	<title>Principal</title>
</head>
<body>
<div class="container col-sm-12">
	<div class="card text-center">
		<%@include file="Menu.jsp" %>
		<div class="tab-content">
			<div class="card-body">
		    	<div class="row">
	  				<table class="table table-striped">
				        <tr>
				            <th>Fabricante</th>
				            <th>Modelo</th>
				            <th>Ano</th>
				            <th>Cor</th>
				            <th>Valor</th>
				            <th>Alugar</th>
				        </tr>
						<c:forEach items="${lista}" var="carro">
						<tr>
							<td>${carro.getFabricanteCarro()}</td>
							<td>${carro.getModeloCarro()}</td>
							<td>${carro.getYearCarro()}</td>
							<td>${carro.getCorCarro()}</td>
							<td>${carro.getValorCarro()}</td>
							<td><form action="AlugarCarro" method="post">
								<input type="submit" value="Alugar">
								<input type="hidden" name="id"  value="${carro.getIdCarro()}">
							</form></td>
						</tr>
						</c:forEach>
				    </table>
				</div>
			</div>
		</div>
	</div>
</div>

</body>
</html>