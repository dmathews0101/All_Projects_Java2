<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<%
Connection dbCon = null;
Statement stmt = null;
ResultSet rs = null;

String query ="select count(*) from animal";

Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmdb","root","password"); 
//getting PreparedStatment to execute query
stmt = dbCon.prepareStatement(query);

//Resultset returned by query
rs = stmt.executeQuery(query);

while(rs.next()){
 int count = rs.getInt(1);
 System.out.println("count of stock : " + count);
} 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>