package inter;

public class MinimumCoinChange1D {

	public static void main(String[] args) {
		int[] coins = new int[] { 1, 5, 6, 8 };
		int total = 11;
		int dp[] = new int[total + 1];
		dp[0] = 0;
		for (int i = 1; i < total + 1; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < coins.length; j++) {
				if (i >= coins[j])
					min = Math.min(min, dp[i - coins[j]]);
			}
			dp[i] = min + 1;
		}
		for (int i = 0; i < dp.length; i++) {
			System.out.print(dp[i] + " ");
		}
	}

}
