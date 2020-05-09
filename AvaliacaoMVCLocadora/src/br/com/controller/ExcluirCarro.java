package br.com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bo.CarroBO;

public class ExcluirCarro implements Logica{
	public ExcluirCarro() {
		
	}
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {

		CarroBO carroBO = new CarroBO();
		int id = Integer.parseInt(request.getParameter("id"));
		
		if(!carroBO.excluirCarro(id)) {
			request.setAttribute("erro", "Erro, não foi possível excluir o carro!");
		}
		
		request.setAttribute("lista", carroBO.listarCarros());
		return "TratarCarro/ListarCarrosDisponiveis.jsp";
	}
}
