<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Policy</title>
<style>
body{
background-color:lightblue;}
</style>
</head>
<body>
<em><span style="float:right">Logged in as <%=session.getAttribute("role") %></span></em>
<div align="center">
<form action="ViewPolicy" method="get">
<table>
 <tr><td>Account number</td><td><input type="text" name="account_number" pattern="[0-9]{10}" title="Must Contain 10 digits" required></td></tr>
 <tr><td><input type="submit" value="view policy"></td>
 <td><input type="button" value="Back" onclick="location.href='HomePage';"></td></tr>
 </table>
 </form></div>
</body>
</html>