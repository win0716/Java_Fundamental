package java_20190716;
//ctl + shift + f => 자동으로 줄 맞쳐주기
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;
		
		c = a + b;
		System.out.println(c);
		
		c = a - b;
		
		System.out.println(c);
		
		c = a * b;
		
		System.out.println(c);
		
		d = (double)b / (double)a;
		
		System.out.println(d);
		
		c = b % a;
		System.out.println(c);
		
		a += b; // a = a + b; 
		
		System.out.println(a);
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//단독으로 사용할때는 상관없다
		a++;
		++b;
		
		// a를 c로 대입.
		c = a++;
		System.out.println(c);
		
		// b를 증가하고 c를 대입.
		c = ++b;
	    System.out.println(c);
	    
	    
	    a = 10;
	    b = 20;
	    
	    boolean isSuccess = false;
	    
	    isSuccess = a > b;
	    System.out.println(isSuccess);
	 
	    isSuccess = a < b;
	    System.out.println(isSuccess);
	    
	    isSuccess = a >= b;
	    System.out.println(isSuccess);
	    
	    isSuccess = a <= b;
	    System.out.println(isSuccess);
	    
	    isSuccess = a == b;
	    System.out.println(isSuccess);
	    
	    isSuccess = a != b;
	    System.out.println(isSuccess);
	    
	    //a && b => a가 false이면 b 연산을 하지 않음(short circuit)
	    //a || b => a가 true이면 b 연산을 하지 않음 (short circuit)
	   
	    isSuccess = (a==b) && (++a == b++);
	    System.out.println(!isSuccess); // ! a가 true 면 false,  false면 true
	    System.out.println(a);
	    System.out.println(b);
	    
	   
	}
}

