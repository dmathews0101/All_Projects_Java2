package com.isimtl.java2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.isimtl.java2.model.FillStudent;
//import com.isimtl.java2.model.Student;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String cours = request.getParameter("cours");
		String time = request.getParameter("time");
		
		
		//--
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");

		//out.println("<h2>An unordered HTML list</h2>");

		out.println("<br>Les informations envoyees:");
		out.println("<br>Sessions :");
		out.println("<br>hiver, ");
		out.println("<br>ete,");
		
		out.println("<br>");
		out.println("<br>Nom :&Tab;"+nom);
		out.println("<br>Prenom :&Tab;"+prenom);
		out.println("<br>Cours :&Tab;"+cours);
		out.println("<br>Seance :&Tab;"+time);
			
		out.println("</body>");
		out.println("</html>");

		
		out.close();
		
		
		//---
		//out.println("");
		//out.println(String.format("Student with Id %s was selected !", nom));
		

		
	//	out.println("<form method =\"get\" action=\"RandomHighLightedListServlet\">");
	//	out.println("<button type=\"submit\" name =\"submit\">Return</button>");
	//	out.println("</form>");
	//	
		out.close();
		//int id1 =Integer.parseInt(request.getParameter("d")); 
		doGet(request,response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
