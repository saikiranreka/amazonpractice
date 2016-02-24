package Amazon;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KLargestElements {
	public static class Comp implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {

			return o2 - o1;

		}
	}

	public static void main(String[] args) {
		int[] elements = new int[] { 6, 3, 7, 4, 8, 2, 9, 6, 0, 2, 5, 64, 45,
				4564, 63, 2, 5345, 766, 344, 87, 234, 654, 85, 2344, 53543 };
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comp());
		for (int i = 0; i < elements.length; i++) {
			pq.add(elements[i]);
		}
		int k = 6;
		for (int i = 0; i < k; i++) {
			System.out.println(pq.poll());
		}
	}
}
