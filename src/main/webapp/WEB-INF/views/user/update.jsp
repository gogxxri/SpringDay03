<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사용자 정보 수정</h1>
	<form action="userUpdate" method="POST">
		<table border="1">
			<input type="hidden" value="${user.id}" name="id"/>
			<tr>
				<th>ID</th>
				<td>${user.id }</td>
			</tr>
			<tr>
				<th>PASSWORD</th>
				<td><input type="password" value="${user.password}" name="password"/></td>
			</tr>
			<tr>
				<th>NAME</th>
				<td><input type="text" value="${user.name}" name="Name"/></td>
			</tr>
			<tr>
				<th>ROLE</th>
				<td><input type="text" value="${user.role}" name="role"/></td>
			</tr>
		</table>
		<br/>
		<input type="submit" value="수정" />
	</form>
	</body>
</html>