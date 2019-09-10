package homeWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import homeWork.MemberDto;

public class MemberDao {
	
	private static MemberDao single;
	private MemberDao() {
		try {
			Class.forName("org.mariadb.jdbc.driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static MemberDao getInstance() {
		if(single == null) {
			single = new MemberDao();
		}
		return single;
	}
	
	public boolean insert(MemberDto m) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index =1;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic", "kic12", "kic1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("inert into member(m_seq, m_id, m_password) ");
			sql.append("values(?,?,password(?)) ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(index++, m.getSeq());
			pstmt.setString(index++, m.getId());
			pstmt.setString(index++, m.getPassword());
			
			pstmt.executeUpdate();
			
			isSuccess = true;
				
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) pstmt.close();
				
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		return isSuccess;
	}
}
