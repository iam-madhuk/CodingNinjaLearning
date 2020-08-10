package com.recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		TowerOfHanoi.towerOfHanoi(n, 'a', 'b', 'c');
	}

	private static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if (disks >= 1) {
			towerOfHanoi(disks - 1, source, destination, auxiliary);
			System.out.println(source + " " + destination);
			towerOfHanoi(disks - 1, auxiliary, source, destination);
		}

	}
}
