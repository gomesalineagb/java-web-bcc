
function validaUser(){
	var user = document.getElementById("user").value;
	if(user !== "teste"){
		alert("Usuario ou senha errados.");
		return false;
	}
}

function erro(){
	var erro = document.getElementById("erro").value;
	if (erro != "") {
		alert(erro);
	}
	alert("@@@");
}
