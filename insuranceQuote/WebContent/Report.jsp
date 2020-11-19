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
<h1>Policy Details</h1>

<table>
<table border="2">
<c:forEach var="policy" items="${Account}">
<tr><td>Insured Name</td><td>${policy.Insured_Name}</td></tr>
<tr><td>Insured State </td><td>${policy.Insured_State}</td></tr>
<tr><td>Insured Zip</td><td>${policy.Insured_Zip}</td></tr>
<tr><td>Business Segment</td><td>${policy.Business_Segment}</td></tr>
<!--  <tr><td>Question 1</td><td>${policy.Question1}</td></tr>
<tr><td>Question 2</td><td>${policy.Question2 }</td></tr>
<tr><td>Question 3</td><td>${policy.Question3 }</td></tr>
<tr><td>Question 4</td><td>${policy.Question4}</td></tr>
<tr><td>Question 5</td><td>${policy.Question5 }</td></tr>
<tr><td>Coverage 1</td><td>${policy.Coverage1}</td></tr>
<tr><td>Coverage 2</td><td>${policy.Coverage2}</td></tr>
<tr><td>Coverage 3</td><td>${policy.Coverage3}</td></tr>
<tr><td>Coverage 4</td><td>${policy.Coverage4 }</td></tr>
<tr><td>Coverage 5</td><td>${policy.Coverage4 }</td></tr>
<tr><td>Proposed Premium</td><td>${policy.ProposedPremium }</td></tr>-->
</c:forEach>
</table>
</body>
</html>