package br.com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bo.CarroBO;

public class ListarCarro implements Logica{
    
    public ListarCarro() {
        super();
        // TODO Auto-generated constructor stub
    }
    public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {

		request.setAttribute("lista", new CarroBO().listarCarros());
		return "TratarCarro/ListarCarros.jsp";
	}
    
}
