package br.com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bean.CarroBean;
import br.com.bo.CarroBO;
import br.com.dao.CarroDAO;

public class AtualizarCarro implements Logica{
	
	public AtualizarCarro() {
		
	}
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {

		CarroBO carroBO = new CarroBO();
		int id = Integer.parseInt(request.getParameter("id"));
		
		if (request.getParameter("action").compareTo("form") == 0) {
			
			CarroBean carro = carroBO.buscarPorId(id);
			if (carro != null) {
				request.setAttribute("fabricante", carro.getFabricanteCarro());
				request.setAttribute("modelo", carro.getModeloCarro());
				request.setAttribute("ano", carro.getYearCarro());
				request.setAttribute("cor", carro.getCorCarro());
				request.setAttribute("valor", carro.getValorCarro());
				request.setAttribute("id", id);
				return "TratarCarro/FormAtualizarCarro.jsp";
			}
		}else {
			String cor = request.getParameter("txtColorVeiculo");
			float valor = Float.parseFloat(request.getParameter("txtValueVeiculo"));
	
			if(!carroBO.atualizarCarro(cor, valor, id)) {
				return "TratarCarro/FormAtualizarCarro.jsp";	
			}
		}
		request.setAttribute("lista", new CarroDAO().listarCarros());
		return "TratarCarro/ListarCarros.jsp";		
	}
}
