<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
<head>
	<title>student form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		<br><br>
		Last name: <form:input path="lastName" />
		
		<br><br>

		<input type="submit" value="Submit" />
		
		<br><br>
		
		
	</form:form>
	
</body>

</html>