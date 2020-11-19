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
<%String name=request.getAttribute("user").toString()
;%>
<h3>Welcome <%=request.getAttribute("user") %></h3>
<form action="" method="post">
<table>
<%if("Admin".equals(name)){ %>
<tr><td>
<input type="button" value="Profile Creation" name="Profile Creation" onclick="location.href='Profile_Creation.jsp';"></td></tr>
<tr><td><input type=button value="Account Creation" name="Account Creation" onclick="location.href='Account_Creation.jsp';"></td></tr>
<tr><td><input type=button value="Policy Creation" name="Policy Creation" onclick="location.href='Policy_Creation';"></td></tr>
<tr><td><input type=button value="View Policy" name="View Policy"  onclick="location.href='NewFile.jsp';"></td></tr>
<tr><td><input type=button value="Report Generation" name="Report Generation" onclick="location.href='Report_Generation.jsp';"></td></tr>

<%} else if("Agent".equals(name)){ %>
<tr><td>
<input type=button value="Profile Creation" name="Profile Creation" onclick="location.href='Profile_Creation.jsp';" disabled></td></tr>
<tr><td><input type=button value="Account Creation" name="Account Creation" onclick="location.href='Account_Creation.jsp';"></td></tr>
<tr><td><input type=button value="Policy Creation" name="Policy Creation" onclick="location.href='Policy_Creation';" ></td></tr>
<tr><td><input type=button value="View Policy" name="View Policy"  onclick="location.href='NewFile.jsp';" ></td></tr>
<tr><td><input type=button value="Report Generation" name="Report Generation" onclick="location.href='Report_Generation.jsp';" disabled></td></tr>

<%} else if("User".equals(name)){%>
<tr><td>
<input type=button value="Profile Creation" name="Profile Creation" onclick="location.href='Profile_Creation.jsp';" disabled></td></tr>
<tr><td><input type=button value="Account Creation" name="Account Creation" onclick="location.href='Account_Creation.jsp';"></td></tr>
<tr><td><input type=button value="Policy Creation" name="Policy Creation" onclick="location.href='Policy_Creation';" disabled></td></tr>
<tr><td><input type=button value="View Policy" name="View Policy"  onclick="location.href='NewFile.jsp';" ></td></tr>
<tr><td><input type=button value="Report Generation" name="Report Generation" onclick="location.href='Report_Generation.jsp';" disabled></td></tr>

<%} else{%>
<tr><td>Error Encountered</td></tr>
<%} %>
<tr><td><input type="button" name="logOut" value="LogOut" onclick="location.href='Logout.jsp';"></td></tr>
</table>
</form>
</body>
</html>