<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
	<title>Main Menu</title>
</head>

<body>

<h1>Hello <c:out default="World." value="${user.username}"/></h1>

<a href="login">login</a>
<br><br>
<a href="signup">signup</a>
<br><br>
<a href="menu">Games menu</a>
<br><br>
</body>

</html>