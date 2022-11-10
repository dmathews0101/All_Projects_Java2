    package com.isimtl.javaii.club.servlet;

    import java.io.IOException;

    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import javax.servlet.http.HttpSession;

    import com.isimtl.javaii.club.controler.UserManager;
    import com.isimtl.javaii.club.model.User;

    /**
     * Servlet implementation class HomeServlet
     */
    @WebServlet("/HomeServlet")
    public class HomeServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    	
    	private UserManager userManager = new UserManager();
           
        /**
         * @see HttpServlet#HttpServlet()
         */
        public HomeServlet() {
            super();
        }

    	/**
    	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    	 */
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		HttpSession session = request.getSession();
    		
    		User authentifiedUser = (User) session.getAttribute("currentUser");
    		
    		if ((null != authentifiedUser) && (authentifiedUser.isAuthentified()))
    		{
    			
    			request.getRequestDispatcher("jsp/dashboard.jsp").forward(request, response);//internal on the request
    			
    			//Complete the code
    		}
    		else
    		{
    			request.getRequestDispatcher("jsp/login.jsp").forward(request, response);//internal on the request
    			
    			//Complete the code
    		}
    	}

    	/**
    	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    	 */
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		
    		HttpSession session = request.getSession();
    		String logOutParameter = request.getParameter("logout");
    		
    		if ("yes".equals(logOutParameter))
    		{
    			session.removeAttribute("currentUser");
    			session.removeAttribute("errorMsg");
    			
    			
    			request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
    			
    			
    			// Complete the code
    		}
    		
    		String changeColorParameter = request.getParameter("changeColor");
    		
    		if ("yes".equals(changeColorParameter))
    		{
    			User authentifiedUser = (User) session.getAttribute("currentUser");
    			String selectedColorParameter = request.getParameter("selectedColor");
    			
    			try {
    				userManager.updateUserColor(authentifiedUser. getUserName(), selectedColorParameter);
    			} catch(Exception e) {
    				e.printStackTrace();
    			}


    			//Complete the code
    		}
    		
    		String userName = request.getParameter("userName");
    		String userPwd = request.getParameter("userPwd");
    		
    		
    		
    		String errorMessage = null;
    		
    		User currentUser = null;
    		
    		try {
    			
    			currentUser = userManager.authenticateUser(userName, userPwd);
    			
    			// Complete the code : get The Authenticated user
    		} catch (Exception e) {
    			
    			errorMessage = "Error When trying to get Authenticate Use "+e.getMessage();
    		}
    		
    		if (null != currentUser)
    		{
    			session.setAttribute("currentUser", currentUser);
    		}
    		else
    		{
    			if (null == errorMessage)
    			{
    				errorMessage = "Can't Authenticate User.";				
    			}
    		}
    		
    		if (null != errorMessage)
    		{
    			session.setAttribute("errorMsg", errorMessage);
    			
    		request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
    		}
    		else
    		{
    			request.getRequestDispatcher("jsp/dashboard.jsp").forward(request, response);
    		}
    	}
    }
    
