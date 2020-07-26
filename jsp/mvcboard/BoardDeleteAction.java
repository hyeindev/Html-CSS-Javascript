package net.board.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board.db.BoardBean;
import net.board.db.BoardDAO;

public class BoardDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
			int num = Integer.parseInt(request.getParameter("num"));
			String confirmpass = request.getParameter("confirmpass");
			
			
			ActionForward forward = new ActionForward();
			
			BoardDAO boarddao = new BoardDAO();
			BoardBean boarddata = new BoardBean();
			
			boolean passbool = boarddao.getBoardWriter(num, confirmpass);
				
				if(!passbool){
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					
					out.println("<script>");
					out.println("alert('삭제할 권한이 없습니다.');");
					out.println("location.href='./BoardList.bo';");
					out.println("</script>");
					out.close();
					
					return null;
				}
				
				boolean result = boarddao.delete(num);
				if (result) {
					System.out.println("삭제 성공");
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					
					out.println("<script>");
					out.println("alert('삭제 완료되었습니다.');");
					out.println("location.href='./BoardList.bo';");
					out.println("</script>");
					out.close();
					
				}else {
					System.out.println("삭제 실패");					
				}
				
				
	
				return forward;
	}
	

}
