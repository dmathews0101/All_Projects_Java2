package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Redirection
 */
@WebServlet("/redirection")
public class Redirection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Redirection() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = request.getParameter("url");

		String urlReturn = "";
		//request.getRequestDispatcher("redirection").forward(request, response);

		if (url == null)
			request.getRequestDispatcher("DisplayServlet").forward(request, response);
		else {
			switch (url) {
			case "1":
				urlReturn = "http://www.amazon.ca";
				break;

			case "2":
				urlReturn = "http://www.qwant.com";
				break;
			default:
				break;
			}
			response.sendRedirect(urlReturn);
		}

	}

}
