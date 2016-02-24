package Amazon;

import java.util.ArrayList;

public class TreeZigZag {

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
		System.out.print(root.value);
		ArrayList<Node> children = findChildren(root);
		int i = 0;
		while (children.size() != 0) {
			if (i % 2 == 0) {
				for (int j = children.size() - 1; j >= 0; j--) {
					System.out.print(children.get(j).value);
				}

			} else {
				for (int j = 0; j < children.size(); j++) {
					System.out.print(children.get(j).value);
				}
			}
			i++;
			children = findChildrenInALevel(children);
		}

	}

	public static ArrayList<Node> findChildren(Node n) {
		ArrayList<Node> child = new ArrayList<Node>();
		if (n.left != null) {
			child.add(n.left);
		}
		if (n.right != null) {
			child.add(n.right);
		}
		return child;
	}

	public static ArrayList<Node> findChildrenInALevel(ArrayList<Node> x) {
		ArrayList<Node> list = new ArrayList<Node>();
		for (Node t : x) {
			list.addAll(findChildren(t));
		}
		return list;
	}
}
