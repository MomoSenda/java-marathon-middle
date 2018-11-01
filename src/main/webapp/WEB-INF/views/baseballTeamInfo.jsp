<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

球団名<br>
<c:out value="${baseballteam.teamName}"/>
<br>
本拠地<br>
<c:out value="${baseballteam.headquarters}"/>
<br>
発足<br>
<c:out value="${baseballteam.inauguration}"/>
<br>
歴史<br>
<pre><c:out value="${baseballteam.history}"/></pre>
<br>
<form action="/baseballTeam/list" method="post">
<input type="submit" value="戻る">
</form>
</body>
</html>