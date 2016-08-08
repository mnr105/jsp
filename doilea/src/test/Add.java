package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Adunare")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Add() {
		super();
	}

	// arata de cate ori a fost vizualizata o pagina

	public void init(ServletConfig config) throws ServletException {
	}

	public void destroy() {
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null;
	}

	/*
	 * protected void service(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { } // asta imi impiedica
	 * goGet-ul
	 */

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter(); //

		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));

		out.println("<html>");
		out.println("<head><title>Servlet din doGet</title></head><body>");
		out.println("<p> The sum of " + a + " and " + b + " is " + (a + b)
				+ "</p>");
		out.println("Hello mushroom");
		out.println("<form action= /TestJsp/RequestServlet");
		out.println("method=post> </br> <input type=submit name=UrmatorulExemplu? value=UrmatorulExemplu?></form>");

		out.println("</body></html>"); // ca sa mearga tre sa bagam
		// in url: ?a=30&b=12

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		/*
		 * PrintWriter out2 = response.getWriter(); int a2 =
		 * Integer.parseInt(request.getParameter("a2")); int b2 =
		 * Integer.parseInt(request.getParameter("b2")); out2.println("<html>");
		 * out2.println("<head><title>Servlet din doGet</title></head><body>");
		 * out2.println("<p> The sum of " + a2 + " and " + b2 + " is " + (a2 +
		 * b2) + "</p>"); out2.println("</body></html>");
		 */
		doGet(request, response);
	}

	protected void doPut(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doDelete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doHead(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doOptions(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doTrace(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
