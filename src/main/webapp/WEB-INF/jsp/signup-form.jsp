<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
<head>
	<title>user signup form</title>
</head>

<body>

	<form:form action="processSignupForm" modelAttribute="user">
		
		Username: <form:input path="username"/>
		<br><br>
		First name: <form:input path="firstName" />
		<br><br>
		Last name: <form:input path="lastName" />
		<br><br>
		Password: <form:password path="password"/>
		<br><br>
		<input type="submit" value="Submit" />
		
		<br><br>
		
		
	</form:form>
	
</body>

</html>