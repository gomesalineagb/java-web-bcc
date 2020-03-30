package br.com.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IMCServlet
 */
@WebServlet("/calculaIMC")
public class IMCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IMCServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double weight = Double.parseDouble(request.getParameter("weight"));
		double height = Double.parseDouble(request.getParameter("height"));
		double result = weight / Math.pow(height, height);;
		String imc;
		
		if (result < 18.5) {
			imc = "Voce está abaixo do peso!";
		}else if(result < 24.9) {
			imc = "Voce está com o peso normal!";
		}else if(result < 29.9) {
			imc = "Voce está com sobrepeso!";
		}else if(result < 34.9) {
			imc = "Voce está com OBESIDADE GRAU 1!";
		}else if(result < 39.9) {
			imc = "Voce está COM OBESIDADE GRAU 2!";
		}else {
			imc = "Voce está COM OBESIDADE GRAU 3!";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("imc", imc);
		request.getRequestDispatcher("showIMC.jsp").forward(request, response);
		
	}


}
