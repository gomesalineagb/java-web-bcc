package br.com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bo.CarroBO;

public class ListarCarrosDisponiveis implements Logica {
   
    public ListarCarrosDisponiveis() {
        super();
        // TODO Auto-generated constructor stub
    }

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {

		request.setAttribute("lista", new CarroBO().listarCarrosDisponiveis());
	//	request.setAttribute("lista", new CarroBO().listarCarrosDisponiveis());
		return "TratarCarro/ListarCarrosDisponiveis.jsp";
	}

}
