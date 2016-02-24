package inter;

public class MinimumCOionChange {

	public static void main(String[] args) {
		int[] coins = new int[] { 1, 5, 6, 8 };
		int total = 8;
		int dp[][] = new int[coins.length][total + 1];
		for (int i = 0; i < coins.length; i++) {
			for (int j = 1; j < total + 1; j++) {
				if (i > 0) {
					if (coins[i] <= j) {
						dp[i][j] = Math.min(dp[i][j - coins[i]] + 1,
								dp[i - 1][j]);
					} else {
						dp[i][j] = dp[i-1][j];
					}
				}else{
					dp[i][j]=dp[i][j-1]+1;	
				}
			}
		}
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
	}

}
