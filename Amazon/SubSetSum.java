package Amazon;

public class SubSetSum {

	public static void main(String[] args) {
		int[] elements = new int[] { 5, 7, 8, 9, 4, 2, 55, 1, 3, 11, 13, 10 };
		int sum = 25;
		boolean[][] dp = new boolean[elements.length + 1][sum + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (i > j && !dp[i - 1][j]) {
					dp[i][j] = false;
				} else if (dp[i - 1][j] || dp[i - 1][j - i]) {
					dp[i][j] = true;
				} else if (i == j) {
					dp[i][j] = true;
				}
			}
		}
		if (dp[elements.length][sum]) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
