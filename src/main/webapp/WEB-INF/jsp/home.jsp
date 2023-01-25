<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
	<title>Main Menu</title>
	<%@ include file="header.jsp" %>
</head>

<body>

<h1 style="text-align:center">Hello <c:out default="World." value="${name}"/></h1>




<%@ include file="footer.jsp" %>
</body>

</html>