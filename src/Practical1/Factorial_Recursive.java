package Practical1;

import java.util.Scanner;

public class Factorial_Recursive {
    static int intr = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inp = in.nextInt();
        System.out.println("The Factorial Answer with Recusive is "+factorialrecursive(inp));
        System.out.println("The count after Recursive call is "+intr);
    }

    private static int factorialrecursive(int n) {
        intr++;
        if(n == 0 || n == 1){
            intr++;
            return 1;

        }else{
            intr++;
            return(n * factorialrecursive(n-1));
        }
    }
}
