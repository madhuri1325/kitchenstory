<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<h1><i>Editing Fooditems</i></h1>
<form action="editcontroller">
<input type="hidden" name="foodid" value=<%=request.getParameter("foodid") %>>
Fooditems to be edited <input type="text" name="dish">
<input type="submit" value="edit">
</form>
</body>
</html>


