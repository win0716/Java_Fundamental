package java_20190726_Exercise;

public class Step5Millis extends Step5 {
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		endTime = System.currentTimeMillis();
		
	}
	public double getElapsedTime() {
		return (double)(endTime - startTime)/(double)1000;
	}
	
	public void execute() {
		start();
		
		for(long i=0; i<30000000000l; i++) {
			
		}
		stop();
		
		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}

}
