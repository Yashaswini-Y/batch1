<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Report Generation Results</title>
<style>
body{
background-color:lightblue;
}
table,td{
border:2px solid black;
}
td{
cell-padding:10px;}
</style>
</head>
<body>
<em><span style="float:right">Logged in as <%=session.getAttribute("role") %></span></em>
<div align="center">
<h2>Policy Detailed View</h2>
<table>
<c:forEach var="policy" items="${Account}">
<tr><td>Insured Name</td><td>${policy.insured_Name}</td></tr>
<tr><td>Insured State </td><td>${policy.insured_State}</td></tr>
<tr><td>Insured Zip</td><td>${policy.insured_Zip}</td></tr>
<tr><td>Business Segment</td><td>${policy.business_Segment}</td></tr>
</c:forEach>
<%!int num=1; %><%!int ans=1; %>
<c:forEach var="policy" items="${Ques}">
<tr><td>Question <%=num++ %></td><td>${policy}</td></tr>
</c:forEach>
<c:forEach var="policyAns" items="${Ans}">
<tr><td>Coverage <%=ans++ %></td><td>${policyAns}</td></tr>
</c:forEach>
<%String name=request.getAttribute("premium").toString(); %>
<tr><td>Premium Value</td><td><%=name %></td></tr>
</table><br>
<form action="HomePage">
<input type="submit" value="Back">
</form>
</div>
</body>
</html>