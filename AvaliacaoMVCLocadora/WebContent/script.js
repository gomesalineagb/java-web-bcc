
function validaUser(){
	var user = document.getElementById("user").value;
	var pass = document.getElementById("password").value;
	if(user !== "teste"){
		alert("Usuario ou senha errados.");
	}
}
