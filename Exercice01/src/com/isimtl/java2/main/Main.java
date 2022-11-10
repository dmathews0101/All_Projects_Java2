package com.isimtl.java2.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.isimtl.java2.model.Student;

public class Main {
	
	private static final String FILE_TUDENTS = "c:/dev/Students.txt";
	private static final String FILE_OUTPUT_NAME = "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\ROOT\\ex01\\students.html";

	
	private static List<Student> readFile(String pFileName) throws Exception
	{
		List<Student> students = new ArrayList<Student>();
		
		BufferedReader bufferR = new BufferedReader(new FileReader(pFileName));
		
		String currentLine = bufferR.readLine();
		Student studentToAdd;
		
		while (null != currentLine)
		{
			
			studentToAdd = new Student();
			buildStudentFromLine(studentToAdd,currentLine);students.add(studentToAdd);
			 
			 currentLine = bufferR.readLine();
		}
		
		bufferR.close();
		
		return students;
		
	}
	
	private static void buildStudentFromLine(Student studentToAdd, String currentLine) {
		StringTokenizer tokenizer = new StringTokenizer(currentLine, ",");
		
		String firstName = tokenizer.nextToken();
		studentToAdd.setFirstName(firstName);
		
		String remainingStr = tokenizer.nextToken();
		
		tokenizer = new StringTokenizer(remainingStr, "(");
		
		String lastName = tokenizer.nextToken().trim();
		studentToAdd.setLastName(lastName);
		
		remainingStr = tokenizer.nextToken().replace(")","");
		tokenizer = new StringTokenizer(remainingStr, " ");
		
		String idStr = tokenizer.nextToken().trim();
		studentToAdd.setId(Integer.parseInt(idStr));
		
		String userName = tokenizer.nextToken().trim();
		studentToAdd.setUserName(userName);
	}

	private static void displayStudentsTable(List<Student> pStudents)
	{
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("| ID       |        First Name       |        Last Name        | User Name     |");
		System.out.println("-------------------------------------------------------------------------------");
		
		for(Student student:pStudents)
		{
			System.out.println(student.toPaddingString());
			System.out.println("-------------------------------------------------------------------------------");
		}
	}
	
	//Generate html file with Students list : Students.html (header, body...)
	private static void saveStudentsToHTMLTable(List<Student> pStudents) throws Exception
	{
		/*
		File fileToSave = new File("c:\\dev\\students.html");
		BufferedWriter bufferW = new BufferedWriter(new FileWriter(fileToSave));
		
		
		bufferW.write("<html>");
		bufferW.newLine();
		
		String content = Student.toHTMLHeaderString(pPadding)
		
		Student.toHTMLHeaderString("&nbsp;");
		
		for(Student student:pStudents)
		{
			System.out.println(student.toPaddingString("&nbsp;"));
			
			//System.out.println("-----------------------------------------------------------------");
		}
		*/
		//File fileToSave =new File("c:\\dev\\students.html");
		
		File fileToSave =new File(FILE_OUTPUT_NAME);
		
		BufferedWriter writer=new BufferedWriter(new FileWriter(fileToSave));
		writer.write("<html>");
		writer.newLine();
		String contentString=Student.toHTMLHeaderString("&nbsp;");
		writer.newLine();
		writer.write("<body>");
		writer.newLine();
		writer.write("<table>");
		writer.newLine();
		writer.write(contentString);
		for(Student student:pStudents)
		{
			writer.write(student.toPaddingHTMLString("&nbsp;"));
			writer.newLine();
		}
		writer.newLine();
		writer.write("</table>");
		writer.newLine();
		writer.write("</body>");
		writer.newLine();
		writer.write("</html>");
		writer.newLine();
		writer.close();
	}
	
	/*
	 *
	private static void saveStudentToHtml(List<Student> pStudents) throws IOException
	{
		File fileToSave =new File("C:\\\\Users\\\\kpanchal\\\\Downloads\\\\java-II\\\\Projects\\\\Students.html");
		BufferedWriter writer=new BufferedWriter(new FileWriter(fileToSave));
		writer.write("<html>");
		writer.newLine();
		String contentString=Student.toHtmlHeadrerString("&nbsp;");
		writer.newLine();
		writer.write("<body>");
		writer.newLine();
		writer.write("<table>");
		writer.newLine();
		writer.write(contentString);
		for(Student student:pStudents)
		{
			writer.write(student.toPaddingHTMLString("&nbsp;"));
			writer.newLine();
		}
		writer.newLine();
		writer.write("</table>");
		writer.newLine();
		writer.write("</body>");
		writer.newLine();
		writer.write("</html>");
		writer.newLine();
		writer.close();
		
	}
	 * 
	 * */
	
	
	public static void main(String[] args) throws Exception {

		List<Student> students = readFile(FILE_TUDENTS);		
		saveStudentsToHTMLTable(students);
		
	}
  
}
