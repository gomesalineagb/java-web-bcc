package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bo.CarroBO;

/**
 * Servlet implementation class AlugarCarro
 */
@WebServlet("/AlugarCarro")
public class AlugarCarro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlugarCarro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CarroBO carroBO = new CarroBO();
		int id = Integer.parseInt(request.getParameter("id"));
		carroBO.alugarCarro(id);
		System.out.println(id);
		
		request.setAttribute("lista", carroBO.listarCarros());
		request.getRequestDispatcher("ListCar.jsp").forward(request, response);
	}

}
