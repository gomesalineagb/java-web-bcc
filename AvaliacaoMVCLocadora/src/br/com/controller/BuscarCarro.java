package br.com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bo.CarroBO;

public class BuscarCarro implements Logica{
	
	public BuscarCarro() {
	}
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {

		CarroBO carroBO = new CarroBO();
		String modelo = request.getParameter("search");

		request.setAttribute("lista", carroBO.buscarPorModelo(modelo));
		return "TratarCarro/ListarCarros.jsp";
	}
	
}
