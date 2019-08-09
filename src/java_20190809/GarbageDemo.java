package java_20190809;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

class A extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("스레드....");
	}
}

class B implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("스레드2...");

	}
}

////public class GarbageDemo {
////	public static void main(String[] args) {
////		A a = new A();
////		a.start();
////
////		System.out.println("bb");
////		B b = new B();
////		Thread t1 = new Thread(b);
////		t1.start();
////		System.out.println("aaaa");
////
////		// 추상 클래스 (자식클래스 뉴하면 된다)
////		Calendar c = new GregorianCalendar();
//////	올바른 코딩
////		Calendar c1 = Calendar.getInstance();
////	}
////
////	// Calendar 클래스에 매서드만 상용할 수 있음.
////	// 단, GregorianCalendar 클레스에서 overring된 메서드는 사용가능.
////	public static Calendar getInstance() {
//		Calendar c = new GregorianCalendar();
//		return new GregorianCalendar();
//
//	}
//
//	int d = Integer.parseInt("10");
//	String e = String.valueOf(d);
//	Random r = new Random();
//	int randNum = r.nextInt(10);
//
//	byte[] f = "a".getBytes();
////}

class Customer {
	String name;

	Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

}

class CustomerDao {
	public Customer[] getCustomet() {
		Customer[] cs = new Customer[10];
		Customer c1 = new Customer("성영한1");
		Customer c2 = new Customer("성영한2");
		Customer c3 = new Customer("성영한3");
		Customer c4 = new Customer("성영한4");
		Customer c5 = new Customer("성영한5");
		Customer c6 = new Customer("성영한6");
		Customer c7 = new Customer("성영한7");
		Customer c8 = new Customer("성영한8");
		Customer c9 = new Customer("성영한9");
		Customer c10 = new Customer("성영한10");

		cs[0] = new Customer("성영한1");
		cs[1] = new Customer("성영한2");
		cs[2] = new Customer("성영한3");

		// 아래는 안좋은 예!
		cs[3] = new Customer("성영한1");
		cs[4] = new Customer("성영한1");
		cs[5] = new Customer("성영한1");
		cs[6] = new Customer("성영한1");
		cs[7] = new Customer("성영한1");
		cs[8] = new Customer("성영한1");
		cs[9] = new Customer("성영한1");

		return cs;
	}

	public ArrayList<Customer> getCustomers() {
		ArrayList<Customer> list = new ArrayList<Customer>(20);
		list.add(new Customer("성영한1"));
		list.add(new Customer("성영한2"));
		list.add(new Customer("성영한3"));
		list.add(new Customer("성영한4"));
		list.add(new Customer("성영한5"));
		list.add(new Customer("성영한6"));
		list.add(new Customer("성영한7"));
		list.add(new Customer("성영한8"));
		list.add(new Customer("성영한9"));
		list.add(new Customer("성영한10"));

		return list;

	}

}

public class GarbageDemo {
	public static void main(String[] args) throws IOException {
		// Dao (Date Access Object)
		CustomerDao cdao = new CustomerDao();

		Customer[] customers = cdao.getCustomet();
		for (Customer customer : customers) {
			System.out.println(customer.getName());

		}

		ArrayList<Customer> list = cdao.getCustomers();
		for (Customer customer : list) {
			System.out.println(customer.getName());
		}
	}
}
