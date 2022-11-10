package com.isimtl.java2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.isimtl.java2.model.Student;
import com.isimtl.java2.model.FillStudent;
/**
 * Servlet implementation class myStudents
 */
@WebServlet("/myStudents")
public class myStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");

		//out.println("<h2>An unordered HTML list</h2>");

		ArrayList<Student> stuArray = FillStudent.FillMethod();
		out.println("<ul>");
		int i=0;
		for(Student str : stuArray )
		{
			i++;
			out.println("<li>");
			out.println("Etudiant numero: "+i);
			out.println("</li>");
			out.println("<li>");
			out.println(str.getFirstName());
			out.println("</li>");
			out.println("<li>");
			out.println(str.getLastName());
			out.println("</li>");
			out.println("<li>");
			out.println(str.getAge());
			out.println("</li>");
			out.println("<br>");
			
		}
		
		out.println("</ul>");

		out.println("</body>");
		out.println("</html>");

		
		out.close();
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
