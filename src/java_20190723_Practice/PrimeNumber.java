package java_20190723_Practice;

public class PrimeNumber {
	public void printPrimeNumber(int temp) {
		boolean isPrimeNumber = false;
		int count = 0;
		for (int i = 2; i <= temp; i++) {
			isPrimeNumber = true;
			for (int n = 2; n < i; n++)
				if (i % n == 0) {
					isPrimeNumber = false;
					break;
				}
			if (isPrimeNumber) {
				count++;
				System.out.print(i + "\t");
				if (count % 5 == 0) {
					System.out.println();
				}

			}
		}
		System.out.println();
		System.out.printf("소수의 갯수 : %s%n", count);

	}

}