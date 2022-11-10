package com.isimtl.java2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieLoginSuite
 */
@WebServlet("/CookieLoginSuite")
public class CookieLoginSuite extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Cookie loginCookie;       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieLoginSuite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String name = request.getParameter("name");
		String check = request.getParameter("remmember");
		
		PrintWriter out = response.getWriter();
						
		Cookie myCookie = new Cookie(name, check);
		myCookie.setMaxAge(60*2);
		response.addCookie(myCookie);
		
		out.println("<body>");
		out.println("Hey "+name +"!");
		
		out.println("</body>");
		out.println("</html>");
		out.close();
		
		//--
		*/
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Login Page</title></head>");
		response.setContentType("text/html");
		
		Cookie[] cookies= request.getCookies();
		String v1, v2, nameCookie;
		
		if(cookies==null)
		{			
			out.println("<form action='CookieLoginSuite' method='post'>"
					+"<h3>Page de login</h3><br><br>"
					+ "Nom d'usager: <input type='text' name='firstname'><br>"
					+"Se rappeler de mon d'usager" + "<input type = 'checkbox' name = 'remmember' value = 'Se rappeler de mon dusager' checked><br>"
					+ "<input type='submit' value='Soumettre'></form>");				
		}
		else
		{
			out.println("<form action='CookieLoginSuite' method = 'get'>");
			
			for (int i=0; i<cookies.length ; i++) 
			{				
				nameCookie = cookies[i].getName();
				
				if (nameCookie.equals("chbox")) 
				{
					v2 = cookies[i].getValue();	
					out.println("<br><h3>Checkbox Value :"+ v2 + "</h3>");

			        //request.setAttribute("remmember", cookies[i].getValue());           															
					cookies[i].setMaxAge(-1);
				}	
				
				if (nameCookie.equals("username")) 
				{					
					v1 = cookies[i].getValue();
					out.println(" "
							+ "Nom d'usager: <input type='text' name='firstname' value = '"+v1+"'><br>"
							+ "Se rappeler de mon d'usager" +"<input type = 'checkbox' name = 'remmember' value = 'Se rappeler de mon dusager' checked><br>");

			        
					request.setAttribute("username ", cookies[i].getValue());           															
					
			        //out.println("<body bgcolor = "+cookies[i].getValue());
					cookies[i].setMaxAge(-1);
				}				
				out.println("<input type='submit' value='Soumettre'></form>");	
				
			}
		}				
		out.println("</body></html>");	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
						
		loginCookie=new Cookie("username",request.getParameter("firstname"));
		loginCookie.setMaxAge(60*2);
		response.addCookie(loginCookie);
		
		loginCookie=new Cookie("chbox",request.getParameter("remmember"));
		loginCookie.setMaxAge(60*2);
		response.addCookie(loginCookie);
	
		doGet(request, response);
	}

}
