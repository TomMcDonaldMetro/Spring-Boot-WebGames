<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/css/styles.css" />" />
<style>
* {
	box-sizing: border-box;
}

body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

.header {
	overflow: hidden;
	background-color: #f1f1f1;
	padding: 20px 10px;
}

.header a {
	float: left;
	color: black;
	text-align: center;
	padding: 12px;
	text-decoration: none;
	font-size: 18px;
	line-height: 25px;
	border-radius: 4px;
}

.header a.logo {
	font-size: 25px;
	font-weight: bold;
}

.header a:hover {
	background-color: #ddd;
	color: black;
}

.header a.active {
	background-color: dodgerblue;
	color: white;
}

.header-right {
	float: right;
}

@media screen and (max-width: 500px) {
	.header a {
		float: none;
		display: block;
		text-align: left;
	}
	.header-right {
		float: none;
	}
}
</style>
<div class="header">
	<a href="${pageContext.request.contextPath}/home" class="logo">Web
		Games</a>

	<div class="header-right">
		<a class="active" href="${pageContext.request.contextPath}/home">Home</a>
		<a href="${pageContext.request.contextPath}/menu">Games</a> <a
			href="#about">About</a>
		<c:choose>
			<c:when test="${empty name}">
				<a href="${pageContext.request.contextPath}/login">Log In</a>
			</c:when>
			<c:when test="${not empty name}">
				<a href="/processLogout">logout</a>

			</c:when>
		</c:choose>

	</div>
</div>

</head>

