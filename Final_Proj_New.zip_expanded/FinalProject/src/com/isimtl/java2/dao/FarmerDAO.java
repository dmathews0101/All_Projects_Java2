package com.isimtl.java2.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.isimtl.java2.model.DbFarmFactory;

import com.isimtl.java2.model.Farmer;

public class FarmerDAO extends DbFarmDAO {
	

	public List<Farmer> getAllFarmer() throws Exception
	{
		List<Farmer> farmers = new ArrayList<>();
		
		Connection connection = getConnection();
		
		Statement stmt = connection.createStatement();
		String query = "SELECT * FROM farmer";
		
		ResultSet rs = stmt.executeQuery(query);
		
		Farmer farmer;
		
		while(rs.next())
		{
			farmer = new Farmer();
			DbFarmFactory.buildFarmer(rs,farmer);
			farmers.add(farmer);
		}
		
		connection.close();
		
		
		return farmers;
	}	

}


