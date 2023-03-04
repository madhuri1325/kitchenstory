<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="com.example.demo.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">

<%List<Fooditems> f= (List<Fooditems>)request.getAttribute("list"); %>
<table border ="1">
<tr><th>foodid</th><th>Category</th><th>Dish</th><th>price</th><th>Edit</th><th>delete</th></tr>
<%for(Fooditems ff:f){ %>
<tr><td><%=ff.getFoodid() %></td><td><%=ff.getCategory() %></td><td><%=ff.getDish() %></td><td><%=ff.getFoodprice() %></td><td><a href="editfooditems.jsp?Foodid=<%=ff.getFoodid() %>">Edit fooditems</a></td><td><a href ="delete.jsp?Foodid=<%=ff.getFoodid()%>">Delete items</a></td></tr> 
<%} %>

</table>

</body>

</html>