package br.com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bo.CarroBO;

public class AlugarCarro implements Logica{
    
    public AlugarCarro() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {

		CarroBO carroBO = new CarroBO();
		int id = Integer.parseInt(request.getParameter("id"));
		if(carroBO.alugarCarro(id)) {
			request.setAttribute("erro", "Nao foi possível alugar o carro.");
			request.setAttribute("lista", carroBO.listarCarrosDisponiveis());
			return "TratarCarro/ListarCarrosDisponiveis.jsp";
		}

		request.setAttribute("lista", carroBO.listarCarros());
		return "TratarCarro/ListarCarros.jsp";
	}

}
