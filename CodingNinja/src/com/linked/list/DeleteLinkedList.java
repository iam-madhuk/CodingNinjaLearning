package com.linked.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteLinkedList {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static LinkedListNode<Integer> takeInput() throws IOException {
		LinkedListNode<Integer> head = null, tail = null;

		String[] datas = br.readLine().trim().split("\\s");

		int i = 0;
		while (i < datas.length && !datas[i].equals("-1")) {
			int data = Integer.parseInt(datas[i]);
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			i += 1;
		}

		return head;
	}

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {
			LinkedListNode<Integer> head = takeInput();

			int pos = Integer.parseInt(br.readLine().trim());
			head = deleteNode(head, pos);
			print(head);

			t -= 1;
		}

	}

	private static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {

		LinkedListNode<Integer> newHead = head;
		if (pos == 0) {
			newHead = head.next;
			return newHead;
		} else {

			int count = 0;
			LinkedListNode<Integer> prev = head;
			while (count < pos - 1) {
				count++;
				prev = prev.next;
			}
			if (prev.next != null) {
				prev.next = prev.next.next;
			}
			return head;

		}
	}
}
