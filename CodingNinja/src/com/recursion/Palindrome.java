package com.recursion;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Palindrome.isStringPalindrome(input));
	}

	private static boolean isStringPalindrome(String input) {
		if (input.length() == 0) {
			return true;
		}

		return check(input, 0, input.length() - 1);
	}

	private static boolean check(String input, int i, int j) {

		if (i == j) {
			return true;
		}
		if (input.charAt(i) != input.charAt(j)) {
			return false;
		}

		if (i < j + 1) {
			check(input, i + 1, j - 1);
		}
		return true;
	}
}
