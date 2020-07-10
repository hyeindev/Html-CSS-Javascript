<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page import="java.sql.*, javax.sql.*, javax.naming.*" %>
    
     <%
   		String id=null;
   	if((session.getAttribute("id")==null) || (!((String)session.getAttribute("id")).equals("admin"))) {
   		
   		out.print("<script>location.href='loginForm.jsp'</script>");
   		
   	}
   	
   	String info_id = request.getParameter("id");
   	
   	
   	Connection conn = null;
   	PreparedStatement pstmt = null;
   	ResultSet rs = null;
   	
   	try {
   		
   				Context init = new InitialContext();
   				DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
   				
   				conn = ds.getConnection();
   				
   				pstmt = conn.prepareStatement("delete from member_1 where id=?");
   				pstmt.setString(1, info_id);
  				int n = pstmt.executeUpdate();
  				
   				if(n==1) {
   					out.print("<script>alert('삭제되었습니다.');</script>");
   					
   				}else {
   					out.print("<script>alert('서버 오류로 인한 삭제 불가');</script>");
   				}
   		
   	}catch(Exception e) {
   		e.printStackTrace();	
   	}
   
   %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>