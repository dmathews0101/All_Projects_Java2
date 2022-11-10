<%@page import="entites.Farm" %>
<%@page import="entites.Animal" %>
<%@page import="actions.listofAnimals" %>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%
ArrayList<Farm> farm=(ArrayList<Farm>) request.getAttribute("Farms");
ArrayList<Animal> animals=(ArrayList<Animal>) request.getAttribute("AnimalAction");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Filter Farm</h1>
<form method="post" action="displayAnimal">
<h2>Filter per Farm</h2>
<select name="farm">
<%
for(Animal a:animals){%>
<option  value="<%=a.getFarmid() %>"><%=a.getName() %></option>    <%} %>
</select>
<input type="submit" value="Display">
</form>
</body>
</html>