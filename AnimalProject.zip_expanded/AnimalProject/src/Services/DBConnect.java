package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class DBConnect
{
	private static final String url="jdbc:mysql://localhost:3306/farmdb";
	private static final String identifier="root";
	private static final String password="password";
	private static Connection connection = null; 
  
	public static void getConnection() throws SQLException 
	{
		try 
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, identifier, password);
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}
	public static void closeConnection()
	{
		try 
		{
			connection.close();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	public static PreparedStatement getPs(String query)
	{
		java.sql.PreparedStatement rtn=null;
		try 
		{
			if(connection==null || connection.isClosed())
				getConnection();
			rtn=connection.prepareStatement(query);
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return (PreparedStatement) rtn;
	}

}
