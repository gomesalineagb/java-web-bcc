<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<title>Cadastro de Carro</title>
</head>
<body>
	<div class="container col-sm-5">
		<div class="card text-center">
			<div class="card-body">
				<h3>Car Register</h3>
				<h6 class="text-danger">${erro}</h6> 
				<form action="CarroServlet" method="post">
					<div class="form-group row">
						<label class="col-sm-3 text-right">Fabricante:</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" name="txtFabricanteVeiculo" placeholder="Fabricante" required/>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-3 text-right">Model:</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" name="txtModeloVeiculo" placeholder="Modelo" required/>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-3 text-right">Year:</label>
						<div class="col-sm-8">
							<input class="form-control" type="number" name="txtYearVeiculo" placeholder="Year" required/>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-3 text-right">Color:</label>
						<div class="col-sm-8">
							<input class="form-control" type="color" name="txtColorVeiculo" placeholder="Color" required/>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-3 text-right">Value:</label>
						<div class="col-sm-8">
							<input class="form-control" type="number" name="txtValueVeiculo" placeholder="Value" required/>
						</div>
					</div>
					<a class="btn btn-link col-sm-5" href="ListCar.jsp">Cancel</a>
					<input type="submit" value="Register" class="btn btn-primary col-sm-5"/>
				</form>
			</div>
		</div>
		
	</div>

</body>
</html>