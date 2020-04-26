<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Client List</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
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
			            <th>Name</th>
			            <th>Telephone</th>
			            <th>Adress</th>
			            <th></th>
			        </tr>
      
					<c:forEach items="${lista}" var="cliente">
					<tr>
						<td>${cliente.getIdCliente()}</td>
						<td>${cliente.getNameCliente()}</td>
						<td>${cliente.getTelephoneCliente()}</td>
						<td>${cliente.getAdressCliente()}</td>
					</tr>
					</c:forEach>
			    </table>
   				
			</div>
		</div>
	</div>
</div>
</body>
</html>