package managers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Services.DBConnect;
import entites.Animal;
public class AnimalManager 
{
private static final String queryGetById="select * from animal where farm_id=?";
public static ArrayList<Animal> getByIdFarmer(int id)
{
	ArrayList<Animal> rtn=null;
	try {
		PreparedStatement ps=DBConnect.getPs(queryGetById);
		ps.setInt(1, id);
		ResultSet result=ps.executeQuery();
		if(result.isBeforeFirst())
			rtn=new ArrayList<>();
		while(result.next())
		{
			Animal a=new Animal();
			a.setId(result.getInt("animalid"));
			a.setName(result.getString("name"));
			a.setPrice(result.getInt("price"));	
			a.setType(result.getString("type"));
			rtn.add(a);
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return rtn;
}
}
