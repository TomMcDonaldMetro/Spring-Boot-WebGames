<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<html>
	<head>
		<title>Tic-Tac-Toe</title>
		<%@ include file="header.jsp" %>
	</head>
	<body>
		<div style="text-align:center">
			
			<c:if test="${game.winner != null }"> 
						<h1>Congratulations Player ${game.winner }</h1>			
					</c:if>
			<form action="<c:url value='tictactoe'/>" method="get">
			
			<div class= "game-board">
				
				<c:forEach items="${game.board}" var="square" varStatus="stat">
					
					<c:choose>
						<c:when test="${empty square}"> <div class="empty"><button <c:if test="${game.winner != null }">value="disabled='disabled'"</c:if> class="ttt-space" type="submit" name="loc" value="${stat.index}"></button></div></c:when>
						<c:when test="${square.mark == 'X' }"><div class="ttt-img" style="background-image: url('/images/x.png')"></div></c:when>
						<c:when test="${square.mark == 'O' }"><div class="ttt-img" style="background-image: url('/images/o.png')"></div></c:when>
					</c:choose>

				
				</c:forEach>
				
				<button type="submit" name="newGame" value="true">New Game</button>
			</div>
			</form>
		</div>
				
				
		<%@ include file="footer.jsp" %>
	</body>
</html>