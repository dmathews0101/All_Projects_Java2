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


<%
	String testParamValue = request.getParameter("testParam");
	String nameattributeValue = (String)request.getAttribute("name");
%>

<ul>
<li> Current Time: <%=new java.util.Date () %>
<li> Your hostname: <%= request.getRemoteHost() %>

<% if ((null != testParamValue)&& testParamValue.trim().length()>0) 
{
%>

<li> The <CODE> testParam </CODE> form parameter : 
<%= testParamValue %>

<% } else {%>
<li> The <CODE> testParam </CODE> parameter is not provided
<% } %>


<% if ((null != nameattributeValue)&& nameattributeValue.trim().length()>0) 
{
%>
<li> The <CODE> name attribute </CODE> from Home Servlet : 
<%= nameattributeValue %>

<% } else {%>
<li> The <CODE> testParam </CODE> parameter is not provided
<% } %>
</ul>

</body>
</html>