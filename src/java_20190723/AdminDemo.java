package java_20190723;

public class AdminDemo {
	public static void main(String[] agrs) {
	    Admin a = new Admin("shy1011", "1234");
		//a.setId("shy1011");
		//a.setPwd("1234");
		//a.setEmail("syh@hbilab.org");
		//a.setLevel(1);
		
		System.out.printf("%s,%s,%s,%d,%n",a.getId(),a.getPwd(),a.getEmail(),a.getLevel());
	}

}