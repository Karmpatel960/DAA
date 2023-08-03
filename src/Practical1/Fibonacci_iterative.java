package Practical1;

import java.util.Scanner;

public class Fibonacci_iterative {
    static int count = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inp = in.nextInt();
        count++;
        System.out.println("The Answer for fibonacci is "+Fibonacciiterative(inp));
        System.out.println("Total Count is "+count);
    }

    public static int Fibonacciiterative(int n) {
        count++;
        if(n <= 1) {
            count++;
            return n;
        }
        count++;
        int fib = 1;
        count++;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            count++;
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
            count++;
        }
        count++;
        return fib;
    }
}
