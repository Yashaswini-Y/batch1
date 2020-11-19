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
<form action="Profile_Creation" method="post">
      <label for="uname"><b>UserName</b></label>
      <input type="text" name="uname" required><br>
      <label for="psw"><b>Password</b></label>
      <input type="password" name="psw" required><br>
<label>Role</label>
             <select id = "myList" name="Role_Code">
              <option value = ""></option>
               <option value = "Admin">Admin</option>
               <option value = "Agent">Agent</option>
               <option value = "User">User</option>
             </select>
             <input type="submit" value="submit">
</form>
</body>
</html>