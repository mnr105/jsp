package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/DisplayCounter")
public class DisplayCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DisplayCounter() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		ServletContext ServCont = getServletContext();

		// get the counter, daca folosim int o sa avem eroare 500 null pointer,
		// daca folosim obj Integer ne apare valoarea null
		Integer counter = (Integer) ServCont.getAttribute("counter");

		// display the message "valoarea este"
		PrintWriter out = response.getWriter();
		out.println("Hello mushroom");
		out.println("<html>");
		out.println("<head><title>DisplayCounter</title></head><body>");
		out.println("<p>The counter value is curently:" + counter + "</p>");
		out.println("</body></html>");

	}

}
