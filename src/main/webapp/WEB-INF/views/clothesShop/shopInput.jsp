<%@page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>洋服shop</h2>
<br>
好きな色を選択してください。
<br>
<form:form modelAttribute="clothesShopForm" action="${pageContext.request.contextPath}/clothesShop/clothesSearch">
<form:radiobutton path="gender"  value="1"/>man
<form:radiobutton path="gender"  value="0"/>woman


<br>
<form:select path="color" items="${clothesColorMap}"/>
<input type="submit" value="検索">

<c:forEach var="clothesShop" items="${clothesShopList}">
			<table border="1">
				<tr>
					<th>ジャンル</th>
					<td><c:out value="${clothesShop.genre}" /></td>
				</tr>

				<tr>
					<th>サイズ</th>
					<td><c:out value="${clothesShop.size}" /></td>
				</tr>

				<tr>
					<th>価格</th>
					<td><fmt:formatNumber value="${clothesShop.price}" pattern="###,###" /></td>
				</tr>

			</table>
		</c:forEach>

</form:form>
</body>
</html>