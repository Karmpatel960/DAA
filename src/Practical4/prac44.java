package Practical4;

import java.util.Arrays;

public class prac44 {

    public static int minCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] test1Coins = {1, 2, 3};
        int test1Amount = 5;
        System.out.println("Test Case 1: " + minCoins(test1Coins, test1Amount)); // Output: 2

        int[] test2Coins = {1, 5, 17, 18};
        int test2Amount = 22;
        System.out.println("Test Case 2: "+ minCoins(test2Coins,test2Amount));


        int[] test3Coins = {1, 5, 10, 25,100};
        int test3Amount = 289;
        System.out.println("Test Case 3: "+ minCoins(test3Coins,test3Amount));


    }
}

