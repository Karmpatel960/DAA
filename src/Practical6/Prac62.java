package Practical6;

import java.util.Arrays;
public class Prac62 {
    static final int N = 3;
    public static int assignmentProblem(int[][] cost) {
        int minCost = 0;
        int[] lookup = new int[N];
        Arrays.fill(lookup, -1);
        int[] row = new int[N];
        Arrays.fill(row, -1);
        int[] col = new int[N];
        Arrays.fill(col, -1);

        for (int i = 0; i < N; i++) {
            int min = Integer.MAX_VALUE;
            int assignedCol = -1;
            for (int j = 0; j < N; j++) {
                if (row[i] == -1 && col[j] == -1 && cost[i][j] < min) {
                    min = cost[i][j];
                    assignedCol = j;
                }
            }
            row[i] = 1;
            col[assignedCol] = i;
            minCost += cost[i][assignedCol];
            lookup[assignedCol] = i;
        }

        System.out.println("Optimal Assignment:");
        for (int i = 0; i < N; i++) {
            System.out.println("Person " + (i + 1) + " assigned Job " + (lookup[i] + 1));
        }

        return minCost;
    }

    public static void main(String[] args) {
        int[][] cost = {
                {2, 6, 7},
                {4, 8, 3},
                {9, 5, 1}
        };

        System.out.println("Minimum cost is " + assignmentProblem(cost));
    }
}
