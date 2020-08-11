package com.recursion;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(SumOfDigit.sumOfDigits(n));
	}

	private static int sumOfDigits(int n) {

		if (n == 0) {
			return 0;
		}
		int sum = (n % 10) + sumOfDigits(n / 10);
		return sum;
	}
}
