<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileuploadForm</title>
<style>
	#uploadFormArea {
	margin:auto;
	sigth:350px;
	border:1px solid black;
	}
	.td_title {
			font-size:xx-large;
			text-align:center;
	}
</style>
</head>
<body>

<section id="uploadFormArea">
<form action="fileupload.jsp" method="post" enctype="multipart/form-data">
	<table>
		<tr>
		 <td colspan="2" class="td_title">파일 업로드 폼</td>
		<tr>
		<tr>
			<td><label for="name">올린 사람 : </label></td>
			<td><input type="text" name="name" id="name"></td>
		</tr>
		<tr>
			<td><label for="subject">제목 : </label></td>
			<td><input type="text" name="subject" id="subject"></td>
		</tr>
		
		<tr>
			<td><label for="fileName1">파일명1 : </label></td>
			<td><input type="file" name="fileName1" id="fileName1"></td>
		</tr>
		
		<tr>
			<td><label for="fileName2">파일명2 : </label></td>
			<td><input type="file" name="fileName2" id="fileName2"></td>
		</tr>
		<tr>
			<td colspan="2" align=center><input type="submit" value="전송" /></td>
		</tr>
	</table>
</form>
</section>
<!-- 
파일 업로드를 위해 www.servlets.com 에서 공용 cos.jar 를 다운받아 WEB-INF 에 넣었다.
큰 용량의 파일 업로드를 위해서는 jar 를 따로 구입해야한다. -->


</body>
</html>