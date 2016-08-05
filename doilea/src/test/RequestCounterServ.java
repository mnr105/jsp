package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestServlet")
public class RequestCounterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int couter;

	public RequestCounterServ() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		// nu se initialiezeaza corect servlet config-ul metodei, mereu trebuie 
		// apelata init din super
		super.init(config);
		couter = 0;
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		++couter;
		out.println("Hello mushroom");
		out.println("<html>");
		out.println("<head><title>RequestCounter</title></head><body>");
		out.println("<p>You are visitor #" + couter + "</p>");
		out.println("</body></html>");
	}

}
