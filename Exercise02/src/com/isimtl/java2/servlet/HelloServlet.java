package com.isimtl.java2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	/*
	the doGet method is polymorphic (do NOT invoke the super.doGet () here,
	the parent method returns an unsupported method error if it is not
	polymorphic)
	*/
	//you can write in the server console (to make records)
	System.out.println("inside doGet method");
	
	// define the content type of the response
	response.setContentType("text/html");
	//get hold of the output stream to write in the response to the client
	PrintWriter out = response.getWriter();
	//write html in the response
	out.println("<html><head><title>Welcome Page</title></head>");
	out.println("<body>");
	out.println("<h1>Hello world from Java servlet</h1>");
	out.println("</body></html>");
	//close the stream
	out.close();
	}


}
