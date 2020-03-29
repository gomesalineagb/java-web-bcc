/**
 * 
 */

function clickHere(){
  alert("Congratulations you had just clicked on the Button!");
}

function calc(operador){
  var num1 = parseFloat(document.getElementById('txtNum1').value);
  var num2 = parseFloat(document.getElementById('txtNum2').value);
  var result = eval(num1+operador+num2);
  
  alert("Result is "+result);
}
