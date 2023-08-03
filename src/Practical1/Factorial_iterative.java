package Practical1;

import java.util.Scanner;

public class Factorial_iterative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inp = in.nextInt();
        System.out.println("The Answer for factorial is "+factorialIterative(inp));
    }

    private static double factorialIterative(int n) {

        double ans = 1;
        int intr = 0;
        intr++;
        for (int i = 1; i <= n; i++) {
            intr++;
            ans = ans * i;
            intr++;
        }
        System.out.println("Total count of total factorial is  " + intr);
        return ans;
    }
}
