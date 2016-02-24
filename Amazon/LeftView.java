package Amazon;

import java.util.ArrayList;

public class LeftView {
	public static class Node {
		int value;
		Node left;
		Node right;

		public Node(int value, Node left, Node right) {
			super();
			this.value = value;
			this.left = left;
			this.right = right;
		}

		public Node() {
			this.value = 0;
			this.left = null;
			this.right = null;
		}

		public Node(int value) {
			super();
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	public static Node root = null;

	public static void main(String[] args) {
		int[] elements = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Node root = new Node(elements[0]);
		root.left = new Node(elements[1]);
		root.right = new Node(elements[2]);
		root.left.left = new Node(elements[3]);
		root.left.right = new Node(elements[4]);
		root.right.left = new Node(elements[5]);
		root.right.right = new Node(elements[6]);
		root.left.left.left = new Node(elements[7]);
		root.left.left.right = new Node(elements[8]);
		ArrayList<Node> list = new ArrayList<Node>();
		list.add(root);
		/*
		 * while (list.size() != 0) { Node t = list.remove(0);
		 * System.out.println(t.value); if (t.left != null) { list.add(t.left);
		 * } if (t.right != null) { list.add(t.right); } }
		 */
		while (list.size() != 0) {
			Node t = list.get(0);
			System.out.println(t.value);
			list = findChildren(list);
		}
	}

	public static ArrayList<Node> findChildren(ArrayList<Node> list) {
		ArrayList<Node> child = new ArrayList<Node>();
		for (Node t : list) {
			if (t.left != null) {
				child.add(t.left);
			}
			if (t.right != null) {
				child.add(t.right);
			}
		}
		return child;
	}
}
