package com.isimtl.java2.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class DbFarmDAO {

	protected Connection getConnection() throws Exception
	{  //(step1)
		Class.forName("com.mysql.jdbc.Driver");
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/farm_bd","root","admin");//return connection to database
	}
}
