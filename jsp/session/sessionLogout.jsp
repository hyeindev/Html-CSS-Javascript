<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% session.removeAttribute("id"); %>

<!-- 여기서 session의 name 이 id 인 value를 삭제함  -->

<h3>로그아웃 되었습니다.</h3>
<a href="sessionLogin_1.jsp">로그인 페이지로 이동</a>

