<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC 게시판</title>
<script>
function addBoard(){
   boardform.submit();
}
</script>
</head>
<body link="#00D7FA" alink="#FF7E7E" vlink="#CFCFCF">
<!-- 게시판 등록 -->
<form action="./BoardAddAction.bo" method="post" enctype="multipart/form-data" name="boardform">
<table align="center">
   <tr align="center" valign="middle">
      <td style="font-family:DX경필명조B" colspan="2">MVC 게시판</td>
   </tr>
   <tr>
      <td style="font-family:DX경필명조B; font-size:12pt;" height="16">
         <div align="center">글쓴이</div>
      </td>
      <td>
         <input name="BOARD_NAME" type="text" size="10" maxlength="10"/>
      </td>
   </tr>
   
   <tr>
      <td style="font-family:DX경필명조B; font-size:12pt;" height="16">
         <div align="center">비밀번호</div>
      </td>
      <td>
         <input name="BOARD_PASS" type="password" size="10" maxlength="10" value=""/>
      </td>
   </tr>
   
   <tr>
      <td style="font-family:DX경필명조B; font-size:12pt;" height="16">
         <div align="center">제목</div>
      </td>
      <td>
         <input name="BOARD_SUBJECT" type="text" size="58" maxlength="100" value=""/>
      </td>
   </tr>
   
   <tr>
      <td style="font-family:DX경필명조B; font-size:12pt;" height="16">
         <div align="center">내용</div>
      </td>
      <td>
         <textarea name="BOARD_CONTENT" rows="15" cols="60"></textarea>
      </td>
   </tr>
   
   <tr>
      <td style="font-family:DX경필명조B; font-size:12pt;" height="16">
         <div align="center">파일 첨부</div>
      </td>
      <td>
         <input name="BOARD_FILE" type="file"/>
      </td>
   </tr>
   <tr bgcolor="#FFB4B4">
      <td colspan="2" style="height:2px"></td>
   </tr>
   <tr>
      <td colspan="2">&nbsp;</td>
   </tr>
   <tr align="center" valign="middle">
      <td colspan="2">
         <a href="javascript:addBoard()">[등록]</a>&nbsp;&nbsp;
         <a href="javascript:history.go(-1)">[뒤로]</a>
      </td>
   </tr>
</table>
</form>
<!-- 게시판 등록 -->
</body>
</html>