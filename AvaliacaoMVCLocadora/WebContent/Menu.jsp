
<meta charset="UTF-8">
 <h3>Page Initial</h3>
	
<a href="TratarCarro/FormCadastrarCarro.jsp" class="btn btn-outline-primary text-center">Cadastrar Carro</a>

<div class="form-group row">
	<div class="col-sm-8">
		<input type="text" class="form-control" placeholder="Search..." name="search">
	</div>
	<a type="button" class="fa fa-search" href="http://localhost:8080/AvaliacaoMVCLocadora/CarroServlet?logica=BuscarCarro"></a>
</div>


<div class="card-header">
	<ul class="nav nav-tabs card-header-tabs nav-justified">
		<li class="nav-item">
			<a class="nav-link active" data-toggle="tab" href="http://localhost:8080/AvaliacaoMVCLocadora/CarroServlet?logica=ListarCarro">Carros</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" data-toggle="tab" href="http://localhost:8080/AvaliacaoMVCLocadora/CarroServlet?logica=ListarCarrosDisponiveis">Alugar</a>
				
		</li>
	</ul>
			
	
</div>