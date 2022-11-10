package com.isimtl.java2.model;

import java.util.ArrayList;

public class FillStudent 
{
	
	public static ArrayList<Student> FillMethod()
	{
		ArrayList<Student> stuArr = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.FirstName("Boule");		
		s1.setLastName("BOULE");
		s1.setAge(7);
		stuArr.add(s1);
		
		Student s2 = new Student();
		s2.FirstName("Gaston");		
		s2.setLastName("LAGAFFE");
		s2.setAge(12);
		stuArr.add(s2);
		
		Student s3 = new Student();
		s3.FirstName("Picsou");		
		s3.setLastName("DUCK");
		s3.setAge(24);
		
		
		
		stuArr.add(s3);
		
		return stuArr;				
	}
}
