package boardbean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDBCP {
	
		
		private Connection con = null;
		private PreparedStatement pstmt = null;
		private DataSource ds = null;
		
		
		
		public BoardDBCP() {
			
			try {
				InitialContext init = new InitialContext();
				ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
		
		
		public void connect() {
			
			try {
				con = ds.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		public void disconnect() {
			
			if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
			if(pstmt!=null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
		}
		
		
		
		public ArrayList<BoardEntity> getBoardList() {
			connect();
			ArrayList<BoardEntity> list = new ArrayList<BoardEntity>();
			
			String SQL = "select * from board_1";
			
			try {
				pstmt = con.prepareStatement(SQL);
				ResultSet rs = pstmt.executeQuery();
				
				
				while(rs.next()) {
					
					BoardEntity brd = new BoardEntity();
					brd.setId(rs.getInt("id"));
					brd.setName(rs.getString("name"));
					brd.setPasswd(rs.getString("passwd"));
					brd.setTitle(rs.getString("title"));
					brd.setEmail(rs.getString("email"));
					brd.setRegdate(rs.getTimestamp("regdate"));
					brd.setContent(rs.getString("content"));
					
					list.add(brd);
					
				}
				
				rs.close();
				
			}catch(SQLException e) {
				
				e.printStackTrace();
				
			}finally {
				
				disconnect();
				
				
			}
			
			return list; 
		}

		
		
		public BoardEntity getBoard(int id) {
			connect();
			
			
			String SQL = "select * from board_1 where id=?";
			BoardEntity brd = new BoardEntity();
			
			try {
				
				pstmt = con.prepareStatement(SQL);
				pstmt.setInt(1, id);
				ResultSet rs = pstmt.executeQuery();
				rs.next();
				
			
					brd.setId(rs.getInt("id"));
					brd.setName(rs.getString("name"));
					brd.setPasswd(rs.getString("passwd"));
					brd.setTitle(rs.getString("title"));
					brd.setEmail(rs.getString("email"));
					brd.setRegdate(rs.getTimestamp("regdate"));
					brd.setContent(rs.getString("content"));
								
				rs.close();
				
			}catch(SQLException e) {
				
				e.printStackTrace();
				
			}finally {
				
				disconnect();
				
				
			}
			
			return brd;
		}

		
		public boolean insertDB(BoardEntity board) {
			
			boolean success = false;
			connect();
			
			String SQL = "insert into board_1 values(board_1_seq.nextval,?,?,?,?,sysdate,?)";
			
			try {
				
				pstmt = con.prepareStatement(SQL);
				pstmt.setString(1, board.getName());
				pstmt.setString(2, board.getPasswd());
				pstmt.setString(3, board.getTitle());
				pstmt.setString(4, board.getEmail());
				pstmt.setString(5, board.getContent());
				pstmt.executeUpdate();
				success = true;
				
			}catch(SQLException e) {
				
				e.printStackTrace();
				return success;
				
			}finally {
				disconnect();
				}
			return success;
		}
		
		//데이터 갱신을 위한 메서드
		   public boolean updateDB(BoardEntity board) {
		      boolean success = false;
		      connect();
		      
		      String sql = "update board_1 set name=?, title=?, email=?, content=? where id=?";
		      try {
		         pstmt = con.prepareStatement(sql);
		         
		         //인자로 받은 BoardEntity 객체를 이용해 사용자가 수정한 값을 가져와 SQL문 완성
		         pstmt.setString(1, board.getName());
		         pstmt.setString(2, board.getTitle());
		         pstmt.setString(3, board.getEmail());
		         pstmt.setString(4, board.getContent());
		         pstmt.setInt(5, board.getId());
		         
		         int rowUdt = pstmt.executeUpdate();
		         //System.out.println(rowUdt);
		         if(rowUdt == 1)
		            success = true;
		      }
		      catch(SQLException e ) {
		         e.printStackTrace();
		         return success;
		      }
		      finally {
		         disconnect();
		      }
		      return success;
		   }
		
		
		
		
		
		
		
		
		//데이터베이스에서 인자인 id 와 passwd 가 일치하는지 검사하는 메서드
		public boolean isPasswd(int id, String passwd) {
				
			boolean success = false;
			
			connect();
			
			String sql = "select passwd from board_1 where id=?";
			
			try {
				
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, id);
					
					ResultSet rs = pstmt.executeQuery();
					rs.next();
					
					String orgPasswd = rs.getString(1);
					
					if (passwd.equals(orgPasswd)) {
						
						success = true;
					}
					System.out.println("비밀번호  : " + success);
					rs.close();
				
			}catch(Exception e) {
				e.printStackTrace();
				return success;
			}
			finally {
				disconnect();
			}
			return success;
		}
		
		
		
		public boolean deleteDB(int id) {
			
			boolean success = false;
			
			connect();
			
			String sql = "delete from board_1 where id=?";
			
			try {
				pstmt = con.prepareStatement(sql);
				
				//인자로 받은 주 키인 id 값을 이용해 삭제
				
				pstmt.setInt(1, id);
				pstmt.executeUpdate();
				success=true;
			
			}catch(Exception e) {
				e.printStackTrace();
				return success;
				
			}finally {
				disconnect();
			}
			return success;
			
			
		}
		
}
