<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
<head>
	<title>user login form</title>
</head>

<body>

	<div class="container">
<h2 style = "color: #01B0F1;">Sign In </h2>


      <form:form action="login" method="post">
        <!-- Email input -->
        <div class="form-outline mb-4">
          <form:input type="email" id="email" name="email" class="form-control" />
          <label class="form-label" for="email_label">Email address</label>
        </div>

        <!-- Password input -->
        <div class="form-outline mb-4">
          <input type="password" id="password" name="password" class="form-control" />
          <label class="form-label" for="password_label">Password</label>
        </div>

        <!-- 2 column grid layout for inline styling -->
        <div class="row mb-4">
          <div class="col d-flex justify-content-center">
            <!-- Checkbox -->
            <div class="form-check">
              <input class="form-check-input" type="checkbox" value="" id="checkbox" checked />
              <label class="form-check-label" for="remember_label"> Remember me </label>
            </div>
          </div>
        </div>

        <!-- Submit button -->
        <button type="submit" class="btn btn-primary btn-block mb-4">Sign in</button>

        <div class="col">
          <!-- Simple link -->
          <a href="#">Forgot password?</a>
          or
          <a href="signup">Not signed up?</a>
        </div>

      </form:form>
</div>
	
</body>

</html>