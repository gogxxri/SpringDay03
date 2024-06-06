<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
	<body>
		<h1>멤버리스트</h1>
		
		<table border="1">
		<tr>
			<th>ID</th><th>Password</th><th>Name</th><th>Role</th>
		</tr>
		<c:forEach var="user" items="${userList}">
		<tr>
			<td>${user.id}</td>
			<td>${user.password}</td>
			<td><a href="userDetail?id=${user.id}">${user.name}</a></td>
			<td>${user.role}</td>
		</tr>
		</c:forEach>
		</table>
		<ul>
			<li><a href="/myweb">홈으로 돌아가기</a></li>
			<li><a href="userWrite">회원정보입력</a></li>
		</ul>
	</body>
</html>