package Amazon;

public class BinaryPalindrome {

	public static void main(String[] args) {
		int t = 3591;
		StringBuilder sb = toBinary(t);
		String tt = sb.toString();
		if (sb.reverse().toString().equals(tt)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static StringBuilder toBinary(int n) {
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			if (n % 2 == 0) {
				sb.append("0");
			} else {
				sb.append("1");
			}
			n = n / 2;
		}
		return sb;
	}

}
