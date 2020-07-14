<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionattribute.jsp</title>
</head>
<body>
<%@ page import="java.util.Enumeration, java.util.Date" %>
<h1>세션 예제</h1>
<hr>
<h2>세션 만들기</h2>
<%
	session.setAttribute("id","kingjava");
	session.setAttribute("pwd","queentomcat");
	session.setAttribute("Jo","hyein");
%>
<hr>

<h2>세션 조회</h2>
세션 ID : <%=session.getId() %><br>

<!-- getId() 로 가져온 session ID 는 고유한 아이디라서 모든 브라우저 마다 부여받는다
거기에 브라우저 마다 따로 새로 생성된 name 와 value 값으로 방문자를 구분한다.  -->

세션 creationTime : <%= new Date(session.getCreationTime()) %><br><br>
<%
	Enumeration<String> e = session.getAttributeNames();
	while(e.hasMoreElements()) {
		String name = e.nextElement();
		String value = (String) session.getAttribute(name);
		out.print("세션 name : " + name + ", ");
		out.print("세션 value : " + value + "<br>");
		}	
%>
<br> 세션 Invalidate : <%// session.invalidate(); %>

<%-- session.invalidate() 를 하게되면 기존의 세션이 사라지고 새로 만들어진다. 
이걸 하지 않았을때는 세션을 30분동안 유지한다.
 --%>
</body>
</html>