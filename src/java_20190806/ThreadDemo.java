package java_20190806;
//외워야함
public class ThreadDemo extends Thread {
	public ThreadDemo(String threadName) {
		super(threadName);
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.printf("%s : %d%n", threadName, i);

		}

	}

	public static void main(String[] args) {
		System.out.println("***********start*************");
		//1. Thread 클래스를 상속 받는다.
		//2. run() 메서드를 overridfing 한다.
		//3. 해당객체를 생성한다.
		//4. 해당색체를 start() 메서드를 호출한다.
		
		ThreadDemo t1 = new ThreadDemo("첫번재 스레드");
		t1.start();
		ThreadDemo t2 = new ThreadDemo("두전째 스레드");
		t2.start();
		System.out.println("**************end************");
	}

}
