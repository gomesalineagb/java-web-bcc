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
		String resultado = carroBO.cadastraCarro(request.getParameter("txtModeloVeiculo"), request.getParameter("txtFabricanteVeiculo"),request.getParameter("txtYearVeiculo"));
		
		if (resultado == "ListCar.jsp") {
			request.setAttribute("lista", carroBO.listCar());
		}else {
			request.setAttribute("erro", "Erro ao cadastrar carro.");
		}
		request.getRequestDispatcher(resultado).forward(request, response);
		
	}

}
