package java_20190729;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String ("test");
		String s2 = new String ("test");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		String sql = "djalkdsjklm dsjdkjd, djlksjl, djskljdsl,";//xxxxxxxxxxxxxxxxx
		sql += "djsklajdajkl,ddsds,";//xxxxxxxxxxxxxxxxx
		sql += "";//xxxxxxxxxxxxxxxxx
		sql += "";//xxxxxxxxxxxxxxxxx
		sql += "";//xxxxxxxxxxxxxxxxx
		
				
				
		
		String ssn = "111111-1111118";
		//charAt(int index) : 문자열중에서 특정 index에 있는 문자를 반환한다.
		//시작 index는 0부터 
		
		char c =ssn.charAt(6);
		System.out.println(c);
		
		//concat(String msg) ; 문자열을 연결
		ssn = ssn.concat("abcd");// ssn+("abcd");
		System.out.println(ssn);
		
		String fileName = "abd.abc.abc.abc.dddddd.doc";
		
		//endsWith(String msg) msg 문자열로 끝나면 true, 그렇지 않은면 flase
		
		if(fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		}else if(fileName.endsWith("dos")) {
			System.out.println("워드 문서 입니다.");
		}else {
			System.out.println("파일 입니다.");
		}
		//equalsIgnoreCase(String msg) : 대소문자를 구분하지 않고 문자열을 비교하여
		//같으면 true, or false
		System.out.println(fileName.equalsIgnoreCase("ABD.Doc"));
		
		//indexOf(String msg) : msg문자열을 위치를 반환한다.
		//msg 문자열을 처음부터 찾고 시작 위치는 0부터
		int index = ssn.indexOf("-");
		System.out.println(index);
		System.out.println(fileName.indexOf("."));
		//lastIndexOf(String msg) : msg문자열을 위치를 반환한다.
		//msg 문자열을 찾을때 끝에서 찾고 index는 처음부터 0으로 (수를 센다)시작한다. 
		System.out.println(fileName.lastIndexOf("."));
		
		//111111-1111118
		//substring(int first, int second)
		//first(포함)부터, second를 (포함하지 않음) 사이으 문자열을 추출한다.
		//substring(int first)
		//first(포함)이 보다 큰 모든 문자열을 추출한다. 
		String first = ssn.substring(0,ssn.indexOf("-"));//뒤 6은 포함하지 않는다
		String second =  ssn.substring(ssn.indexOf("-")+1);// 특정한 기호를 기점으로 오른쪽 왼쪽으로 나눈다 
		System.out.println(first);
		System.out.println(second);
		
		String fil = fileName.substring(0,fileName.lastIndexOf("."));//뒤 6은 포함하지 않는다
		String se = fileName.substring(fileName.lastIndexOf(".")+1);// 특정한 기호를 기점으로 오른쪽 왼쪽으로 나눈다 
		System.out.println(fil);
		System.out.println(se);
		
		String html = "안녕하세\n 저는  성연한 입니다. \n잘 부탁드립니다.";
		//replaceAll(String first, String second)
		//first 문자열을 second 문자열을 대체한다.
		html = html.replaceAll("\n","<br>");
		System.out.println(html);
		
		String url = "http://www.naver.com";
		String path = "/news";
		if(path.startsWith("/new")) {
			System.out.println("뉴스 페이지 입니다.");
		}else if(path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		String m1 = "hello";
		String m2 = "hello ";
		
		System.out.println(m1);
		System.out.println(m2);
		if(m1.contentEquals(m2.trim())) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//toUpperCase() 대문자로 변환
		m1 = m1.toUpperCase();
		System.out.println(m1);
		//toLowerCase()  소문자로 변화
		m1 = m1.toLowerCase();
		System.out.println(m1);
		
		//String.valueOf() : primitive data type을 문자열로 변환한다. 
		 int a = 10;
		 String str = String.valueOf(a);
		 
		 char[] c1 = {'a','b','c'};
		 String str1 = String.copyValueOf(c1,0,2);
		 System.out.println(str1);
		 
		//ssn : 111111-1111118
		//split(String delimiter) :  
		 //구분자(delimiter)로 토큰(token)화 시키는 메서드
		String[] strArray = ssn.split("-");
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		
		String str2 = String.format("%,.2f", 1234.12312);
		System.out.println(str2);
		

		str2 = String.format("%,d", 1000000000);
		System.out.println(str2);
	} 
	
}


