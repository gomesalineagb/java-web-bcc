function selecionarMaterias(){
  var checkboxs = document.getElementsByName('ckMateria');
  var dvconteudo = document.getElementById('dvConteudo');
  for (var i = 0; i < checkboxs.length; i++) {
    if (checkboxs[i].checked == true){
      alert(checkboxs[i].id);
      dvConteudo.innerHTML += checkboxs[i].id;//adicionar conteuno no html em tempo de execucao
    }
  }
}
