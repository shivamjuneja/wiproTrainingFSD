<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Profile</title>
</head>
<body>
<h2>User profile </h2>

<c:out value="${user.id}"/>
<c:out value="${user.name}"/>
<c:out value="${user.age}"/>
</body>
</html>