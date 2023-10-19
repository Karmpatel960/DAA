package Practical5;

public class Prac51 {
    public static int knapsack(int[] weights, int[] profits, int W) {
        int n = weights.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], profits[i - 1] + dp[i - 1][w - weights[i - 1]]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] profits = {3, 4, 5, 6};
        int W = 5;
        int maxProfit = knapsack(weights, profits, W);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
