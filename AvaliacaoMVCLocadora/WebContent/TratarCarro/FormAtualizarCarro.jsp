<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<title>Atualizar Carro</title>
</head>
<body>
	<div class="container col-sm-8">
		<div class="card text-center">
			<div class="card-body">
				<h3>Atualizar Carro</h3>
				<h6 class="text-danger">${erro}</h6> 
				<form action="http://localhost:8080/AvaliacaoMVCLocadora/CarroServlet?logica=AtualizarCarro" method="get">
					<div class="form-group row">
						<label class="col-sm-3 text-right">Fabricante:</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" readonly name="txtFabricanteVeiculo" placeholder="${fabricante}"/>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-3 text-right">Modelo:</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" readonly name="txtModeloVeiculo" placeholder="${modelo}"/>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-3 text-right">Ano:</label>
						<div class="col-sm-8">
							<input class="form-control" type="number" readonly name="txtYearVeiculo" placeholder="${ano}" value="${ano}"/>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-3 text-right">Cor:</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" required name="txtColorVeiculo" placeholder="${cor}" value="${cor}"/>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-3 text-right">Valor:</label>
						<div class="col-sm-8">
							<input class="form-control" type="number" required name="txtValueVeiculo" placeholder="${valor}"  value="${valor}"/>
						</div>
					</div>
					<a class="btn btn-link col-sm-5" href="http://localhost:8080/AvaliacaoMVCLocadora/CarroServlet?logica=ListarCarro">Cancel</a>
					<input type="submit" value="Atualizar" class="btn btn-primary col-sm-5"/>
					<input type="hidden" name="logica" value="AtualizarCarro">
					<input type="hidden" name="action" value="Atualizar">
					<input type="hidden" name="id" value="${id}">
				</form>
			</div>
		</div>
		
	</div>

</body>
</html>