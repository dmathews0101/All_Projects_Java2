<%@page import="com.isimtl.java2.model.Farm"%>
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
<table width="50%" border="1">
<thead>
		<tr>
			<th>Farm Name</th>
			<th>Country</th>
			<th>Farmer Name</th>
			<th>List Animals</th>
		</tr>
		</thead>
		<tbody>
			<%
				StringBuilder builder = new StringBuilder("");			
				List<Farm> farms = (List<Farm>) request.getAttribute("farmList");
				for (Farm farm : farms) {
			%>
				<tr>
				<td><%= farm.getName_farm() %></td>
				<td><%= farm.getPays() %></td>
				<td><%= farm.getFarmer().getName() %></td>
				<td><a href="AnimalServlet?farm_id=<%=farm.getFarm_id()%>"> Display Animals</a></td>			
				</tr>
			<%
				}
			%>
			</tbody>
		</table>
		<a href="HomeServlet">Back to Home Page</a>
</body>
</html>