package com.time.complexity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayIntersection {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(ArrayList<Integer> list) {
		for (int i : list) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		ArrayIntersection.intersection(arr1, arr2);
	}
 
	private static void intersection(int[] arr1, int[] arr2) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

		for (int a : arr1) {
			if (!count.containsKey(a)) {
				count.put(a, 1);
			} else {
				count.put(a, count.get(a) + 1);

			}
		}
		for (int a : arr2) {
			if (count.containsKey(a)) {
				if (count.get(a) > 0) {
					list.add(a);
					count.put(a, count.get(a) - 1);

				}

			}

		}
		print(list);
	}

}
