<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
</head>
<body>
<h2>Get User Page </h2>
<form method="get" action="/userdetails">

<div>

<label>Id</label>

<input name="id">

</div>

<button type="submit">Get User</button>
</form>

</body>
</html>