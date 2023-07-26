<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>product Profile</title>
</head>
<body>
<h2>List products</h2>

<c:forEach items="${products}" var="product">

<div>
<c:out value="${product.id}"/>
<c:out value="${product.name}"/>
<c:out value="${product.price}"/>

</div>
</c:forEach>

<h2>Table format</h2>

<table border="1px">
<tr>
<th>Id</th> <th>Name</th> <th>Age</th>
</tr>

<c:forEach items="${products}" var="product">
<tr>
<td>
<c:out value="${product.id}"/>
</td>
<td>
<c:out value="${product.name}"/>
</td>

<td>
<c:out value="${product.price}"/>
</td>

</tr>
</c:forEach>
</table>
</body>
</html>