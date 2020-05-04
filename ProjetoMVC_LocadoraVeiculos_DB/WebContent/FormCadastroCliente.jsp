<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Register Client</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

</head>
<body>
<div class="container col-sm-5">
	<div class="card text-center">
		<div class="card-body">
			<h3>Client Register</h3>
			<h6 class="text-danger">${erro}</h6>
			<form action="ClienteServlet" method="post">
				<div class="form-group row text-right">
					<label class="col-sm-3">Name:</label>
					<div class="col-sm-8">
						<input class="form-control" type="text" name="name" placeholder="Name" required/>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-3 text-right">Telephone:</label>
					<div class="col-sm-8">
						<input class="form-control" type="number" placeholder="(99) 999999-9999" name="telephone" required/>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-3 text-right">Adress:</label>
					<div class="col-sm-8">
						<input class="form-control" type="text" name="adress" placeholder="Adress" required/>
					</div>
				</div>
				<a class="btn btn-link col-sm-5" href="ListClient.jsp">Cancel</a>
				<input type="submit" value="Register" class="btn btn-primary col-sm-5"/>
			</form>
		</div>
	</div>
</div>
</body>
</html>