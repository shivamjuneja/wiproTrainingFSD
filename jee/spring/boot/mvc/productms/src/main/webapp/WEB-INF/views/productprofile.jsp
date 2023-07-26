<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>product Profile</title>
</head>
<body>
<h2>product profile </h2>

<c:out value="${product.id}"/>
<c:out value="${product.name}"/>
<c:out value="${product.price}"/>
</body>
</html>