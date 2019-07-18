package java_20190715;

public class CharLiteralDemo {
	public static void main(String[] args) {
		char c1 = '\ud558';
		char c2 = '\ubcf4';
		char c3 = '\uc5f0';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//char literal의 아스키코드 표현 =>65
		
		char c4 = 65;
		System.out.println(c4);
		
		//char literal의 문자 표기 => ''
		
		char c5 = 'q';
	
		System.out.println(c5);
		
		char c6 = '\"';
		
		// \n => 개행(line feed)
		// \t =>  teb
		// \\ => back slash
		// \' => single quotation
		// \" => double quotation
		String path = "aa\nbb";
		
		System.out.println(path);
		
	}

}
