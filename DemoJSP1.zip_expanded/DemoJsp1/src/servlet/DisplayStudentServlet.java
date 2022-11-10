package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import manager.StudentManager;
import model.Student;
import manager.SessionManager;

/**
 * Servlet implementation class DisplayStudent
 */
@WebServlet("/displayStudent")
public class DisplayStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		ArrayList<Student> stud = StudentManager.getAll();
		ArrayList<Student> stuFromSession = SessionManager.getArrayFromSession(request);
		out.println(
				"<html>"+
				"<head>"+
				"<title>Student Board</title>"+
				"</head>"+
				"<body>");
		out.print("<h1> Students List</h1>");
		out.print("<table>");
				for(Student e: stud) {
					out.print("<tr>");
					
					out.print("<td>" +e.getId() +"</td>");
					out.print("<td>" +e.getLastName()+"</td>");
					out.print("<td>" +e.getFirstName() +"</td>");
					out.print("<td><a href=\"gestionStudent?action=ajouter&id="+e.getId()+"\">"+ (session.getAttribute(""+e.getId())!= null ? "En Liste":"Ajouter" ) +"</a></td>");
					out.print("</tr>");
				}
				out.print("</table>");
		
		
				
				out.print("<h1> Liste depuis la session</h1>");
				
				if(stuFromSession != null && !stuFromSession.isEmpty()) {
				out.print("<table>");
						for(Student e: stuFromSession) {
							out.print("<tr>");
							
							out.print("<td>" +e.getId() +"</td>");
							out.print("<td>" +e.getLastName()+"</td>");
							out.print("<td>" +e.getFirstName() +"</td>");
							out.print("<td><a href=\"gestionStudent?action=retirer&id="+e.getId()+"\">Retirer </a></td>");
							out.print("</tr>");
						}
						out.print("</table>");
		
				out.print("</body>"+
				"</html>"
				);
				}
	}

}
