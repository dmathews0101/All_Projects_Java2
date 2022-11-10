package manager;

import java.util.ArrayList;

import model.Student;

public class StudentManager {

	private static ArrayList<Student> stud;
	
	
	public static ArrayList<Student> getAll(){
		if(stud == null) {
			stud = new ArrayList<>();
			
			stud.add(new Student(1, "mamno", "yvette"));
			stud.add(new Student(12, "boulali", "sofiane"));
			stud.add(new Student(56, "gilbert", "pascal"));
			stud.add(new Student(789, "adipietro", "jason"));
			
			
		}
		
		
		return stud;
		
	}
	
	
	
	public static Student getById(int id) {
		Student toReturn = null;
		
		if(stud != null)
		for(Student e : stud) {
			if(e.getId() == id)
				toReturn = e;
			
		}
		
		return toReturn;
	}
	
}
