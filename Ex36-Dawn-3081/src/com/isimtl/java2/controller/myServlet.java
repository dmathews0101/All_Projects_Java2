package com.isimtl.java2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myServlet
 */
@WebServlet("/myServlet")
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String page = request.getParameter("page");

		
		if (page == null)
			request.getRequestDispatcher("WEB-INF/page1.html").forward(request, response);
		else {
			switch (page) {
			case "1":
				request.getRequestDispatcher("WEB-INF/page1.html").forward(request, response);
				break;
			case "2":
				request.getRequestDispatcher("WEB-INF/page2.html").forward(request, response);
				break;
			case "3":
				request.getRequestDispatcher("WEB-INF/page3.html").forward(request, response);
				break;

			case "4":
				request.getRequestDispatcher("WEB-INF/page4.html").forward(request, response);
				break;	
			default:
				break;
			}
		}
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
