package com.isimtl.java2.main;

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
 * Servlet implementation class CurrentDT
 */
@WebServlet("/CurrentDT")
public class CurrentDT extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CurrentDT() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	      // Set response content type
	      response.setContentType("text/html");
	 
	      PrintWriter out = response.getWriter();
	      
		  response.setIntHeader("Refresh",3);
	      
	      String title = "Nous somme le : ";
	      Date date = new Date();
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";	      	    
	      
	      out.println(docType +
	         "<html>\n" +
	            "<head><p>" + "</p></head>\n" +
	            "<body>\n" +
	               "<p>" + title 
	                + date.toString() + "</p>\n" +"</body> </html>");	
	      
	  	 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 Date date1 = new Date();
		 //System.out.println(dateFormat.format(date1)); //2016/11/16 12:08:43
		 
		 //out.println("\n1.Nous somme le : " + date1);

		 //out.println("\nNous somme le : " + dateFormat.format(date1));
		 
		 

		  Calendar cal = Calendar.getInstance();
		  Date date2=cal.getTime();
		  DateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		  String formattedDate=dateFormat2.format(date2);
		  out.println("\nNous somme le : "+ formattedDate);
		 
		 
	      }



}
