package Practical2;

import java.util.Arrays;

public class Bubblesort {
    static int intr = 0 ;
    public static void main(String[] args) {
        int[] arr = {10, 60, 40, 50, 30, 20};
        intr++;
        bubblesort(arr);
        intr++;
        System.out.println(Arrays.toString(arr));
        System.out.println("The total Iteration it has is : " + intr);
    }


    public static void bubblesort(int[] arr) {
        intr++;
        boolean swap;
        intr++;
        int count = 0;
        intr++;
        for (int i = 0; i < arr.length; i++) {
            intr++;
            swap = false;
            intr++;
            for (int j = 1; j < arr.length - i; j++) {
                intr++;
                if(arr[j]<arr[j-1]) {
                    intr++;
                    int t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;
                    intr++;
                    swap=true;
                    count++;
                    intr++;
                }
                intr++;
            }
            if(!swap){
                intr++;
                break;
            }
            intr++;
        }
        intr++;
        System.out.println(count);
    }
}
