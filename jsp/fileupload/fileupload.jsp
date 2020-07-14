<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="java.util.*" %>

<%
   String uploadPath = request.getRealPath("/upload");
// request 로 받아온 파일을 getRealPath() 로 업로드될 파일의 위치를 적어줌
// from 에서 submit 시에 upload 폴더에 request 파일 저장


   int size = 10*1024*1024;
   String name="";
   String subject="";
   String filename1="";
   String filename2="";
   String origfilename1="";
   String origfilename2="";
   
   try {
      MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "UTF-8",
                                          new DefaultFileRenamePolicy());
      
      
      /*
      	MultipartRequest 객체 생성
      	MultipartRequest multi = new MultipartRequest(1,
      									2,
      									3,
      									4,
      									5 );
      
      1 : request 대입
      2 : 업로드 할 경로
      3 : 한번에 업로드 가능한 용량
      4 : 제목, 인코딩 시킬때 (UTF_8)
      5 : 중복 이름 정책
      
      */
      
      
      name=multi.getParameter("name");
      subject = multi.getParameter("subject");
      
      Enumeration<String> files = multi.getFileNames();
      
      
      String file1 = files.nextElement();
      filename1 = multi.getFilesystemName(file1);
      origfilename1 = multi.getOriginalFileName(file1);
      
      String file2 = files.nextElement();
      filename2 = multi.getFilesystemName(file2);
      origfilename2 = multi.getOriginalFileName(file2);
   }
   catch(Exception e) {
      e.printStackTrace();
   }
%>
      

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file upload test</title>
</head>
<body>
<form name="filecheck" action="fileCheck.jsp" method="post">
   <input type="hidden" name="name" value="<%= name %>">
   <input type="hidden" name="subject" value="<%= subject %>">
   <input type="hidden" name="filename1" value="<%= filename1 %>">
   <input type="hidden" name="filename2" value="<%= filename2 %>">
   <input type="hidden" name="origfilename1" value="<%= origfilename1 %>">
   <input type="hidden" name="origfilename2" value="<%= origfilename2 %>">
</form>
<a href="#" onclick="javascript:filecheck.submit()">업로드 확인 및 다운로드 페이지 이동</a>
</body>

<%-- type="hidden" 을 사용하는 이유는 http 프로토콜의 비연결성 때문이다.
	 from submit 시에 action="" 의 페이지로 해당 hidden 의 value값을 넘겨준다.
	 원래는 text 타입이거나 이런건 클라이언트가 입력한 값이 value 가 되어 페이지로 넘어가는데,
	  여기서는 서버에서 직접 hidden 으로 여러가지 데이터를 전송시킨다.	  --%>
</html>