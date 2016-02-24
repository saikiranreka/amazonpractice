package Amazon;

public class LinkedListReverse {
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
		int[] elements = new int[] { 4, 7, 1, 7, 0, 3, 6, 2, 9, 5, 4 };
		Node root = null;
		Node currentRoot = null;
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
		printReverse(root);
		/*
		 * while (root != null) { System.out.println(root.value); root =
		 * root.next; }
		 */
	}

	public static void printReverse(Node root) {
		if (root.next != null) {
			printReverse(root.next);
		}
		System.out.println(root.value);
	}
}
