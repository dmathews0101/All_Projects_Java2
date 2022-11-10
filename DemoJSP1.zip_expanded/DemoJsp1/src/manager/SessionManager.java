package manager;

import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.Student;

public class SessionManager {

	
	public static void add(HttpServletRequest req, Student eToAdd) {
		HttpSession session = req.getSession();
		session.setAttribute(""+eToAdd.getId(), eToAdd);
	}
	
	public static  void removeById(HttpServletRequest req, String id ) {
		HttpSession session = req.getSession();
		
		if(session.getAttribute(id) != null) {
			session.removeAttribute(id);
		}
	}
	
	public static ArrayList<Student>  getArrayFromSession(HttpServletRequest req){
		ArrayList<Student> toReturn = new ArrayList<>();
		
		HttpSession session = req.getSession();
		
		
		Enumeration<String> listAttrSession =  session.getAttributeNames();
		
		if(listAttrSession != null) {
			while(listAttrSession.hasMoreElements()) {
				
				String key = listAttrSession.nextElement();
				Student e =  (Student) session.getAttribute(key);
				toReturn.add(e);
			}
			
		}				
		return toReturn;
	}				
}
