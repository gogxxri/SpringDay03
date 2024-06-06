<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>/WEB-INF/views/board_write.jsp</title>
	</head>
	<body>
	
		<h1>사용자 정보 입력 페이지</h1>
		<form action="userWrite" method="post">
			<table border ="1">
				<tr>
					<th>ID</th>
					<td><input type="text" name="id"/></td>
				</tr>
			    <tr>
			   	 	<th>PASSWORD</th>
			   	 	<td><input type="password" name="password"/></td>
			    </tr>
			    <tr>
			    	<th>NAME</th>
			    	<td><input type="text" name="name"/></td>
			    </tr>
			    <tr>
			    	<th>ROLE</th>
			    	<td><input type="text" name="role"/></td>
			    </tr>
			</table>
			<br/>
		    <input type="submit" value="save"/>
		</form>
		<ul>
			<li><a href="/myweb">홈으로 돌아가기</a></li>
		</ul>
	</body>
</html>