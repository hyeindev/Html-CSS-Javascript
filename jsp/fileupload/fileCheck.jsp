<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String subject = request.getParameter("subject");
	String filename1 = request.getParameter("filename1");
	String filename2 = request.getParameter("filename2");
	String origfilename1 = request.getParameter("origfilename1");
	String origfilename2 = request.getParameter("origfilename2");
	

%>    
    
<!-- 
실행시, 폼에서 먼저 선택한 것이 파일명1 로 출력됨
		나중에 선택해서 올린것이 파일명2로 출력됨! -->
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 및 다운로드</title>
</head>
<body>

올린사람 : <%=name %><br>
제목 : <%=subject %><br>

파일명 1 : <a href="file_down.jsp?file_name=<%=filename1 %>"><%=origfilename1 %></a><br>
파일명 2 : <a href="file_down.jsp?file_name=<%=filename2 %>"><%=origfilename2 %></a><br>
</body>
</html>

