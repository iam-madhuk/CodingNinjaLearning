package com.recursion;

import java.util.Scanner;

public class NumberofDigits {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(NumberofDigits.count(n));
		s.close();
	}

	private static int count(int n) {
		if (n == 0) {
			return 0;
		}
		int ans = count(n / 10);
		return ans + 1;

	}

}
