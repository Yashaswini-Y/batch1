<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Message Info</title>
<style>
body{
background-color:lightblue;}
</style>
</head>
<body>
<em><span style="float:right">Logged in as <%=session.getAttribute("role") %></span></em>
<div align="center">
<h3><%=request.getAttribute("Message") %></h3>
<a href="HomePage">Go back To Home Page</a>
</div>
</body>
</html>