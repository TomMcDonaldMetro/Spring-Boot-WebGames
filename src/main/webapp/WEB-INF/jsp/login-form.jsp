<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE>
<html>
<head>
	<title>User login form</title>
	<%@ include file="header.jsp" %>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">


</head>

<body>

	<div class="center">
		<h2 style="color: #01B0F1;">Log In</h2>


		<form:form action="" method="POST">
			<!-- Email input -->
			<div class="form-outline mb-4">
				<input type="text" id="username" name="username"
					class="form-control" placeholder="Username"/><label class="form-label"
					for="email_label"></label>
			</div>
			
			<!-- Password input -->
			<div class="form-outline mb-4">
				<input type="password" id="password" name="password"
					class="form-control" placeholder="Password"/> <label class="form-label"
					for="password_label"></label>
			</div>
			
			<!-- Error box 
			<div>
				<label>invalid username or email</label>
				
			</div>
			-->
			
			<!-- 2 column grid layout for inline styling -->
			<div class="row mb-4">
				<div class="col d-flex justify-content-center">
					<!-- Checkbox -->
					<div class="form-check">
						<input class="form-check-input" type="checkbox" value=""
							id="checkbox" checked /> <label class="form-check-label"
							for="remember_label"> Remember me </label>
					</div>
				</div>
			</div>

			<!-- Submit button -->
			<button type="submit" class="btn btn-primary btn-block mb-4">Sign
				in</button>

			<div class="col">
				<!-- Simple link -->
				<a href="#">Forgot password?</a> or <a href="signup">Not signed
					up?</a>
			</div>

		</form:form>
</div>

	<%@ include file="footer.jsp" %>
</body>

</html>