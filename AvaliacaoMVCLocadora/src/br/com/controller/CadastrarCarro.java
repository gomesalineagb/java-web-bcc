package br.com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bo.CarroBO;

public class CadastrarCarro implements Logica{
	
	public CadastrarCarro() {
		
	}
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {

		CarroBO carroBO = new CarroBO();
		String modelo = request.getParameter("txtModeloVeiculo");
		String fabricante = request.getParameter("txtFabricanteVeiculo");
		int year = Integer.parseInt(request.getParameter("txtYearVeiculo"));
		String cor = request.getParameter("txtColorVeiculo");
		float valor = Float.parseFloat(request.getParameter("txtValueVeiculo"));
		
		String resultado = carroBO.cadastraCarro(modelo, fabricante, year,cor,valor,0);
		
		if (resultado == "TratarCarro/ListarCarros.jsp") {
			request.setAttribute("lista", new CarroBO().listarCarros());
		}else {
			request.setAttribute("erro", "Erro ao cadastrar carro.");
		}		
		return resultado;
	}
}
