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
<form action="Login" method="post">
<table>
<tr><td>Enter UserName</td><td><input type="text" name="userName"></td></tr>
<tr><td>Enter Password</td><td><input type="password" name="password"></td></tr>
<tr><td><input type="submit" name="login" value="Login"></td></tr>
</table>
</form>
</body>
</html>