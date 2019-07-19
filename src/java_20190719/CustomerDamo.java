package java_20190719;

public class CustomerDamo {
	public static void main(String[] agrs) {
		//Customer 객체 생석
		//Customer => Object type
		//c1 = > regerence
		//new Customer() => object
		Customer c1 = new Customer();
		c1.name = "성영한";
		c1.age = 30;
		c1.email = "sky@hbilab.org";
		c1.phone = "010-3204-1703";
		c1.balance = 23000000000.23;
		c1.isReleased = false;
		
		System.out.printf("%s,%d,%s,%s,$%,.2f,%s",
				c1.name, c1.age, c1.email, c1.phone, 
				c1.balance, c1.isReleased);	
		
		System.out.println();
		
		Customer c2 = new Customer();
		c2.name = "손정의";
		c2.age = 60;
		c2.email = "ceo@softbank.com";
		c2.phone = "010-9999-0000";
		c2.balance = 450_000_000_000.24;
		c2.isReleased = true;
		
		Customer c3 = c2;
		c3.age = 61;
		
		System.out.printf("%s,%d,%s,%s,￦%,.2f,%s",
				c2.name, c2.age, c2.email, c2.phone, 
				c2.balance, c2.isReleased);	
				
	
	}

}
