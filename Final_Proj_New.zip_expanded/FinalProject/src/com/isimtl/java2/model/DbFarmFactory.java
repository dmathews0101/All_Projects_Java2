package com.isimtl.java2.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbFarmFactory {

	public static Farm buildFarm(ResultSet rs, Farm farm) throws SQLException
	{
		
		Farmer farmer;
		
		farm.setFarm_id(rs.getInt("farm_id"));
		farm.setName_farm(rs.getString("name_farm"));
		farm.setPays(rs.getString("pays"));
				
		farmer = new Farmer();
		farmer.setFarmer_id(rs.getInt("farmer_id"));
		
		farm.setFarmer(farmer);
		
		return farm;
	}
	
	public static Animal buildAnimal(ResultSet rs, Animal animal) throws SQLException
	{
		
		Farm farm;
		
		animal.setAnimal_id(rs.getInt("animal_id"));
		animal.setName(rs.getString("name"));
		animal.setType(rs.getString("type"));
		animal.setPrice(rs.getDouble("prix"));
				
		farm = new Farm();
		farm.setFarm_id(rs.getInt("farm_id"));
		
		animal.setFarm(farm);
		
		return animal;
	}
	
	public static void buildFarmer(ResultSet rs, Farmer farmer) throws SQLException
	{
		farmer.setFarmer_id(rs.getInt("farmer_id"));
		farmer.setName(rs.getString("name"));
		
	}
	
	public static void buildFarmer(Connection connection, Farmer farmer) throws SQLException
	{
		if(null == farmer.getName())
		{
			Statement stmt = connection.createStatement();
			
			String query   = "SELECT name FROM farmer WHERE farmer_id = "+ farmer.getFarmer_id();
			
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next())
			{
				farmer.setName(rs.getString("name"));
			}
		}
		
	}
	
	
	
}
