package com.isimtl.java2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/registerf")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		
		System.out.println("inside Post method");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Greetings Page</title></head>");
		out.println("<body>");
		out.println("<form name = \"home\" action=\"home\" method=\"get\">");
		out.println("<h3>Hello  </h3>"+firstName+"  "+lastName);

		out.println("<button type=\"submit\" value=\"Submit\">Regitser Form</button>");
		out.println("</form></body></html>");
		
		out.close();
		*/
		
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		
		System.out.println("inside Post method");
		
		response.setContentType("text/html");
		//get hold of the output stream to write in the response to the client
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Registration Success</title></head>");
		out.println("<body>");
		
		out.println(String.format("<h1>Hello %s %s</h1>", firstName, lastName));
		//out.println("<button type=\"button\" name = \"return\" onclick=\"window.history.go(-1); return false;\">Return</button>");
		
		out.println("<form action=\"home\" method=\"post\"><button type=\"submit\" name=\"submit\">Return</button></form>");		
		out.println("</body></html>");
		
		//close the stream   
		out.close();         	
	}

}
