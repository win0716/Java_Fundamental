package java_20190726_Exercise;

public class step4Demo {
	public static void execute(Step4 sm) {
		sm.start();
		for(long i=0; i<30000000000l;i++) {
			
		}
		sm.stop();
		
		double elapsedTime = sm.getElapsedTime();
		System.out.printf("경과시간 : %.3f",elapsedTime);
	}
	
	public static void execute(Step4Nano sn) {
		sn.start();
		for(long i=0; i<30000000000l;i++) {
			}
		sn.stop();
		
		double elapsedTime = sn.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
		System.out.println();
	}
	public static void main(String[] agrs) {
		Step4Nano s1 = new Step4Nano();
		execute(s1);
		
		Step4 s2 = new Step4();
		execute(s2);
	

	}
	
		
}
