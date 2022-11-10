package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.SessionManager;
import manager.StudentManager;
import model.Student;

/**
 * Servlet implementation class StudentManager
 */
@WebServlet("/studentServlet")
public class StudentControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentControler() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		String id = request.getParameter("id");
		int idInt = Integer.parseInt(id);
		
		
		switch (action) {
		
		case "add":
			
			Student eToAdd = StudentManager.getById(idInt);
			SessionManager.add(request, eToAdd);
			
			
			break;
		case "remove":
			
			SessionManager.removeById(request, id);

			break;
		default:
			break;
		}

		
		response.sendRedirect("displayStudent.jsp");
	}

}
