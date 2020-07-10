<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*, javax.sql.*, javax.naming.*" %>
    
   <%
   		String id=null;
   	
   		if((session.getAttribute("id")==null) || (!((String)session.getAttribute("id")).equals("admin"))) {
   			out.print("<script>location.href='loginForm.jsp'</script>");
   		}
   		
   		Connection conn = null;
   		PreparedStatement pstmt = null;
   		ResultSet rs = null;
   		
   		try {
   				
   				Context init = new InitialContext();
   				DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
   				conn = ds.getConnection();
   				
   				pstmt = conn.prepareStatement("select * from member_1");
   				rs = pstmt.executeQuery();
   			
   		}catch(Exception e) {
   			e.printStackTrace();
   		}
   
   
   
   %> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리 시스템 관리자 모드(회원 목록 보기)</title>

<script>

function check() {
	
	if(confirm('삭제하시겠습니까?')) {
		return true;
	}else {
		return false;
	}
	
}

</script>

<style>
table {
			margin : auto;
			width : 400px;
			border: 1px solid gray;
			text-align: center;
			
}

.td_title {
		font-weight:bold;
		font-size:x-large;
}

</style>

</head>
<body>
<table>
	<tr><td colspan="2" class="td_title">회원 목록</td></tr>
<% while(rs.next()) { %>
	<tr>
	<td>
		<%=rs.getString("id") %>
	</td>
	<td>
		<a href="member_info.jsp?id=<%=rs.getString("id")%>">
			정보
		</a>
	</td>
	<td>
		<a href="member_delete.jsp?id=<%=rs.getString("id")%>" onclick="return check();">
			삭제
		</a>
	</td>
	</tr>
<% } %>

</table>
</body>
</html>