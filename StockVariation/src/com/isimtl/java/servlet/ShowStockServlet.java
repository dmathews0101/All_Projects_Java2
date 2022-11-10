package com.isimtl.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowStockServlet
 */
@WebServlet("/ShowStockServlet")
public class ShowStockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowStockServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		response.setIntHeader("Refresh", 3);
		
		PrintWriter ps = response.getWriter();
		ps.write("Sun Microsystems : " + getRandomNumberBetween(20,100));		
		ps.write("<br/>Microsoft : " + getRandomNumberBetween(40,100));
		ps.write("<br/>Checkpoint Software : "+ getRandomNumberBetween(30,150));				
	}
	
	private static int getRandomNumberBetween(int min, int max) 
	{
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
