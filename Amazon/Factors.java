package Amazon;

public class Factors {

	public static void main(String[] args) {
		int num = Integer.MAX_VALUE;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				if (i < num / i)
					System.out.print(i + " " + num / i + " ");
				else if (i == num / i) {
					System.out.print(i + " ");
				}
			} else if (i > num / i) {
				break;
			}

		}

	}
}