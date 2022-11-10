<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>jsp declaration</h1>
<%! private int accessCount = 0; %>
<% int accessCount2 = 0; %>
<h2> Accesses to page since:
<%= ++accessCount %></h2>

<h2> Accesses 2 page since :
<%= ++accessCount2 %></h2>

</body>
</html>