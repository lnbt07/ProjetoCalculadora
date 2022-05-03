

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraServlet
 */
@WebServlet("/calcular")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		double numero1, numero2, resultado = 0;
		String operacao;
		try {
			numero1 = Double.parseDouble(request.getParameter("numero1"));
			numero2 = Double.parseDouble(request.getParameter("numero2"));
			operacao = request.getParameter("operacao");
			
			switch (operacao) {
			case "Somar": {
				resultado = numero1+numero2;
				break;
			}
			case "Subtrair": {
				resultado = numero1-numero2;
				break;
			}
			case "Multiplicar": {
				resultado = numero1*numero2;
				break;
			}
			case "Dividir": {
				resultado = numero1/numero2;
				break;
			}}

			
		} catch(NumberFormatException n) {
			out.println("<html><body><h1>");
			out.println("Erro ao converter valor.\n"+n);
			out.println("</h1></body></html>");
		}
		out.println("<html><body><h1>");
		out.println("Resultado da operação é: "+resultado);
		out.println("</h1></body></html>");
		
	}

}
