package com.isimtl.javaii.club.controler;

import com.isimtl.javaii.club.dao.UserDAO;
import com.isimtl.javaii.club.model.User;
import com.isimtl.javaii.club.util.HashUtils;

public class UserManager {
	
	private UserDAO userDAO = new UserDAO();
	
	public User authenticateUser(String pUserName,String pPwd) throws Exception
	{
		User currentUser = userDAO.getUser(pUserName);
		
		if (null != currentUser)
		{
			if (HashUtils.comparePwd(pPwd, currentUser))
			{
				currentUser.setAuthentified(true);
			}
			else
			{
				currentUser = null;
			}
		}
		
		
		return currentUser;
	}
	
	public void updateUserColor(String pUserName, String pColor) throws Exception
	{
		userDAO.updateColor(pUserName, pColor);
	}

	public static Object getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
