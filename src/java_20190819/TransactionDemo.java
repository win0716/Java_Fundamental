package java_20190819;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Member{
	
	private int num;
	private String name;
	private String addr;
	
	Member(int num, String name, String addr){
		this.num = num;
		this.name = name;
		this.addr = addr;
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}

public class TransactionDemo {
	public boolean insert() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		
		}
		boolean isSuccess = false;
	    Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mariadb://localhost/kic", "kic12", "kic12");
			StringBuffer sql = new StringBuffer();
			
			con.setAutoCommit(false);//트렌잭션 시작
			
			sql.append("insert into member values('num1', 'name1', 'addr1')");
			pstmt1 = con.prepareStatement(sql.toString());
			pstmt1.executeUpdate();
			
			
			sql.setLength(0);
			
			sql.append("insert into member values('num2, 'name2', 'addr2)");
			pstmt2 = con.prepareStatement(sql.toString());
			pstmt2.executeUpdate();
			
			isSuccess = true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}	finally {
			try {
				if(isSuccess) {
					con.commit();
					
				}else {
					con.rollback();
					
				}
				//Connection Pool 사용할때는 반드시 해주어야함.
				con.setAutoCommit(true);
				if (pstmt1 != null) pstmt1.close();
				if (pstmt2 != null) pstmt2.close();
				if (con != null) con.close();
				
			} catch (SQLException e2) {
				
			}
		}
		return isSuccess;
	}

}
