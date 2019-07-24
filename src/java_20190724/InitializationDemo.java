package java_20190724;
//i18n => 국제화 I nternationalization n
//l10n => 지역화 l ocalizatio n
public class InitializationDemo {
	
	
	 //static 초기화 블럭
	
	static {
		System.out.println("static area");//1
		b = 100;
	}
	//instance 초기화 블럭(이렇게 안쓴다)
	{
		System.out.println("instance area");//4
		a =  10; 
	}
	int a;
	static int b;
	static final int C=10;
	//static 초기화
	
	//생성자에서 초기화 할 수 있는 변수는 instance 변수만
	public InitializationDemo(int a) {
		//super();
		System.out.println("생성자");//5
		this.a = a;
		
	}
	public static void main(String[] args) {
		System.out.println("main area");//2
		InitializationDemo i = new InitializationDemo(1000);//3
		System.out.println(i.a);
		System.out.println(b);
		System.out.println(C);
		}
	

}
