package com.isimtl.java2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OfficeChangeServlet
 */
@WebServlet("/OfficeChangeServlet")
public class OfficeChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OfficeChangeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String money = request.getParameter("money");
		String country = request.getParameter("country");
		
		//PrintWriter out = response.getWriter();

		//out.println(money);
		//out.println(country);


		Double amount = Double.parseDouble(request.getParameter("money"));
		Double res = 0.0;
		
		
		if(country.equalsIgnoreCase("us"))
		{
			res = 0.94 * amount;
		}
		else if(country.equalsIgnoreCase("fr"))
		{
			res = 0.70 * amount;
		}
		
		
		//--
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		
		out.println("<head>");
		out.println("<title>Currency Converter</title>");
		out.println("</head>");
		
		out.println("<body>");


		out.println("<br>");
		out.println("<br>Amount in :" +country+ " " + res);

		
		
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
