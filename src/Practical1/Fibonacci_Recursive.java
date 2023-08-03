package Practical1;

import java.util.Scanner;

public class Fibonacci_Recursive {
    static int count = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inp = in.nextInt();
        count++;
        System.out.println("The Answer for Fibonacci is "+fibonacciRecursive(inp));
        System.out.println("Total Count is "+count);
    }

    private static int fibonacciRecursive(int n) {
        count++;
        if(n <= 1) {
            count++;
            return n;
        }
        count++;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
}
