package Practical5;

public class Prac52 {
    public static String longestCommonSubsequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Build the DP matrix
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Reconstruct the longest common subsequence
        int i = m;
        int j = n;
        StringBuilder lcs = new StringBuilder();
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                lcs.insert(0, str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.toString();
    }

    public static void main(String[] args) {
        String[] string1 = {"ABCDAB", "EXPONENTIAL", "LOGARITHM"};
        String[] string2 = {"BDCABA", "POLYNOMIAL", "ALGORITHM"};

        for (int i = 0; i < string1.length; i++) {
            String str1 = string1[i];
            String str2 = string2[i];
            String lcs = longestCommonSubsequence(str1, str2);
            System.out.println("Test Case " + (i + 1) + ":");
            System.out.println("String1: " + str1);
            System.out.println("String2: " + str2);
            System.out.println("Longest Common Subsequence: " + lcs);
            System.out.println();
        }
    }
}
