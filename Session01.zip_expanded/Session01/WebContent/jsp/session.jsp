<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session DashBoard</title>
</head>
<body>
<h2>Session Id <%=session.getId() %></h2>
<%  String name = request.getParameter("name");

if (null != name && name.trim().length() > 0)
{
	session.setAttribute("name", name);
}

String nameFromSession = (String) session.getAttribute("name");
%>
<h2>Session Attribute name is <%=nameFromSession %></h2>
</body>
</html>