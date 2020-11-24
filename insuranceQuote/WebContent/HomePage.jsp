<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
body{
background-color:lightblue;}
button{
height:35px;
width:150px;}
</style>
</head>
<body>
<em><span style="float:right">Logged in as <%=session.getAttribute("role") %></span></em>
<div align="center">
<%String name=session.getAttribute("role").toString()
;%>
<h3>Welcome <%=session.getAttribute("role") %></h3>
<form action="" method="post" class="forms">
<table>
<%if("Admin".equals(name)){ %>
<tr><td>
<button type="button"  onclick="location.href='Profile_Creation.jsp';">Profile Creation</button></td></tr>
<tr><td><button type=button onclick="location.href='Account_Creation.jsp';">Account Creation</button></td></tr>
<tr><td><button type=button  onclick="location.href='NewPolicy.jsp';">Policy Creation</button></td></tr>
<tr><td><button type=button   onclick="location.href='ViewPolicy.jsp';">View Policy</button></td></tr>
<tr><td><button type=button  onclick="location.href='Report_Generation.jsp';">Report Generation</button></td></tr>

<%} else if("Agent".equals(name)){ %>
<tr><td>
<button type=button  disabled>Profile Creation</button></td></tr>
<tr><td><button type=button  onclick="location.href='Account_Creation.jsp';">Account Creation</button></td></tr>
<tr><td><button type=button  onclick="location.href='NewPolicy.jsp';" >Policy Creation</button></td></tr>
<tr><td><button type=button  onclick="location.href='ViewPolicy.jsp';" >View Policy</button></td></tr>
<tr><td><button type=button  disabled>Report Generation</button></td></tr>

<%} else if("User".equals(name)){%>
<% String accNum=request.getAttribute("accNumber").toString(); %>
<tr><td><% session.setAttribute("uAccNum",accNum);%>
<button type=button value="Profile Creation" name="Profile Creation" disabled>Profile Creation</button></td></tr>
<%if(accNum.equals("0")) { %>
<tr><td><button type=button  onclick="location.href='Account_Creation.jsp';">Account Creation</button></td></tr>
<tr><td><button type=button  disabled>Policy Creation</button></td></tr>
<tr><td><button type=button  onclick="location.href='ViewPolicy';" >View Policy</button></td></tr>
<tr><td><button type=button  disabled>Report Generation</button></td></tr>
<%} else { %>
<tr><td><button type=button  disabled>Account Creation</button></td></tr>
<tr><td><button type=button  disabled>Policy Creation</button></td></tr>
<tr><td><button type=button  onclick="location.href='ViewPolicy';" >View Policy</button></td></tr>
<tr><td><button type=button  disabled>Report Generation</button></td></tr>
<%} %>
<%} else{%>
<tr><td>Error Encountered</td></tr>
<%} %>
<tr><td><button type="button" name="logOut" value="LogOut" onclick="location.href='Logout.jsp';">LogOut</button></td></tr>
</table>
</form></div>
</body>
</html>