package java_20190726_Exercise;

public class Step1Demo {

	long startTime;
	long endTime;

	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000;
	}

	public static void main(String[] args) {
		Step1Demo f1 = new Step1Demo();
		
		f1.startTime = System.currentTimeMillis();
		for (long i=0; i < 30000000000l; i++) {

		}
		
		f1.endTime = System.currentTimeMillis();
		double elapsedTime = f1.getElapsedTime();
		System.out.printf("경과시간 : %.3f",elapsedTime);

	}
}
