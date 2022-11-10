<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Expressions</title>
</head>
<body>
<h2> JSP Expressions </h2>
<ul>
<li> Current Time: <%=new java.util.Date () %>
<li> Your hostname: <%= request.getRemoteHost() %>
<li> The <CODE> testParam </CODE> form parameter : 
<%= request.getParameter("testParam") %>
</ul>
<li> The <CODE> name attribute </CODE> from HomeServlet : 
<%= request.getAttribute("name") %>
</ul>
</body>
</html>