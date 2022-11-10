package com.isimtl.javaii.club.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.Session;

import com.isimtl.javaii.club.model.User;


public class UserDAO {
	
	private Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/club", "root", "admin");
	}
	
	public User getUser(String pUserName) throws Exception
	{
		Connection connection = null;
		User currentUser = null;
		
		try
		{
			connection = getConnection();
			String query = "SELECT * FROM user WHERE user_name = ?";
			
			PreparedStatement pStmt = connection.prepareStatement(query);
			pStmt.setString(1, pUserName);
			ResultSet rs=pStmt.executeQuery();
			
			while(rs.next())
			{
				currentUser=new User();
				currentUser.setId(rs.getInt("id"));
				currentUser.setFirstName(rs.getString("first_name"));
				currentUser.setLastName(rs.getString("last_name"));
				currentUser.setUserName(rs.getString("user_name"));
				currentUser.setBgColor(rs.getString("bg_color"));
				currentUser.setPassword(rs.getString("pwd"));
				currentUser.setImgPath(rs.getString("img"));
			}
			//Complete the code
			
		}
		finally {
			
			if (null != connection)
			{
				connection.close();
			}
		}
		
		return currentUser;
	}
	
	public void updateColor(String pUserName, String pColor) throws Exception
	{
		Connection connection = null;
		System.out.print("Hey"+pColor);
		try
		{
			connection = getConnection();
			String query = "UPDATE user SET bg_color = ? WHERE user_name = ?";
			
			PreparedStatement pStmt = connection.prepareStatement(query);
			
			pStmt.setString(1, pColor);
			pStmt.setString(2, pUserName);
			int rs=pStmt.executeUpdate();
			
		}
		finally {
			
			if (null != connection)
			{
				connection.close();
			}
		}
	}
}