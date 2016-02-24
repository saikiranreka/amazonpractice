package Amazon;

import java.util.ArrayList;
import java.util.Collections;

public class NmberLinkedList {
	public static class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}

		public Node() {
			this.next = null;
		}

		public Node getNext(Node t) {
			return t.next;
		}
	}

	public static void main(String[] args) {
		int[] elements = new int[] { 4, 7, 1 };
		int[] elements2 = new int[] { 6, 6, 2 };
		Node root = null;
		Node currentRoot = null;
		Node root1 = null;
		Node currentRoot1 = null;
		Node root2 = null;
		Node currentRoot2 = null;
		for (int i = 0; i < elements.length; i++) {
			if (root == null) {
				root = new Node();
				root.value = elements[0];
				currentRoot = root;
			} else {
				Node t = new Node();
				t.value = elements[i];
				currentRoot.next = t;
				currentRoot = t;
			}
		}
		for (int i = 0; i < elements2.length; i++) {
			if (root1 == null) {
				root1 = new Node();
				root1.value = elements2[0];
				currentRoot1 = root1;
			} else {
				Node t = new Node();
				t.value = elements2[i];
				currentRoot1.next = t;
				currentRoot1 = t;
			}
		}
		int num1 = convertToNumber(root);
		int num2 = convertToNumber(root1);
		long total = num1 + num2;
		ArrayList<Integer> result = new ArrayList<Integer>();
		result = numberToArray(total);
		for (int i = 0; i < result.size(); i++) {
			if (root2 == null) {
				root2 = new Node();
				root2.value = result.get(i);
				currentRoot2 = root2;
			} else {
				Node t = new Node();
				t.value = result.get(i);
				currentRoot2.next = t;
				currentRoot2 = t;
			}
		}
		while (root2 != null) {
			System.out.println(root2.value);
			root2 = root2.next;
		}
	}

	public static int convertToNumber(Node n) {
		int sum = 0;
		while (n != null) {
			sum = sum * 10 + n.value;
			n = n.next;
		}
		return sum;
	}

	public static ArrayList<Integer> numberToArray(long num) {
		ArrayList<Integer> t = new ArrayList<Integer>();
		while (num > 0) {
			t.add((int) num % 10);
			num = num / 10;
		}
		Collections.reverse(t);
		return t;
	}
}
