package Amazon;

import java.util.Stack;

public class StackOrder {
	static Stack<Integer> st = new Stack<Integer>();
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {

		int[] elements = new int[] { 8, 4, 3, 9, 2, 7, 1, 56, 65, 34, 754 };
		for (int i = 0; i < elements.length; i++) {
			pushST(elements[i]);
		}

	}

	public static void pushST(int i) {
		st.push(i);
		if (i < min) {
			min = i;
		}
	}
}
