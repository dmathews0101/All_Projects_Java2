<%@page import="com.isimtl.javaii.club.model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>-- User Dashboard --</title>
</head>
<body>
<% User currentUser = (User) session.getAttribute("currentUser");

String applicationContextPAth = application.getContextPath()+"/";

%>
<img alt="<%= "img" %>" height="15%" width="15%" src="<%= applicationContextPAth %><%= currentUser.getImgPath() %>">
<div style="background-color: <%= currentUser.getBgColor()  %>">
<label>First Name : <%=  currentUser.getBgColor() %></label><br>
<label>Last Name : <%=  currentUser.getLastName()  %></label><br>
</div>
<form action="HomeServlet" method="post">
<input type="hidden" name="changeColor" value="yes" />
<select id="selectedColor">
<option id="blue">Blue</option>
<option id="green">Green</option>
<option id="orange">Orange</option>
<option id="red">Red</option>
<option id="white">White</option>
<option id="yellow">Yellow</option>
</select>
<input type="submit" value="Change Color" />
</form>

<form action="HomeServlet" method="post">
<input type="hidden" name="logout" value="yes" />
<input type="submit" value="Logout" />

</form>
</body>
</html>