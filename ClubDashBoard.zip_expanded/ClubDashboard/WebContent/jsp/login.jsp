<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Club</title>
</head>
<body>
<% String errorMessage = (String) session.getAttribute("errorMsg"); 
session.removeAttribute("errorMsg");
%>

<% if (null != errorMessage)  {%>
<h3 style="color:red"><%=errorMessage %></h3>
<% } %>
<h2>Enter your credentials:</h2>
<!--  Complete the form  -->
First Name: <input type="text" name="fname" value="" />
Last Name: <input type="text" name="lname" value="" />

<form action="HomeServlet" method="get">
<input type="submit" value="Login" />
</form>
</body>
</html>