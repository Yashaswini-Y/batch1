<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login_Page</title>
<style>
body{
background-color:lightblue;}
</style>
</head>
<body>
<div align="center">
<h1>Online Insurance Quote Generation System</h1>
<h2>Login Page</h2>
<form action="Login" method="post">
<table>
<tr><td>Enter UserName</td><td><input type="text" name="userName" required></td></tr>
<tr><td>Enter Password</td><td><input type="password" name="password" pattern=".{4,}" title="Password should contain 4 characters atleast" required></td></tr>
<tr><td><input type="submit" name="login" value="Login"></td></tr>
</table>
</form></div>
</body>
</html>