<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Creation</title>
<style>
body{
background-color:lightblue;}

</style>
</head>
<body>
<em><span style="float:right">Logged in as <%=session.getAttribute("role") %></span></em>
<div align="center">
<h2>Create a Profile</h2>
<form action="Profile_Creation" method="post">
<table>
<tr><td>Enter the UserName</td><td><input type="text" name="uname" required></td></tr>
<tr><td>Enter the Password</td><td><input type="password" name="psw" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@$#]).{4,}"
title="Must contain 4 characters atleast should contain only alphabets, numbers, @#$ only allowed" required></td></tr>
<tr><td>Choose the Role</td><td> <input list="role" name="Role_Code" id="Role_Code" placeholder="select" required>
<datalist id="role">
<option value="Admin">
<option value="Agent">
<option value="User">
</datalist>
</td></tr>
<tr><td><input type="submit" name="submit" value="Submit"></td>
<td><input type="reset" name="reset" value="reset"></td></tr>
</table>
</form>
</div>
</body>
</html>