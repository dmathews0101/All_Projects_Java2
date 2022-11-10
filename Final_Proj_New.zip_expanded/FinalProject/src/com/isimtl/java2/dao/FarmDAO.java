package com.isimtl.java2.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.isimtl.java2.model.DbFarmFactory;
import com.isimtl.java2.model.Farm;




public class FarmDAO extends DbFarmDAO{
	
	
	public List<Farm> getAllFarmOfCountry(String country) throws Exception
	{
		List<Farm> farms = new ArrayList<>();
		
		Connection connection = getConnection();
		
		Statement stmt = connection.createStatement();
		String query = "SELECT * FROM farm WHERE pays = '"+country+"'";
		
		ResultSet rs = stmt.executeQuery(query);
		
		Farm farm;
		
		while(rs.next())
		{
			farm = new Farm();
			DbFarmFactory.buildFarm(rs,farm);
			farms.add(farm);
		}
		for (Farm currFarm:farms) {
			
			DbFarmFactory.buildFarmer(connection, currFarm.getFarmer());
		}
		
		connection.close();
		
		
		return farms;
	}	
	
	public List<Farm> getAllFarmsOfFarmer(String farmerId) throws Exception
	{
		List<Farm> farms 		= new ArrayList<>();
		Connection connection 	= getConnection();
		
		Statement stmt = connection.createStatement();
		String query   = "SELECT * FROM farm WHERE farmer_id="+farmerId;
		
		ResultSet rs   = stmt.executeQuery(query);
		
		Farm farm;
		
		while(rs.next())
		{
			farm = new Farm();
			DbFarmFactory.buildFarm(rs, farm);
			farms.add(farm);
		}
		
		for(Farm currentFarm:farms)
		{
			DbFarmFactory.buildFarmer(connection, currentFarm.getFarmer());
		}
		connection.close();
		
		return farms;
	}
	
	public List<Farm> getAllCountries() throws Exception
	{
		List<Farm> countries 	= new ArrayList<>();
		Connection connection 	= getConnection();
		
		Statement stmt = connection.createStatement();
		String query   = "SELECT * FROM farm group by pays";
		
		ResultSet rs   = stmt.executeQuery(query);
		
		Farm country;
		
		while(rs.next())
		{
			country = new Farm();
			DbFarmFactory.buildFarm(rs, country);
			countries.add(country);
		}

		connection.close();
		
		return countries;
	}

	
	
	
}






