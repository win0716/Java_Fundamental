package java_20190717;

public class ContinusDemo {
	public static void main(String[] args) {
	
		int sum = 0;
		for (int i = 1 ; i <= 10; i++) {
			if(i == 6) continue;
			sum += i; // sum = sum + 1
		//}
	}
		
		System.out.printf("1부터 10까지 총 합은 %d 입니다.%n", sum);
		
		if(true) return;
		
		outter : for(int first = 2; first <= 9; first++) {
			for(int second = 1; second <= 9; second++) {
 				if(second==5) continue outter;
			
			    System.out.printf("%d * %d = %d%n", first, second, first*second);	
			    }
	}
	}
}