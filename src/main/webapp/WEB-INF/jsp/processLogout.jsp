<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE>
<html>

<body>
	<form:form action="${pageContext.request.contextPath}/logout" method="POST" name="logout">
			<input type=hidden value="logout"/>
		</form:form>
	
	<script type="text/javascript">
	
		window.onload = function(){
		  document.forms['logout'].submit();
		}
	</script>
</body>
</html>