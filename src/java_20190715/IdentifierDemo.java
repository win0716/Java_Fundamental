//특수문자중에 $,_ 는 사용할 수 있음
package java_20190715;
//클래스명의 첫글자는 대문자
//두단어가 합친경우에는 두번째단어의 첫글자는 대문자로 사용
//(camel case)
public class IdentifierDemo {
	public static void main(String[] args) {
		int age = 10;
		String name = "hello";
		//첫글자로 숫자를 사용할 수 없음
		//String 1fathername = "john";
		//공백을 사용할 수 없음
		//String mother name = "michell";
		//예약어는 변수(식별자)로 사용할 수 없음
		//String void = "empoty";
		//자바는 유니코드를 지원하기 때문에 한글도 식별자로 사용
		//가능하지만 안쓰는게 좋음.
		String 이름 = "성영환";
		System.out.println(이름);
		
		//이런표기법은 사용하지않는다
		//String father_name = "michael"
	}

}
