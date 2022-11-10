<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DEMO JSP FORM</title>
</head>
<body>


<%@ include file="includes/menu.jsp" %>


<form action="demoForm.jsp">

<input type="text" name="name" />
<input type="submit" value="ok" />
</form>


<%
if(request.getParameter("name") != null && !request.getParameter("name").equals("")){%>
	
	<h2>Welcome <%=request.getParameter("name") %></h2>
	
	
<%}

%>

<%@ include file="includes/menu.jsp" %>
</body>
</html>