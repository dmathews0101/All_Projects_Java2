package com.isimtl.java2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.isimtl.java2.dao.FarmDAO;

/**
 * Servlet implementation class FarmServlet
 */
@WebServlet("/FarmServlet")
public class FarmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	FarmDAO farmDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FarmServlet() {
        super();
        farmDAO	   = new FarmDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String countryFilter = request.getParameter("country");
		String farmerFilter  = request.getParameter("farmer");
		
		PrintWriter out = response.getWriter();
		
		out.println(countryFilter);
		out.println(farmerFilter);
		
		try {
			if(null != countryFilter) {
				
				request.setAttribute("farmList", farmDAO.getAllFarmOfCountry(countryFilter));
			}
			if(null != farmerFilter) {
				
				request.setAttribute("farmList", farmDAO.getAllFarmsOfFarmer(farmerFilter));
			}
	
			request.getRequestDispatcher("jsp/farm.jsp").forward(request, response);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		out.close();
	}

}
