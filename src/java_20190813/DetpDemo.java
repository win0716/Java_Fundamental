package java_20190813;

import java.util.ArrayList;

public class DetpDemo {
	public static void main(String[] args) {
		DeptDao dao = DeptDao.getInstance();
		
		boolean isSuccess = dao.insert(new DeptDto(62,"Development","강남역"));
		if(isSuccess) {
			System.out.println("부서가 추가 되었습니다.");
			
		}else {
			System.out.println("오류");
		}
		
		isSuccess = dao.update(new DeptDto(62,"개발부","서초역"));
		
		if(isSuccess) {
			System.out.println("부서가 수정 되었습니다.");
		}else {
			System.out.println("수정오류");
		}
		
		ArrayList<DeptDto> list = dao.select();
		for(DeptDto d : list) {
			int no = d.getNo();
			String name = d.getName();
			String loc = d.getLoc();
			
					
			System.out.printf("%d,%s,%s%n",no,name,loc);
		}
		
		isSuccess = dao.delete(60);
		if(isSuccess) {
			System.out.println("부서가 삭제 되었습니다.");
			
		}else {
			System.out.println("삭제 오류");
		}
		
	
	}

}
