package java_20190726_Exercise;

public class Step3 {
	
	long startTime;
	long endTime;
	
	public void start() {
		startTime = System.currentTimeMillis();
		
	}
	public void stop() {
		endTime = System.currentTimeMillis();
		
		
	
	}
	
	public double getElapsedTime() {
		return (double)(endTime - startTime)/(double)1000;
		
	}

}
