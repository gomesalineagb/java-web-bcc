
<meta charset="UTF-8">
 <h3>Page Initial</h3>
	
<a href="TratarCarro/FormCadastrarCarro.jsp" class="btn btn-outline-primary text-center">Cadastrar Carro</a>

<form method="get" action="CarroServlet">
	<div class="form-group row">
		<div class="col-sm-8">
			<input type="text" class="form-control" placeholder="Search..." name="search">
		</div>
		<input type="hidden" value="BuscarCarro" name="logica">
		<input type="submit" class="btn secondary" value="Search">
	</div>
</form>

<div class="card-header">
	<ul class="nav nav-tabs card-header-tabs nav-justified">
		<li class="nav-item">
			<a class="nav-link active" href="http://localhost:8080/AvaliacaoMVCLocadora/CarroServlet?logica=ListarCarro">Carros</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="http://localhost:8080/AvaliacaoMVCLocadora/CarroServlet?logica=ListarCarrosDisponiveis">Alugar</a>
		</li>
	</ul>
	
</div>