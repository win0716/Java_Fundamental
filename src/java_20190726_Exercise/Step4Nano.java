package java_20190726_Exercise;

public class Step4Nano {
	long startTime;
	long endTime;
	
	public void start() {
		startTime = System.nanoTime();
			
	}
	
	public void stop() {
		endTime =  System.nanoTime();
		
	}
	
	public double getElapsedTime() {
		return (double)(endTime - startTime)/(double)1000000000;
		
	}
	

}
