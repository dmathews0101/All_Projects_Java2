package com.isimtl.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testServlet
 */
@WebServlet("/testServlet")
public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	      response.setContentType("text/html");
	 	 
	      PrintWriter out = response.getWriter();
	      
		  response.setIntHeader("Refresh",3);
	      
	      //String title = "Nous somme le : ";
	      Date date = new Date();
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";	      	    
	      
	      out.println(docType +
	         "<html>\n" +
	            "<head><p>" + "</p></head>\n" +
	            "<body>\n" +
	               "<p>"  
	                + "</p>\n");	
	      	  	 		 

		  Calendar cal = Calendar.getInstance();
		  Date date2=cal.getTime();
		  DateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		  String formattedDate=dateFormat2.format(date2);
		  out.println("\nNous somme le : "+ formattedDate);
		 
		  
		  out.println("</body> </html>");	
		  
		 	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
