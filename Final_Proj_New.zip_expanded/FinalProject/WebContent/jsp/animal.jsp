<%@page import="com.isimtl.java2.model.Animal"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<H2>Animal List</H2>
		<table  width="50%" border="1">
			<thead>
				<tr>
					<th>Animal Id</th>
					<th>Animal Name</th>
					<th>Animal Price</th>
					<th>Animal Type</th>
				</tr>
			</thead>
			<tbody>
				<%
					StringBuilder builder = new StringBuilder("");			
					List<Animal> animal = (List<Animal>) request.getAttribute("animalList");
					for (Animal animals : animal) {
				%>
					<tr>
					<td><%= animals.getAnimal_id() %></td>
					<td><%= animals.getName() %></td>
					<td><%= animals.getPrice() %></td>
					<td><%= animals.getType() %></td>		
					</tr>
				<% } %>
			</tbody>
		</table>
		<a href="#" onClick="history.go(-1);">Display Farms</a><br>
		<a href="HomeServlet">Back to Home Page</a>
	</body>
</html>



</body>
</html>