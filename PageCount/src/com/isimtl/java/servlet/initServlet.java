package com.isimtl.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class initServlet
 */
@WebServlet("/initServlet")
public class initServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count; 

    public void init() { 
	      count = 0;
   } 

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public initServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	      response.setContentType("text/html");

	      count++; 
	      PrintWriter out = response.getWriter();
	      String title = "Total Number of times page is invoked : ";
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body>\n" +
	               "<h3 align = \"center\">" + title + "</h1>\n" +
	               "<h4 align = \"center\">" + count + "</h2>\n" +
	            "</body></html>"
	      );
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
