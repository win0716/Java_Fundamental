package java_20190729;
//ctl + shift + o (영문 o )
import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//자바 1.4이번 버전에서는 primitive data type을 collection에 저장
		//할수 없었기 때문에 primitive data type을 객체화 할수 있는 
		//Wrapper 으로 변환하여 저장해야 한다. 아래와 같이 1을 add 할 수 없음.
		//list.add(1);
		list.add(new Integer(1));
		
		//1. primitive data type => wrapper class (생성자 => new Integer)

		Integer i2 = new Integer(10);//auto-boxing
		Integer i3 = new Integer(20);
		
		//2. String => wrapper class(Integer.valueOf("10)) - 외우기 
			
		String s1 = "10";
		String s2 = "20";
		Integer i1 = Integer.valueOf(s1);
		
		//3.wrappe class ==> primitive data type(intvalue())
		
		int temp = i2.intValue() + i3.intValue();//auto-unboxing
		
		//4. String => primitive data type (Integer.parseInt("10")) -제일중요
		temp = Integer.parseInt(s1) + Integer.parseInt(s2);
		
		
		//5.primitive data type =>String(+"")
		int a1 = 10;
		String s3 = String.valueOf(a1);
		
		//auto-boxing : primitive data type 자동으로 wrapper
		Integer i4 = 10;
		
		//auto-unboxing : wrapper 자동으로 primitive data type
		int a2 = i2 + i3;
		
		System.out.println(i2==i3);
		System.out.println(i2.equals(i3));
		
		String s4 = "12.34";
		double d1 = Double.parseDouble(s4);
		System.out.println(d1);
		
		
				
	}

}
