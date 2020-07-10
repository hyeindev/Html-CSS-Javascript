<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리 시스템 - 회원 가입 페이지</title>
</head>
<body>
<form name="joinForm" action="joinProcess.jsp" method="post">
<table border="1">
	<tr>
		<td colspan="2" align="center">
			<b><font size="5">회원 가입 페이지</font></b>
		</td>
	</tr>
	<tr>
		<td>아이디 : </td>
		<td><input type="text" name="id"/></td>
	</tr>
	<tr>
		<td>비밀번호 : </td>
		<td><input type="password" name="pass"/></td>
	</tr>
	<tr>
		<td>이름 : </td>
		<td><input type="text" name="name"/></td>
	</tr>
	<tr>
		<td>주소 : </td>
		<td><input type="text" name="addr"/></td>
	</tr>
	<tr>
		<td>나이 : </td>
		<td><input type="text" name="age" mexlength="2" size="5"/></td>
	</tr>
	<tr>
		<td>성별 : </td>
		<td>
			<input type="radio" name="gender" value="남"/>남
			<input type="radio" name="gender" value="여" checked/>여
		</td>
	</tr>
	<tr>
		<td>메일 주소 : </td>
		<td><input type="email" name="email" size="30"/></td>
	</tr>
	
	<tr>
		<td colspan="2" align="center">
			<a href="javascript:joinForm.submit()">회원 가입</a>&nbsp;&nbsp;
			<a href="javascript:joinForm.reset()">다시 작성</a>
		</td>
	</tr>
</table>
</form>
</body>
</html>