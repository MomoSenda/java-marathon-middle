<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/hotel/hotelSearch" method="post">

		<h2>ホテル検索</h2>
		<br> 
		一泊料金 <input type="text" name="price"> 円以下 
		<br>
		<input type="submit" value="検索">
		<br>
		<c:forEach var="hotel" items="${hotelList}">
			<table border="1">
				<tr>
					<th>ホテル名</th>
					<td><c:out value="${hotel.hotelName}" /></td>
				</tr>

				<tr>
					<th>最寄駅</th>
					<td><c:out value="${hotel.nearestStation}" /></td>
				</tr>

				<tr>
					<th>価格</th>
					<td><c:out value="${hotel.price}" /></td>
				</tr>

			</table>
		</c:forEach>
	</form>
</body>
</html>