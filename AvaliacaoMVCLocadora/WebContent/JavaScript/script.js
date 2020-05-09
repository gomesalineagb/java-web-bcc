
function validaUser(){
	var user = document.getElementById("user").value;
	var pass = document.getElementById("password").value;
	if(user !== "teste"){
		alert("Usuario ou senha errados.");
	}
}

function erro(){
	var erro = document.getElementById("erro").value;
	if (erro != "") {
		alert(erro);
	}
	alert("@@@");
}
