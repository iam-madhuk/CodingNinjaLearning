package com.recursion;

import java.util.Scanner;

public class RemoveX {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(removeX(input));
	}

	private static String removeX(String input) {

		if (input.length() == 0) {
			return input;
		}
		String small = removeX(input.substring(1));
		if (input.charAt(0) == 'x') {
			return small;

		} else {
			return input.charAt(0) + small;
		}
	}
}
