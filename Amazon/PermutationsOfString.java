package Amazon;

public class PermutationsOfString {

	public static void main(String[] args) {
		String t = "abc";
		int len = t.length();
		int count = 1 << len;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < len; j++) {
				if ((i & 1 << j) > 0) {
					System.out.print(t.charAt(j));
				}
			}
			System.out.println();
		}

	}
}
