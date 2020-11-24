<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create an Account</title>
<style>
body{
background-color:lightblue;}
</style>
</head>
<body>
<em><span style="float:right">Logged in as <%=session.getAttribute("role") %></span></em>
<div align="center">
<h2>Create an Account</h2>
<form action="Account_Creation" method="post">
<table>
<tr><td>Enter the Name</td><td><input type="text" name="Insured_Name" required></td></tr>
<tr><td>Enter the Street</td><td><input type="text" name="Insured_Street" required></td></tr>
<tr><td>Enter the City</td><td><input type="text" name="Insured_City" required></td></tr>
<tr><td>Enter the State</td><td><input type="text" name="Insured_State" required></td></tr>
<tr><td>Enter the Zip</td><td><input type="text" name="Insured_Zip" pattern="[0-9]{5}" title="Must contain 5 digits" required></td></tr>
<tr><td>Choose the Business Segment</td><td> <input list="bus_segs" name="bus_Seg" id="bus_Seg" placeholder="select" required>
<datalist id="bus_segs">
<option value="Restaurant">
<option value="Business Auto">
<option value="Appartment">
<option value="General Merchant">
</datalist>
</td></tr>
<tr><td><input type="hidden" name="account" ></td></tr>
<tr><td><input type="submit" name="submit" value="Submit"></td>
<td><input type="reset" name="reset" value="reset"></td></tr>
</table>
</form></div>
</body>
</html>