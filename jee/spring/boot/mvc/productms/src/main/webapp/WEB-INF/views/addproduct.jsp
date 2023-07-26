<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
</head>
<body>
<h2>Add product Page </h2>
<form method="get" action="/processaddproduct">

<div>

<label>Name</label>

<input name="name">

</div>


<div>

<label>Price</label>

<input name="price" type="number">

</div>

<button type="submit">Add product</button>
</form>

</body>
</html>