<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Account_Creation" method="post">
<table>
<tr><td>Enter the Name</td><td><input type="text" name="Insured_Name"></td></tr>
<tr><td>Enter the Street</td><td><input type="text" name="Insured_Street"></td></tr>
<tr><td>Enter the City</td><td><input type="text" name="Insured_City"></td></tr>
<tr><td>Enter the State</td><td><input type="text" name="Insured_State"></td></tr>
<tr><td>Enter the Zip</td><td><input type="text" name="Insured_Zip"></td></tr>
<tr><td>Choose the Bussiness Segment</td><td> <input list="bus_segs" name="bus_Seg" id="bus_Seg" placeholder="select">
<datalist id="bus_segs">
<option value="Business Auto">
<option value="Restaurant">
<option value="Appartment">
<option value="General Merchant">
</datalist>
</td></tr>
<tr><td><input type="hidden" name="account" value="125"></td></tr>
<tr><td><input type="submit" name="submit" value="Submit"></td></tr>
</table>
</form>
</body>
</html>