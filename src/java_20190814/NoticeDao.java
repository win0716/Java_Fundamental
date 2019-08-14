package java_20190814;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class NoticeDao {

	// 1.singleton
	// 1-1 static 변수로 self 자료형 변수를 선언하고 접근한정자는 private으로
	private static NoticeDao single;

	// 1-2 디폴트 생성자의 접근한정자는 private으로 선언
	// 외부에서 객체 생성을 못하게 하기 위해서
	private NoticeDao() {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 1-3 객체생성할 수 있는 getInstance() 메서드를 선언한다.
	// 이때 single 변수의 null 체크를 하여 null인 경우에만 객체를 생성한다.
	// 이렇게 함으로써 다중 클라이언트가 접근하더라도 한개의 객체를 공유해서 사용할 수 있음.
	public NoticeDao getInstance() {
		if (single == null) {
			// 객체를 생성할 수 있는 이유는 생성자의 접근 한정자가 private이기 때문에
			// 클래스내에서만 객체를 생성할 수 있다.
			single = new NoticeDao();

		}
		return single;
	}

	public boolean update(NoticeDto n) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic", "kic12", "kic12");
			StringBuffer sql = new StringBuffer();
			sql.append("insert into notice(num, writer, title, content,regdate ")
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//코딩
	    return isSuccess;
		
	}

	public boolean delete(int num) {
		boolean isSuccess = false;
		// 코딩
		return isSuccess;

	}

	public ArrayList<NoticeDto> select() {
		ArrayList<NoticeDto> list = new ArrayList<NoticeDto>();
		// 코딩
		return list;
	}

}
