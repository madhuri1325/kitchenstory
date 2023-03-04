<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<form action="paycheck1">
Enter bank name:<input type="text" name="bname">
<input type="hidden" name="foodpr" value=<%=request.getParameter("foodpr") %>>
<input type="submit" value="Pay Now">
</form>
</body>
</html>