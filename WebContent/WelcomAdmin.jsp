<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Admin</title>
</head>
<body>
<h1>WELCOME <%=request.getParameter("t1") %></h1>

<button onclick=location.href='http://localhost:8080/EmployeeMgmt/Insert.jsp'>INSERT</button> 
<button onclick=location.href='http://localhost:8080/EmployeeMgmt/Update.jsp'>UPDATE</button> 

<button onclick=location.href='http://localhost:8080/EmployeeMgmt/Display.jsp'>DISPLAY</button>
<button onclick=location.href='http://localhost:8080/EmployeeMgmt/Delete.jsp'>DELETE</button> 

</body>
</html>