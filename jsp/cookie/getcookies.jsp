<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>쿠키 조회 예제</h1>

<hr size="3" color="pink">
<%

	Cookie[] cookies = request.getCookies();
	if(cookies==null) {
		out.println("No Cookie");
	}else {
	/* 	for(int i=0; i<cookies.length; ++i) {
			out.print("Cookie Name : " + cookies[i].getName() + ", ");
			out.print("Cookie Value : " + cookies[i].getValue() + "<br>");
		} */
		
		for(Cookie c : cookies) {
			out.print("Cookie Name : " + c.getName() + ", ");
			out.print("Cookie Value : " + c.getValue() + "<br>");
		}
	}
%>
</body>
</html>