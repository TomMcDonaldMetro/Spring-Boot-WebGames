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
  <form:form action="signup" method="POST">
  	<div class="form-group">
      <label for="username">User Name</label>
      <input type="textarea" class="form-control" id="username" name="username" aria-describedby="emailHelp" placeholder="Enter username">
    </div>
    <div class="form-group">
      <label for="fname">First Name</label>
      <input type="textarea" class="form-control" id="fname" name="fname" aria-describedby="emailHelp" placeholder="Enter first name">
    </div>
    <div class="form-group">
      <label for="lname">Last Name</label>
      <input type="textarea" class="form-control" id="lname" name="lname" aria-describedby="emailHelp" placeholder="Enter last name">
    </div>
    <div class="form-group">
      <label for="password">Password</label>
      <input type="password" class="form-control" id="password" name="password" placeholder="Password">
    </div>
    <div class="form-group">
      <label for="repeat_password">Repeat Password</label>
      <input type="password" class="form-control" id="repeat_password" name="repeat_password" placeholder="Repeat password">
    </div>
    <div class="form-group form-check">
      <input type="checkbox" class="form-check-input" id="exampleCheck1">
      <label class="form-check-label" for="exampleCheck1">Remember me</label>
    </div>
    <button type="submit" class="btn btn-primary">Sign Up</button>
  </form:form>
</div>

<%@ include file="footer.jsp" %>
</body>

</html>