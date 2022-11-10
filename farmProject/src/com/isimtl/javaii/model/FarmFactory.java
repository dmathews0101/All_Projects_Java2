package com.isimtl.javaii.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FarmFactory {
	
	 //animalId animalName animalPrice animalType farmNo 
	public static void  buildVehicles(ResultSet rs,Animals animal) throws SQLException
	{
		Farms farm;
		
		animal.setAnimalId(rs.getInt("animalId"));
		animal.setAnimalName(rs.getString("animalName"));
		animal.setAnimalPrice(rs.getDouble("animalPrice"));
		animal.setAnimalType(rs.getString("animalType"));
		animal.setFarmNo(rs.getInt("farmNo"));				
		
		farm = new Farms();
		
		farm.setFarmNo(rs.getInt("farmNo"));
		
		animal.setBrand(brand);
	}
//	`brandID`,`brand`
	public static void buildBrand(ResultSet rs, Brands brand) throws SQLException
	{
		brand.setBrand_id(rs.getInt("brandID"));
		brand.setBrand_name(rs.getString("brand"));
	}
	
	public static void buildBrand(Connection connection, Brands brand) throws SQLException {
		
		if (null == brand.getBrand_name())
		{
			Statement stmt = connection.createStatement();
			
			String query = "SELECT brand FROM brands WHERE brandID = "+ brand.getBrand_id();
			
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next())
			{
				brand.setBrand_name(rs.getString("brand"));
			}
		}
		
	}

}
