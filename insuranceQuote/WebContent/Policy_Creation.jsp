<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="java.util.*,com.insurance.quote.entity.Policy_Questions,javax.servlet.http.HttpServletRequest"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy Creation</title>
<style>
body{
background-color:lightblue;}
</style>
</head>
<body>
<em><span style="float:right">Logged in as <%=session.getAttribute("role") %></span></em>
<div align="center">
<h2>Policy Creation</h2>
<form action="Policy_Creation" method="post"> 
<table>
<% List<Policy_Questions> list=(ArrayList<Policy_Questions>)request.getAttribute("policy"); %>
<tr><td>Business Segment Id</td><td><%=list.get(0).getBus_Seg_Id()%></td></tr>
<%String acc=request.getAttribute("acc_Num").toString(); %>

<tr><td>Policy Question Description </td><td><%=list.get(0).getPol_Ques_Desc() %></td></tr>
<tr><td>1: <input type="radio" name="ans1" value="<%=list.get(0).getPol_Ques_Ans1()%>" /><%=list.get(0).getPol_Ques_Ans1()%></td></tr> 
<tr><td>2: <input type="radio" name="ans1" value="<%=list.get(0).getPol_Ques_Ans2()%>" /><%=list.get(0).getPol_Ques_Ans2()%></td></tr>
<tr><td>3: <input type="radio" name="ans1" value="<%=list.get(0).getPol_Ques_Ans3()%>" /><%=list.get(0).getPol_Ques_Ans3()%></td></tr>
<tr><td>4: <input type="radio" name="ans1" value="<%=list.get(0).getPol_Ques_Ans4()%>" /><%=list.get(0).getPol_Ques_Ans4()%></td></tr>

<tr><td>Policy Question Description </td><td><%=list.get(1).getPol_Ques_Desc() %></td></tr>
<tr><td>1: <input type="radio" name="ans2" value="<%=list.get(1).getPol_Ques_Ans1() %>" /><%=list.get(1).getPol_Ques_Ans1()%></td></tr> 
<tr><td>2: <input type="radio" name="ans2" value="<%=list.get(1).getPol_Ques_Ans2()%>" /><%=list.get(1).getPol_Ques_Ans2()%></td></tr>
<tr><td>3: <input type="radio" name="ans2" value="<%=list.get(1).getPol_Ques_Ans3()%>" /><%=list.get(1).getPol_Ques_Ans3()%></td></tr>
<tr><td>4: <input type="radio" name="ans2" value="<%=list.get(1).getPol_Ques_Ans4()%>" /><%=list.get(1).getPol_Ques_Ans4()%></td></tr>

<tr><td>Policy Question Description </td><td><%=list.get(2).getPol_Ques_Desc() %></td></tr>
<tr><td>1: <input type="radio" name="ans3" value="<%=list.get(2).getPol_Ques_Ans1()%>" /><%=list.get(2).getPol_Ques_Ans1()%></td></tr> 
<tr><td>2: <input type="radio" name="ans3" value="<%=list.get(2).getPol_Ques_Ans2()%>" /><%=list.get(2).getPol_Ques_Ans2()%></td></tr>
<tr><td>3: <input type="radio" name="ans3" value="<%=list.get(2).getPol_Ques_Ans3()%>" /><%=list.get(2).getPol_Ques_Ans3()%></td></tr>
<tr><td>4: <input type="radio" name="ans3" value="<%=list.get(2).getPol_Ques_Ans4()%>" /><%=list.get(2).getPol_Ques_Ans4()%></td></tr>

<tr><td>Policy Question Description </td><td><%=list.get(3).getPol_Ques_Desc() %></td></tr>
<tr><td>1: <input type="radio" name="ans4" value="<%=list.get(3).getPol_Ques_Ans1()%>" /><%=list.get(3).getPol_Ques_Ans1()%></td></tr> 
<tr><td>2: <input type="radio" name="ans4" value="<%=list.get(3).getPol_Ques_Ans2()%>" /><%=list.get(3).getPol_Ques_Ans2()%></td></tr>
<tr><td>3: <input type="radio" name="ans4" value="<%=list.get(3).getPol_Ques_Ans3()%>" /><%=list.get(3).getPol_Ques_Ans3()%></td></tr>
<tr><td>4: <input type="radio" name="ans4" value="<%=list.get(3).getPol_Ques_Ans4()%>" /><%=list.get(3).getPol_Ques_Ans4()%></td></tr>

<tr><td>Policy Question Description </td><td><%=list.get(4).getPol_Ques_Desc() %></td></tr>
<tr><td>1: <input type="radio" name="ans5" value="<%=list.get(4).getPol_Ques_Ans1()%>" /><%=list.get(4).getPol_Ques_Ans1()%></td></tr> 
<tr><td>2: <input type="radio" name="ans5" value="<%=list.get(4).getPol_Ques_Ans2()%>" /><%=list.get(4).getPol_Ques_Ans2()%></td></tr>
<tr><td>3: <input type="radio" name="ans5" value="<%=list.get(4).getPol_Ques_Ans3()%>" /><%=list.get(4).getPol_Ques_Ans3()%></td></tr>
<tr><td>4: <input type="radio" name="ans5" value="<%=list.get(4).getPol_Ques_Ans4()%>" /><%=list.get(4).getPol_Ques_Ans4()%></td></tr>
<tr><td><input type=hidden name=acc_num value="<%=acc%>"/></td></tr>
<tr><td><input type="submit" value="Submit" name="submit"></td>
<td><input type="reset" name="reset" value="reset"></td></tr>


</table></form>
</div>
</body>
</html>