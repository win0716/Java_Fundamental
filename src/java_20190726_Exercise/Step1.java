package java_20190726_Exercise;

public class Step1 {
	long startTime;
	long endTime;
	
	long startNanoTime;
	long endNanoTime;
	
	public double getElapsedTime() {
		return (double)(endTime - startTime)/(double)1000;
		
	}
	public double getElapsedNanoTime() {
		return (double)(endNanoTime - startNanoTime)/(double)1000000000;
		
	}
	public static void main(String[] agrs) {
		Step1 f1 = new Step1();
		f1.startNanoTime = System.nanoTime();
		for(long i=0; i<30000000000l;i++) {
			
		}
		f1.endNanoTime = System.nanoTime();
		double elapsedNanoTime = f1.getElapsedNanoTime();
		System.out.printf("경과 시간 : %.9f", elapsedNanoTime);
	}
	
}
