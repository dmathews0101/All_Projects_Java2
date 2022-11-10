package actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import entites.Animal;
import managers.AllAnimalManager;
import managers.AnimalManager;

public class listofAnimals 
{
	public static void displayAnimalperFarm(HttpServletRequest req,int idfarm)
	{
		req.setAttribute("listofAnimals", AnimalManager.getByIdFarmer(idfarm));
	}
	public static void displayAnimal(HttpServletRequest req)
	{
		req.setAttribute("listofAnimals", AllAnimalManager.getAllAnimal());
	}
	
	public static ArrayList<Animal> displayAnimalperFarm(int idfarm)
	{
		return AnimalManager.getByIdFarmer(idfarm);
	}
}
