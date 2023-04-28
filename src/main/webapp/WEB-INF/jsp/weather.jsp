<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Games Menu</title>
<%@ include file="header.jsp"%>
</head>

<body>
	<h2>Weather Menu</h2>

	<form:form action="${pageContext.request.contextPath }" method="GET">
		<!-- city input -->
		<div class="form-outline mb-4">
			<input type="text" id="city" name="city" class="form-control"
				placeholder="city" />
		</div>
		<!-- Password input -->
		<div class="form-outline mb-4">
			<input type="text" id="state" name="state" class="form-control"
				placeholder="state" />
		</div>

		<!-- Submit button -->
		<button type="submit" class="btn btn-primary btn-block mb-4">submit</button>


	</form:form>

	<table>
		<tr>
			<c:forEach var="forecast" varStatus="stat" items="${forecast}">

				<c:if test="${forecast.number % 2 == 1}">
					<th>${forecast.name}</th>
				</c:if>


			</c:forEach>
		</tr>
		<tr>
			<c:forEach var="forecast" varStatus="stat" items="${forecast}">

				<c:if test="${forecast.number % 2 == 1}">
					<td>${forecast.temperature} ${forecast.temperatureUnit} <br> <img src="${forecast.icon}" />  <br> ${forecast.shortForecast}</td>
				</c:if>

			</c:forEach>
		</tr>

		<tr>
			<c:forEach var="forecast" varStatus="stat" items="${forecast}">


				<c:if test="${forecast.number % 2 == 0}">
					<th>${forecast.name}</th>
				</c:if>


			</c:forEach>
	
	</tr>

		<tr>
			<c:forEach var="forecast" varStatus="stat" items="${forecast}">
						
				<c:if test="${forecast.number % 2 == 0}">
					<td>${forecast.temperature} ${forecast.temperatureUnit} <br> <img src="${forecast.icon}" /> <br> ${forecast.shortForecast} </td>
				</c:if>

				
			</c:forEach>
		</tr>
	
	</table>



	<%@ include file="footer.jsp"%>
</body>


</html>