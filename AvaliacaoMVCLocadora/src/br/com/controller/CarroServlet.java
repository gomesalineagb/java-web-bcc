package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bo.CarroBO;

/**
 * Servlet implementation class CarroServlet
 */
@WebServlet("/CarroServlet")
public class CarroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CarroServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CarroBO carroBO = new CarroBO();
		String modelo = request.getParameter("txtModeloVeiculo");
		String fabricante = request.getParameter("txtFabricanteVeiculo");
		int year = Integer.parseInt(request.getParameter("txtYearVeiculo"));
		String cor = request.getParameter("txtColorVeiculo");
		float valor = Float.parseFloat(request.getParameter("txtValueVeiculo"));
		
		String resultado = carroBO.cadastraCarro(modelo, fabricante, year,cor,valor,0);
		
		if (resultado == "ListCar.jsp") {
			request.setAttribute("lista", carroBO.listarCarros());
		}else {
			request.setAttribute("erro", "Erro ao cadastrar carro.");
		}
		request.getRequestDispatcher(resultado).forward(request, response);
		
	}

}
