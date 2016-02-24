package inter;

public class CuttingRod {

	public static void main(String[] args) {
		//int[] price = new int[]{2,5,7,8};
		int[] price = new int[] { 1, 5, 8, 9, 10, 17, 17, 20 };
		int length = 8;
		int dp[][] = new int[price.length][length + 1];
		for (int i = 0; i < price.length; i++) {
			for (int j = 1; j < length+1; j++) {
				if (i == 0) {
					dp[i][j] = j * price[i];
				} else {
					if(j>=i+1)
						dp[i][j] = Math.max(dp[i - 1][j], price[i]
								+ dp[i][j - i-1]);
					else{
						dp[i][j]=dp[i-1][j];					}
				}
			}
		}
		System.out.println(dp[price.length - 1][length]);
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
	}

}
