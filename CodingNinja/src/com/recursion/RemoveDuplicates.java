package com.recursion;

import java.util.Scanner;

public class RemoveDuplicates {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String input = s.next();
		System.out.println(RemoveDuplicates.removeConsecutiveDuplicates(input));
	}

	private static String removeConsecutiveDuplicates(String input) {
		if (input.length() == 0)
			return input;
		if (input.length() == 1)
			return input;

		String small = removeConsecutiveDuplicates(input.substring(1));
		if (input.charAt(0) == input.charAt(1)) {
			return small;
		} else {
			return input.charAt(0) + small;
		}

	}
}
