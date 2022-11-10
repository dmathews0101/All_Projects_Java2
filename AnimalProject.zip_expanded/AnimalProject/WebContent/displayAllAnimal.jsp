<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>list of Animals</h1>
<table border="1">
<tr>
<th>Animal id</th>
<th>Animal Name</th>
<th>Animal Price</th>
<th>Animals Type</th>
</tr>
<c:forEach var="animal" items="${listofAnimals}">
<tr>
<td>${animal.animalid}</td>
<td>${animal.name}</td>
<td>${animal.price}</td>
<td>${animal.type}</td>
</tr>
</c:forEach>
</table>
</body>
</html>