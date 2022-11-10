
<%@page import="model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="manager.SessionManager"%>
<%@page import="manager.StudentManager"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    ArrayList<Student> students = StudentManager.getAll();
	ArrayList<Student> studentsFromSession = SessionManager.getArrayFromSession(request);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students Display</title>
</head>
<body>

<h1>Students List</h1>
<table>
	<% for(Student e : students){%>
		<tr>
			<td><%=e.getId()%></td>
			<td><%=e.getLastName() %></td>
			<td><%=e.getFirstName() %></td>
			<td><a href="studentServlet?action=add&id=<%=e.getId()%>"><%=(session.getAttribute(""+e.getId())!= null ? "In List":"Add" )%></a></td>
		</tr>
	<%} %>

</table>


<%if(studentsFromSession != null && !studentsFromSession.isEmpty()) {%>
			
			<h1>Students List From The Session (ID : <%=session.getId()%>)</h1>
			<table>
			
			<%for(Student studentToPrint : studentsFromSession) {%>
				<tr>
			<td><%=studentToPrint.getId()%></td>
			<td><%=studentToPrint.getLastName() %></td>
			<td><%=studentToPrint.getFirstName() %></td>
			<td><a href="studentServlet?action=remove&id=<%=studentToPrint.getId()%>">Remove</a></td>
		</tr>
				
				
			<%}%>
			</table>	
				
		<%}else{
			
			out.print("<h1>No Student In the Session</h1>");
			
		}%>
		
				

</body>
</html>