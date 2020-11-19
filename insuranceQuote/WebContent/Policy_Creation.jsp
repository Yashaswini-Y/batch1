<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<table border="0" width="500px"  cellspacing="0" cellpadding="0">
<c:forEach var="PolicyCreation" items="${policycre}">
<tr>
<td width="100%">

<form name="Policy_Creation" action="Login">

<h2 align="center"><font>Policy Creation</font></h2>
<tr><td>Policy Question Id</td><td>"${PolicyCreation.Pol_Ques_Id}"</td></tr>
<tr><td>Policy Question Sequence</td><td>"${PolicyCreation.Pol_Ques_seq}"</td></tr>
<tr><td>Busines Segment Id</td><td>"${PolicyCreation.Bus_Seg_Id}"</td></tr>
<table border="0" width="500px" cellspacing="2" cellpadding="4">
<tr>

<td width="50%">Policy Question Description </td><td>"${PolicyCreation.Pol_Ques_Desc}"</td>
<input type="hidden" name="correctAns" value="" />
<tr>
</tr>
<tr>
<td>

1: <input type="radio" name="ans" value= "${PolicyCreation.Pol_Ques_Ans1}" /></td>
<input type ="hidden" name="weightage" value="${PolicyCreation.Pol_Ques_Ans1_weightage}">
</tr> 
<tr>
<td>
2: <input type="radio" name="ans" value="${PolicyCreation.Pol_Ques_Ans2}" /></td>
<input type ="hidden" name="weightage" value="${PolicyCreation.Pol_Ques_Ans2_weightage}">
</tr>

<tr>
<td>
3: <input type="radio" name="ans" value="${PolicyCreation.Pol_Ques_Ans3}" /></td>
<input type ="hidden" name="weightage" value="${PolicyCreation.Pol_Ques_Ans3_weightage}">
</tr>

<tr>
<td>
4: <input type="radio" name="ans" value="${PolicyCreation.Pol_Ques_Ans4}" /></td>
<input type ="hidden" name="weightage" value="${PolicyCreation.Pol_Ques_Ans4_weightage}">
</tr>
<tr>
<td>
<center>
<input type="submit" value="Submit" name="submit"></center></td></tr>
</c:forEach>
</table>

</form>
</td>
</tr>
</table>
</center>
</body>
</html>