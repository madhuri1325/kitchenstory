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
<table border ="1" th, td {
  border: 1px solid black;
  border-radius: 10px;
}>
<tr><th>Foodid</th><th>Category</th><th>Dish</th><th>Price</th><th>Payment</th></tr>
<%for(Fooditems ff:f){ %>
<tr><td><%=ff.getFoodid() %></td><td><%=ff.getCategory() %></td><td><%=ff.getDish() %></td><td><%=ff.getFoodprice() %></td><td><a href ="pay.jsp?foodpr=<%=ff.getFoodprice()%>">Payment</a></td></tr> 
<%} %>

</table>

</body>

</html>