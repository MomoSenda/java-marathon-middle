<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
プロ野球
セントラル・リーグ一覧
<br>

<c:forEach var="baseballTeam" items="${baseballTeamsList}">
  <a href="/baseballTeam/detail?id=<c:out value="${baseballTeam.id}"/>"><c:out value="${baseballTeam.teamName}"/></a>
<br>
</c:forEach>

</body>
</html>