package br.com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bean.CarroBean;
import br.com.bo.CarroBO;

/**
 * Servlet implementation class ListarCarrosDisponiveis
 */
@WebServlet("/ListarCarrosDisponiveis")
public class ListarCarrosDisponiveis extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCarrosDisponiveis() {
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
		List<CarroBean> carros = new ArrayList<CarroBean>();
		
		for (CarroBean carro : carroBO.listarCarros()) {
			if (carro.getTaAlugado() == 0) {
				carros.add(carro);
			}
		}
		
		request.setAttribute("lista", carros);
		request.getRequestDispatcher("ListLocacoes.jsp").forward(request, response);
	}

}
