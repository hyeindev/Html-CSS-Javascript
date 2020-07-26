<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	int num = Integer.parseInt(request.getParameter("num"));
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<style>
div {
		margin-top:20%;
		margin-left:20%;
		width:50%;
		text-align:center;
		padding:30px;
		
}
form {margin:5px;}
</style>

</head>
<body>
	<div>
	<font color="red" size="2">＊비밀번호를 입력해주세요</font>
	
	<form action="./BoardDeleteAction.bo" method="post" >
		<input type="hidden" name="num" value="<%=num %>" />
		<input type="password" name="confirmpass" />
		<input type="submit" value="확인"/>
	</form>
	</div>
	
</body>
</html>