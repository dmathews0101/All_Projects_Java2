<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Expressions</title>
</head>
<body><H2> JSP Expressions </ H2>
<%
	String testParamValue = request.getParameter("testParam");
	String namettributeValue = (String) request.getAttribute("name");
%>
<UL>
<LI> Current time: <%= new java.util.Date ()%>
<LI> Your hostname: <%= request.getRemoteHost ()%>
<% if ((null != testParamValue) && testParamValue.trim().length() > 0)
	{
	%>
<LI> The <CODE> testParam </CODE> form parameter:
<%= testParamValue%>
<% } else {%>
<LI> The <CODE> testParam </CODE> parameter is not provided
<% } %>
<% if ((null != namettributeValue) && namettributeValue.trim().length() > 0)
	{
	%><LI> The <CODE> name attribute </CODE> from HomeServlet:
<%= namettributeValue%>
<% } else {%>
<LI> The <CODE> name </CODE> attribute is not provided
<% } %>

</UL>

</body>
</html>