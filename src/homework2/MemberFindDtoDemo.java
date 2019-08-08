package homework2;

public class MemberFindDtoDemo {
	public static void main(String[] args) {
	//1.객체를생성한다
		MemberFindDto m1 = new MemberFindDto(1, "shy@teat.com", "111", "2019-08-01","2019-08-02");
		
		//2. 객체의 내용을 출력해 본다
		System.out.println(m1.getSeq());
		System.out.println(m1.getEmail());
		System.out.println(m1.getCode());
		System.out.println(m1.getSdate());
		System.out.println(m1.getEdte());
		//3. 객체의 내용을 수정해 본다.
		m1.setSeq(1111);
		m1.setEmail("syh1111@test.com");
		m1.setcode("1231231");
		m1.setSdate("2010901");
		m1.sesEdate("201923132");
		//4. 객체의 내용을 출력해 본다.
		System.out.println(m1.getSeq());
		System.out.println(m1.getEmail());
		System.out.println(m1.getCode());
		System.out.println(m1.getSdate());
		System.out.println(m1.getEdte());
		///1,2,3,4
		MemberFindDto m2 = new MemberFindDto(2, "shy@teat.com", "111", "2019-08-01","2019-08-02");
		
		
		
	}

}
