<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="java.util.*,com.insurance.quote.entity.Policy" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Policy Info</title>
<style>
table,td{
border:2px solid black;
}
td{
cell-padding:10px;
}
body{
background-color:lightblue;
}
</style>
</head>
<body>
<em><span style="float:right">Logged in as <%=session.getAttribute("role") %></span></em>
<div align="center">
<h2>Policy Detailed View</h2>
<table>
<%List<Policy> list=(ArrayList<Policy>)request.getAttribute("policy"); %>
<%if(list.size()==0){
	out.println("No active policies");%>
<%}else{ %>
<c:forEach var="policyInfo" items="${policy}">

<tr><td>Policy Number</td><td>${policyInfo.getPolicy_Number()}</td></tr>
<tr><td>Premium</td><td>${policyInfo.getPolicy_Premium()}</td></tr>
<tr><td>Account Number</td><td>${policyInfo.getAccount_Number()}</td></tr>
</c:forEach>
</table>
<%} %><br>
<form action="HomePage">
<input type="submit" value="Back">
</form>
</div>
</body>
</html>