package java_20190719;
//public은 파일이름과 동일한 클래스에만 추가할 수 있음
public class A {
	S tring name;
	int age;
	
	public void m() {
		System.out.println("m() 메서드");
	}
	public static void main(String[] args) {
		A a = new A();
		a.name = "하보연";
		a.age = 20;
		
		System.out.println(a.name);
		System.out.println(a.age);
		
		a.m();
	}
}
//	public static void main(Strin[] agrs) {
//		System.out.println("hello1");
	//}
//}

//class B {
	//main 메서드가 실행되기 위해서는 public이 추가된 클래스에서만 작동도미
	//main 메서드가 실행되기 위해서는 파일이름과 동일한 클레스에서 작동됨
	//public static void main(Strin[] agrs) {
	//	System.out.println("hello2");
	//}
//}
