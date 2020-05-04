<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="br.com.bean.CarroBean"%>
<%@page import="br.com.dao.CarroDAO"%>
<%@page import="java.util.List"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<meta charset="UTF-8">
	<title>Car List</title>
</head>
<body>
<div class="container col-sm-8">
	<div class="card text-center">
		<%@include file="Menu.jsp" %>
		<div class="card-body">
	    	<div class="row">
  				<table class="table table-striped">
			        <tr>
			            <th>ID</th>
			            <th>Fabricante</th>
			            <th>Modelo</th>
			            <th>Year</th>
			            <th>Cor</th>
			            <th>Valor</th>
			            <th>Alugado</th>
			        </tr>

      
					<c:forEach items="${lista}" var="carro">
					<tr>
						<td>${carro.getIdCarro()}</td>
						<td>${carro.getFabricanteCarro()}</td>
						<td>${carro.getModeloCarro()}</td>
						<td>${carro.getYearCarro()}</td>
						<td>${carro.getCorCarro()}</td>
						<td>${carro.getValorCarro()}</td>
						<td>${carro.getTaAlugadoCarro()}</td>
					</tr>
					</c:forEach>
			    </table>
   				
			</div>
		</div>
	</div>
</div>

<%-- <% 
List<CarroBean> lista = new CarroDAO().listCar();

for(CarroBean carro : lista){%>

	<%=carro.getFabricanteCarro()%><p>
	<%=carro.getModeloCarro() %><p>
	<%=carro.getYearCarro() %><p>
  <% } %>  --%>
  
</body>
</html>