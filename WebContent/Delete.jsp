<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
<%@page import="java.sql.ResultSet" %>
<%@page import="com.databse.DatabaseConnector" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.PreparedStatement"%>
<body>
<form action="Delete" method ="post">
			<h2>
				Username : <input type ="text" name = "f1" required="required"><br>
				
				<input type ="submit" name = "b2" value = "Delete">
			</h2>
</form>>
</body>
</html>