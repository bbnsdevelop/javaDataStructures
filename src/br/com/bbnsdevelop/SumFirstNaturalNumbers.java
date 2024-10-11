package br.com.bbnsdevelop;

public class SumFirstNaturalNumbers {

	public static void main(String[] args) {

		int n = 5;
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println(sum);

		int sumOtherWay = n * (n + 1) / 2;
		System.out.println(sumOtherWay);

	}

	

}
