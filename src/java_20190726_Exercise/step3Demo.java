package java_20190726_Exercise;

public class step3Demo {
	public static void main(String[] agrs) {
		Step3Nano s1 =  new Step3Nano();
		
		s1.start();
		
		for(long i=0 ; i <  30000000000l; i++) {
			
		}
		
		s1.stop();
		
		double elapsedTime =  s1.getElapsedTime();
		System.out.printf("경과시간 %.9f", elapsedTime);
	}

}
