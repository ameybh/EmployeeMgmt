<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page import="java.sql.ResultSet" %>
<%@page import="com.databse.DatabaseConnector" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.PreparedStatement"%>

<body>
<hr>
		<form action="Display" method ="post">
			<h2>
				
				<%
					try {
			 Connection con = DatabaseConnector.initializeDatabase();
			 PreparedStatement st = con.prepareStatement("select * from admindetails"); 
			 ResultSet rs = st.executeQuery(); 
				while(rs.next())
 					{
						out.println(rs.getString(1));
  						
  						out.println(rs.getString(2));
  					    
  						out.println(rs.getString(3));
  						out.println("<br>");
 

 					}
	         //request.setAttribute("ResultSet", rs);
			 st.close(); 
	         con.close();
	         }
		catch(Exception E) 
		{
			System.out.println(E);
		}
				
				%>
<button onclick=location.href='http://localhost:8080/EmployeeMgmt/WelcomAdmin.jsp'>Go Back</button>
			</h2>
		</form>
	
</body>
</html>