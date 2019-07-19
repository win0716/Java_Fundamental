package java_20190718;

public class LotteryDemo2 {
	public static void main(String[] agrs) {

		for (int k = 0; k < 5; k++) {
			int[] lotto = new int[6];

			for (int i = 0; i < lotto.length; i++) {
				double random = Math.random();
				int temp = (int) (random * 45) + 1;

				if (i == 0) {
					lotto[i] = temp;
				} else {
					boolean isExusted = false;
				}
			}

			

			for (int i = 0; i < lotto.length; i++) {
				double random = Math.random();
				int temp = (int) (random * 45) + 1;
				if (i == 0) {
					lotto[i] = temp;
				} else {
					boolean isExisted = false;
					for (int j = 0; j < i; j++) {
						if (lotto[j] == temp) {
							isExisted = true;
							break;
						}
					}

					if (!isExisted) {
						lotto[i] = temp;
					} else {
						i--;
					}
				}

			}
			for (int i = 0; i < lotto.length; i++) {

				System.out.print(lotto[i] + ",");
			}
			System.out.println();
		}

	}
}
