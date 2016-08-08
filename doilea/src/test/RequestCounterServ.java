package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/RequestServlet", loadOnStartup = 1)
public class RequestCounterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RequestCounterServ() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		// nu se initialiezeaza corect servlet config-ul metodei, mereu trebuie
		// apelata init din super
		super.init(config);
		int couter = 0;
		getServletContext().setAttribute("counter", couter);
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext ServCont = getServletContext();

		// get the counter, getAttribut intoarce object=> tre sa ii facem cast
		// in functie de necesitate
		// Integer counter =
		// (Integer)getServletContext().getAttribute("counter");
		int counter = (int) ServCont.getAttribute("counter");

		// increment the counter
		++counter;

		// save it back to the app scope
		ServCont.setAttribute("counter", counter);

		// display the message "sa incrementat couter-ul"
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>RequestCounter</title></head><body>");
		out.println("Hello mushroom!");
		out.println("<p>The counter is incremented</p>");
		out.println("</body></html>");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
