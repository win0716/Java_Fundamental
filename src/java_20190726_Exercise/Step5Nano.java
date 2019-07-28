package java_20190726_Exercise;

public class Step5Nano extends Step5 {
	public void start() {
		startTime = System.nanoTime();
		
	}
	public void stop() {
		endTime = System.nanoTime();
		
	}
	
	public double getElapsedTime() {
		return (double)(endTime - startTime)/(double)1000000000;
		
	}
	
	public void execute() {
		start();
		
		for(long i = 0; i<30000000000l; i++) {
			
		}
		
		stop();
		
		double elapsedTime = getElapsedTime();
		System.out.printf("경과 시간 : %.9f", elapsedTime);
	}

}
