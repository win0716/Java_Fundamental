package java_20190718;

public class LotteryDemo2 {
	public static void main(String[] agrs) {
		//math.random() => 0 보다 크가나 같고 1보다 작은 양수를
		//double 값으로 반환한다.
		
		
	
		int[] lotto = new int[6];
		
		outter : for(int i = 0 ; i<lotto.length;i++) {
			double random = Math.random();
			int temp = (int)(random * 45) + 1;
			lotto[i] = temp;
			if(lotto[i] != lotto[i]) break outter;   				
						} 
	
			  		
		
		for(int i = 0; i<lotto.length; i++) {
			
			System.out.print(lotto[i] + ",");
		}
	}

}
