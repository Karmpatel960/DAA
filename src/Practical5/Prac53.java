package Practical5;

public class Prac53 {
    public static void matrixChainOrder(int[] dimensions) {
        int n = dimensions.length - 1;
        int[][] m = new int[n][n];
        int[][] s = new int[n][n];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                m[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    int cost = m[i][k] + m[k + 1][j] + dimensions[i] * dimensions[k + 1] * dimensions[j + 1];
                    if (cost < m[i][j]) {
                        m[i][j] = cost;
                        s[i][j] = k;
                    }
                }
            }
        }

        System.out.println("Minimum number of scalar multiplications: " + m[0][n - 1]);
        System.out.println("Optimal parenthesization:");
        printOptimalParenthesis(s, 0, n - 1, dimensions);
    }

    public static void printOptimalParenthesis(int[][] s, int i, int j, int[] dimensions) {
        if (i == j) {
            System.out.print("A" + (i + 1));
        } else {
            System.out.print("(");
            printOptimalParenthesis(s, i, s[i][j], dimensions);
            printOptimalParenthesis(s, s[i][j] + 1, j, dimensions);
            System.out.print(")");
        }
    }

    public static void main(String[] args) {
        int[][] dimensions = {
                {3, 5, 6, 4},
                {30, 35, 15, 5, 10, 20, 25}
        };

        for (int i = 0; i < dimensions.length; i++) {
            System.out.println("Test Case " + (i + 1) + ":");
            matrixChainOrder(dimensions[i]);
            System.out.println("\n");
        }
    }
}

