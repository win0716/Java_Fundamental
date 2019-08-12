package java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JdbcInsertDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Driver Load Seccess....");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Load Fail....");
		}
		
		Connection con = null;
		PreparedStatement pstmt= null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mariadb://localhost/kic?autoReconnect=true",
					"kic12", //사용자
					"kic12");//비밀점호
			StringBuffer sql = new StringBuffer();
			
			sql.append("insert into member(num, name, addr)");
			sql.append("values(?,?,?)");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 12);
			pstmt.setString(2, "주커버그");
			pstmt.setString(3, "이스라엘`");
			
			//sql문 전송
			//executeUpdate()=> insert, update, delete 문일때 사용
			//반환갑은 갱신된 행의 수이다.
			
			int resultCount = pstmt.executeUpdate();
			
			System.out.println("갱신된 행의 수 : " + resultCount);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
