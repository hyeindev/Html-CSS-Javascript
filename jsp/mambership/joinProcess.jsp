<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*, javax.sql.*, javax.naming.*" %>

<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	String name = request.getParameter("name");
	String addr = request.getParameter("addr");
	int age = Integer.parseInt(request.getParameter("age"));
	String gender = request.getParameter("gender");
	String email = request.getParameter("email");
	
	Connection con = null;
	PreparedStatement pstmt = null;
	
	try {
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
		con = ds.getConnection();
		
		pstmt = con.prepareStatement("INSERT INTO member_1 VALUES (?, ?, ?, ?, ?, ?,?)");
		pstmt.setString(1, id);
		pstmt.setString(2, pass);
		pstmt.setString(3, name);
		pstmt.setString(4, addr);
		pstmt.setInt(5, age);
		pstmt.setString(6, gender);
		pstmt.setString(7, email);
		
		int result = pstmt.executeUpdate();
		
		if(result != 0) {
			out.println("<script>");
			out.println("location.href='loginForm.jsp'");
			out.println("</script>");
		}
		else {
			out.println("<script>");
			out.println("location.href='joinForm.jsp'");
			out.println("</script>");
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			pstmt.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
%>