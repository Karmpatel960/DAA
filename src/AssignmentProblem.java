import java.util.Arrays;

public class AssignmentProblem{

    private static final int INF = Integer.MAX_VALUE;

    public static int hungarianAlgorithmDP(int[][] costMatrix) {
        int n = costMatrix.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                dp[i][j] = costMatrix[i][j];
            }
        }

        for (int i = 0; i < n; ++i) {
            int minVal = INF;
            for (int j = 0; j < n; ++j) {
                minVal = Math.min(minVal, dp[i][j]);
            }
            for (int j = 0; j < n; ++j) {
                dp[i][j] -= minVal;
            }
        }

        for (int j = 0; j < n; ++j) {
            int minVal = INF;
            for (int i = 0; i < n; ++i) {
                minVal = Math.min(minVal, dp[i][j]);
            }
            for (int i = 0; i < n; ++i) {
                dp[i][j] -= minVal;
            }
        }

        int[] assigned = new int[n];
        Arrays.fill(assigned, -1);
        boolean[] rowMarked = new boolean[n];
        boolean[] colMarked = new boolean[n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (dp[i][j] == 0 && !colMarked[j] && !rowMarked[i]) {
                    assigned[i] = j;
                    rowMarked[i] = true;
                    colMarked[j] = true;
                    break;
                }
            }
        }

        int minCost = 0;
        for (int i = 0; i < n; ++i) {
            int j = assigned[i];
            if (j != -1) {
                minCost += costMatrix[i][j];
            }
        }

        return minCost;
    }

    public static void main(String[] args) {
        int[][] costMatrix = {
                {8, 2, 7},
                {3, 4, 6},
                {4, 5, 8}
        };

        int minCost = hungarianAlgorithmDP(costMatrix);
        System.out.println("Minimum cost: " + minCost);
    }
}

