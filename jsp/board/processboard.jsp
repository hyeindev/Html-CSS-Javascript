<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 기본 - 등록, 수정, 삭제 게시판 작성</title>
</head>
<body>

	<!-- 게시의 등록, 수정,삭제를 위한 자바빈즈 이용 선언 -->
	<jsp:useBean id="brd" class="boardbean.BoardEntity" scope="page"/>
	<jsp:useBean id="brddb" class="boardbean.BoardDBCP" scope="page"/>
	
	
	
	<%
			
			request.setCharacterEncoding("utf-8");
	
		String menu = request.getParameter("menu");
		
		//등록 또는 수정 처리 모듈
		if(menu.equals("delete") || menu.equals("update")) {
			
				String id = request.getParameter("id");
				String passwd = request.getParameter("passwd");
				int idnum = Integer.parseInt(id);
				
			//데이터베이스 자바빈즈에 구현된 메소드 isPasswd() 로 id 와 암호가 일치하는지 검사
			
					if( !brddb.isPasswd(idnum, passwd)) {

	%>
	
		<!--  암호가 틀리면 이전 화면으로 이동 -->
			<script>alert("비밀번호가 다릅니다."); history.go(-1); </script>
			
	<%	
					} else {
								if( menu.equals("delete")) {
									//삭제를 위해 데이터베이스 자바빈즈에 구현된 메소드 deleteDB 실행
									brddb.deleteDB(idnum);
									
								}else if(menu.equals("update")) {
	%>								
									
								<!--  수정 시 BoardEntity 에 지정해야 하는 필드 id -->								
								<jsp:setProperty property="id" name="brd"/>
								<jsp:setProperty property="name" name="brd"/>
								<jsp:setProperty property="title" name="brd"/>
								<jsp:setProperty property="email" name="brd"/>
								<jsp:setProperty property="content" name="brd"/>
			
	<%
	
								//수정을 위해 데이터베이스 자바빈즈에 구현된 메서드 updateDB 실행
								brddb.updateDB(brd);
								}
								
								//기능 수행 후 다시 게시 목록 보기로 이동
								response.sendRedirect("listboard.jsp");
								
					}
		}else if(menu.equals("insert")) {
	
	%>
			
			<!--  등록 시 BoardEntity 애 지정해야 하는 필드 passwd -->
			<jsp:setProperty property="name" name="brd"/>	
			<jsp:setProperty property="title" name="brd"/>	
			<jsp:setProperty property="email" name="brd"/>	
			<jsp:setProperty property="content" name="brd"/>	
			<jsp:setProperty property="passwd" name="brd"/>	
				
	
	<%
			//등록을 위해 데이터베이스 자바빈즈에 구현된 메서드 insertDB() 실행
			brddb.insertDB(brd);
			//기능 수행 다시 게시 목록 보기로 이동
			response.sendRedirect("listboard.jsp");
			
		}

	%>
</body>
</html>