<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@page import="net.board.db.*" %>
    <%
    	BoardBean board = (BoardBean)request.getAttribute("boarddata");
    %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	function modifyboard() {
		modifyform.submit();
	}
	
</script>
<!--  게시판 수정 -->

 <form action="./BoardModifyAction.bo" method="post" enctype="multipart/fomr-data" name="modifyform">
 	<input type="hidden" name="BOARD_NUM" value="<%=board.getBOARD_NUM() %>" />
 
 	
 	<table>
 		<tr align="center" valign="middle">
 			<td colspan="2">MVC 게시판</td>
 		</tr>
 		<tr>
		<td style="font-familly:Tahoma; font-size:12pt" height="16">
			<div align="center">제 목&nbsp;&nbsp;</div>
		</td>
		<td>
			<input type="text" name="BOARD_SUBJECT" size="50" maxlength="100" 
				value="<%= board.getBOARD_SUBJECT()%>"/>
		</td>
	</tr>
	<tr>
		<td style="font-familly:Tahoma; font-size:12pt" height="16">
			<div align="center">내 용</div>
		</td>
		<td>
			<textarea name="BOARD_CONTENT" cols="67" rows="15"><%=board.getBOARD_CONTENT() %></textarea>
		</td>
	</tr>
	
	<%
		if(!(board.getBOARD_FILE() == null)) {
	%>
		<tr>
			<td style="font-familly:Tahoma; font-size:12pt">
				<div align="center">파일 첨부</div>
			</td>
			<td>
				&nbsp;&nbsp;<%=board.getBOARD_FILE() %>
			</td>
		</tr>
		<% } %>
		<tr>
			<td style="font-familly:Tahoma; font-size:12pt" height="16">
				<div align="center">비밀번호</div>
			</td>
			<td>
				<input type="password" name="BOARD_PASS" size="10" maxlength="10" value="" />
			</td>
		</tr>
		<tr bgcolor="#CCCCCC">
			<td colspan="2" style="height:1px;">
			</td>
		</tr>
		<tr>
			<td colspan="2">&nbsp;</td>
		</tr>
		<tr align="center" valign="middle">
			<td colspan="2">
				<a href="javascript:modifyboard()">[수정]</a>&nbsp;&nbsp;
				<a href="javascript:history.go(-1)">[뒤로]</a>
			</td>
		</tr>
 	</table>
 </form>


</body>
</html>