package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Post")
public class Post extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Post() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		/*PrintWriter out = response.getWriter();
		out.println("Hello mushroom din get");*/
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out2 = response.getWriter();
		out2.println("Hello mushroom din post");

		// afisezaCeva(response);
	}

	void afisezaCeva(HttpServletResponse x) {

		try {
			PrintWriter out2 = x.getWriter();
			out2.println("Hello mushroom din post");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
