package com.isimtl.java2.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.isimtl.java2.model.Animal;
import com.isimtl.java2.model.DbFarmFactory;



public class AnimalDAO extends DbFarmDAO {
	
	public List<Animal> getAllAnimal(String farmId) throws Exception
	{
		List<Animal> animals = new ArrayList<>();
		
		Connection connection = getConnection();
		
		Statement stmt = connection.createStatement();
		String query = "SELECT * FROM animal where farm_id  = "+farmId;
		
		ResultSet rs = stmt.executeQuery(query);
		
		Animal animal;
		
		while(rs.next())
		{
			animal = new Animal();
			DbFarmFactory.buildAnimal(rs,animal);
			animals.add(animal);
		}
		
		
		connection.close();
		
		return animals;
	}

}
