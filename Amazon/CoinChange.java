package Amazon;

public class CoinChange {

	public static void main(String[] args) {
		int[] denominations = new int[] { 3, 4 };
		int sum = 8;
		int[] dp = new int[sum + 1];
		for (int i = 1; i <= sum; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < denominations.length; j++) {
				if (i >= denominations[j]) {
					if (i == denominations[j]) {
						min = 1;
					} else {
						min = Math.min(min, dp[i - denominations[j]]) + 1;
					}
				}
			}
			if (min == Integer.MAX_VALUE) {
				dp[i] = 0;
			} else
				dp[i] = min;
		}
		System.out.println(dp[4]);
	}
}
