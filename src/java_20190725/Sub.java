package java_20190725;

public class Sub extends Super {
	String chicken;
	public void gotoSchool() {
		System.out.println("Sub gotoschool");
	}
	
	//overriding : 부모의 메서드를 재정의
	//1. 반환형, 메서드 이름, 매개 변수 일치\
	//2. 접그한정자는 부모보다 자식이 상위이서나 같으면 됨.
	public void play(String starcraft) {
		super.play("omok");
		System.out.println("Sub play()");
		
	}

}
