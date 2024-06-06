<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>삭제하기</title>
	</head>
	<body>
		<h1>회원정보 삭제</h1>
		
		<input type="hidden" value="${userr.id }" name="id"/>
	    <table border="1">
			<tr><th>ID</th><td>${user.id}</td></tr>
			<tr><th>PASSWORD</th><td>${user.password}</td></tr>
			<tr><th>NAME</th><td>${user.name}</td></tr>
			<tr><th>ROLE</th><td>${user.role}</td></tr>
		</table>
		<form action="userDelete" method="POST">
			<input type="hidden" name="id" value="${user.id}">
			<p>삭제하시겠습니까?</p>
		    <input type="submit" value="삭제">
		</form>
	</body>
</html>