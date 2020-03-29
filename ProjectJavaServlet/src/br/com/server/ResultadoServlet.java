package br.com.server;
import java.io.IOException; 
import java.io.PrintWriter; 
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Result",urlPatterns = "/result")
public class ResultadoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	//	req.getRequestDispatcher("index.html").forward(req, resp);
		
		PrintWriter p = resp.getWriter();
		double num1 = Double.parseDouble(req.getParameter("num1"));
		double num2 = Double.parseDouble(req.getParameter("num2"));
		double result = num1 + num2;
		p.write("Result is: "+result);
		resp.setContentType("text/html");
	}
}