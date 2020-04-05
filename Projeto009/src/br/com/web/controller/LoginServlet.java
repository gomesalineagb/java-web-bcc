package br.com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.web.model.*;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ClienteModel cliente;   
    private ArrayList<VeiculoModel> veiculos = new ArrayList<>();
    
	
    public LoginServlet() {
        super();
        this.cliente = new ClienteModel("test","test");
        // TODO Auto-generated constructor stub
        
        veiculos.add(new VeiculoModel("Monza", 100.00));
        veiculos.add(new VeiculoModel("Compass", 700.00));
        veiculos.add(new VeiculoModel("Subaru", 1000.00));
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		if (this.cliente.getUsuario().compareTo(user) == 0 && this.cliente.getSenha().compareTo(pass) == 0){
			request.setAttribute("veiculos", veiculos);
			request.getRequestDispatcher("View/listVeiculos.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
