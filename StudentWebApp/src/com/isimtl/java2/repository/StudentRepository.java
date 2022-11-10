package com.isimtl.java2.repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

import com.isimtl.java2.model.Student;

public class StudentRepository 
{
	private static final String FILE_TUDENTS = "c:/dev/Students.txt";
	private static final String FILE_OUTPUT_NAME = "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\ROOT\\ex01\\students.html";

	
	private static List<Student> readFile(String pFileName) throws IOException
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
	
	public static String getStudentsListAsHTML() throws IOException 
	{
		return getStudentsListAsHTML(false);
	}
	public static String getStudentsListAsHTML(boolean pHighlighted) throws IOException 
	{
		List<Student> students = readFile(FILE_TUDENTS);
		
		int randomIndex = pHighlighted ? new Random().nextInt(students.size()):-1;
		
		return getStudentsToHTMLTable(students, randomIndex);
	}
	
	//Generate html file with Students list : Students.html (header, body...)
	private static String getStudentsToHTMLTable(List<Student> pStudents, int pIndextoHighLight) throws IOException
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
		
		StringWriter strWriter = new StringWriter();
		
		BufferedWriter writer=new BufferedWriter(strWriter);
		
		
	
		writer.write("<html>");
		writer.newLine();
		String contentString=Student.toHTMLHeaderString("&nbsp;");
		writer.newLine();
		writer.write("<body>");
		writer.newLine();
		writer.write("<table>");
		writer.newLine();
		writer.write(contentString);
		
		writer.newLine();
		int index=0;

		
		for(Student student:pStudents)
		{
			writer.write(student.toPaddingHTMLString("&nbsp;",(index == pIndextoHighLight)));
			writer.newLine();
			index++;
		}
		writer.newLine();
		writer.write("</table>");
		writer.newLine();
		writer.write("</body>");
		writer.newLine();
		writer.write("</html>");
		writer.newLine();
		writer.close();
		
		return strWriter.toString();
	}
	
}


//no save,return stud