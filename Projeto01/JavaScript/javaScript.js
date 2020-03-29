function showMyName(){
	var name = document.getElementById("txtName");
	alert(name.value);
}

function changeBackgroundColor(color){
	var body = document.getElementById("body");
	body.style.backgroundColor = color;
}

function calculadora(operador){

	var num1 = document.getElementById("txtNum1").value;
	var num2 = document.getElementById("txtNum2").value;
	if (num1 == "" || num2 == "") {
		alert("Preencha o(s) campo(s)!");
	} else {
		var result = parseFloat(eval(num1 + operador + num2));
		if (!isNaN(result)) {
			alert(result);
		} else {
			alert("Permitido somente numeros!")
		}
	}
}

function limpar(){
	document.getElementById("txtNum1").value = "";
	document.getElementById("txtNum2").value = "";
}

function shake(txt) {
    
}