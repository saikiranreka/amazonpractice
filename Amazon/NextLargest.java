package Amazon;

import java.util.ArrayList;

public class NextLargest {

	public static void main(String[] args) {
		long num = 44332211;
		ArrayList<Integer> digits = new ArrayList<Integer>();
		while (num > 0) {
			digits.add((int) (num % 10));
			num = num / 10;
		}
		for (int i = 0; i < digits.size() - 1; i++) {
			int m = digits.get(i);
			int n = digits.get(i + 1);
			if (n < m) {
				digits.set(i, n);
				digits.set(i + 1, m);
				break;
			}
		}
		long sum = 0;
		for (int i = digits.size() - 1; i >= 0; i--) {
			sum = sum * 10 + digits.get(i);
		}
		System.out.println(sum);
	}

}
