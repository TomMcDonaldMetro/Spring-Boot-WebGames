<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
<head>
	<title>user login form</title>
</head>

<body>

	<form:form action="processLoginForm" modelAttribute="user">
		
		Username: <form:input path="username"/>
		<br><br>
		Password: <form:password path="password"/>
		<br><br>
		
		<input type="submit" value="Submit" />
		
		<br><br>
		
		
	</form:form>
	
</body>

</html>