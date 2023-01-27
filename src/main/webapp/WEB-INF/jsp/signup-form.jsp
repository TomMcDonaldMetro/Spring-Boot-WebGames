<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
<head>
	<%@ include file="header.jsp" %>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<title>user sign-up form</title>
</head>

<body>
	<div class = "center">
	<h1 style = "color: #01B0F1;">Sign up</h1>
  <form:form action="/processSignupForm" method="POST" modelAttribute="user">
  	<div class="form-group">
      <label for="username">User Name</label>
      
      <!-- Username Error Message -->
  		<c:if test="${error != null}">
  			<p><i style="color:red">Username already in use.</i></p>
  		</c:if>
  		
      <form:input type="text" class="form-control" id="username" name="username" aria-describedby="emailHelp" placeholder="Enter username" path="username" />
    </div>
    <div class="form-group">
      <label for="fname">First Name</label>
      <form:input type="text" class="form-control" id="fname" name="fname" aria-describedby="emailHelp" placeholder="Enter first name" path="firstName" />
    </div>
    <div class="form-group">
      <label for="lname">Last Name</label>
      <form:input type="text" class="form-control" id="lname" name="lname" aria-describedby="emailHelp" placeholder="Enter last name" path="lastName" />
    </div>
    <div class="form-group">
      <label for="password">Password</label>
      <form:input type="password" class="form-control" id="password" name="password" placeholder="Password" path="password" />
    </div>
    <div class="form-group">
      <label for="repeat_password">Repeat Password</label>
      <input type="password" class="form-control" id="repeat_password" name="repeat_password" placeholder="Repeat password" >
    </div>
    <div class="form-group form-check">
      <input type="checkbox" class="form-check-input" id="exampleCheck1">
      <label class="form-check-label" for="exampleCheck1">Remember me</label>
    </div>
    <button type="submit" class="btn btn-primary">Sign Up</button>
  </form:form>
</div>

<%@ include file="footer.jsp" %>
<script src="/javascript/validate.js"></script>
</body>

</html>