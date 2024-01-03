package Algos.DP;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length+1][amount+1];
        for(int i=0 ;i<dp.length ;i++) {
            for(int j=0;j<dp[0].length ; j++){
                if(i==0){
                    dp[i][j] = Integer.MAX_VALUE-1;
                } else if(j==0 && i!=0) {
                    dp[i][j] = 0;
                } else if(coins[i-1] <= j) {
                    dp[i][j] = Math.min(1+dp[i][j-coins[i-1]] , dp[i-1][j] );
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[coins.length][amount] == Integer.MAX_VALUE-1 ? -1 : dp[coins.length][amount] ;

    }
}
