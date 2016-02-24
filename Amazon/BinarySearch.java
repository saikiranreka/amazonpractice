package Amazon;

public class BinarySearch {

	public static void main(String[] args) {
		int[] elements = new int[] { 2, 5, 7, 8, 9, 10, 13, 16, 18 };
		int target = 17;
		int L = 0;
		int R = elements.length - 1;
		System.out.println(find(elements, L, R, target));

	}

	public static int find(int[] elements, int L, int R, int t) {
		int mid = (L + R) / 2;
		if (L <= R) {
			if (elements[mid] > t) {
				R = mid - 1;
			} else if (elements[mid] < t) {
				L = mid + 1;
			} else {
				return mid;
			}
			return find(elements, L, R, t);
		}
		if (elements[mid] > t) {
			return mid - 1;
		} else {
			return mid + 1;
		}

	}

}
