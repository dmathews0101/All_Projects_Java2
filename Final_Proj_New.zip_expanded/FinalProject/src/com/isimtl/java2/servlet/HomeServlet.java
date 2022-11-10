package com.isimtl.java2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.isimtl.java2.dao.FarmerDAO;
import com.isimtl.java2.dao.FarmDAO;
/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	FarmerDAO farmerDAO;
	FarmDAO farmDAO;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        farmerDAO  = new FarmerDAO();
        farmDAO	   = new FarmDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		try {
			request.setAttribute("farmerList", farmerDAO.getAllFarmer());
			request.setAttribute("countriesList", farmDAO.getAllCountries());
			request.getRequestDispatcher("jsp/home.jsp").forward(request, response);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
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
