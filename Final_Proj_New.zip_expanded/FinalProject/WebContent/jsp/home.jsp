<%@page import="com.isimtl.java2.model.Farm"%>
<%@page import="com.isimtl.java2.model.Farmer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
   .field{
   border-syle: double;
   border-color: blue;
   width:150px;
   height:75px
   }
   
   .field1{
   border-syle: double;
   border-color: blue;
   width:215px;
   height:75px
   }


</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h2>Filter Farm</h2>
	
	<%
		StringBuilder builder = new StringBuilder("");			
		List<Farmer> farmer   = (List<Farmer>) request.getAttribute("farmerList");
		List<Farm> farm		  = (List<Farm>) request.getAttribute("countriesList");
		
	
	%>
	
	<form method="POST" action="FarmServlet" style="float:left">
	<fieldset class= "field" >
		<label>Filter By Country</label>
		<select name="country" >
			<% for (Farm farms : farm) { %>
				<option value="<%= farms.getPays() %>"><%= farms.getPays() %></option>
			<% } %>
		</select>
		<input type="submit" value="Display">
		</fieldset>
	</form>
	
	<form method="POST" action="FarmServlet">
	<fieldset class= "field1" >
		<label>Filter By Farmer</label>
			<select name="farmer">
			<% for (Farmer farmers : farmer) { %>
				<option value="<%= farmers.getFarmer_id() %>"><%= farmers.getName() %></option>
			<% } %>
		</select>
		<input type="submit" value="Display">
	</form>
	

</body>
</html>