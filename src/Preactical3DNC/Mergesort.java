package Preactical3DNC;

import java.util.Arrays;
import java.util.Scanner;

public class Mergesort {
    static int intr = 0 ;
    public static void main(String[] args) {
        intr++;
        Scanner in = new Scanner(System.in);
        intr++;
        int[] arr = {5,6,3,2,1};
        intr++;
        arr =  merges(arr);
        intr++;
        System.out.println(Arrays.toString(arr));
        System.out.println("The total Iteration it has is : " + intr);

    }
    static int[] merges (int[] arr){
        intr++;
        if(arr.length ==1 ){
            intr++;
            return arr;
        }
        intr++;
        int m= arr.length /2;

        intr++;
        int[] left = merges(Arrays.copyOfRange(arr,0,m));
        intr++;
        int[] right = merges(Arrays.copyOfRange(arr, m,arr.length));
        intr++;

        return merge(left,right);

    }

    private static int[] merge(int[] first, int[] second) {
        intr++;
        int[] mix = new int[first.length + second.length];
        intr++;

        int i = 0;
        int j = 0;
        int k = 0;
        intr++;
        while (i < first.length && j < second.length) {
            intr++;
            if (first[i] < second[j]) {
                intr++;
                mix[k] = first[i];
                intr++;
                i++;
            } else {
                intr++;
                mix[k] = second[j];
                intr++;
                j++;
            }
            k++;
        }

        while (i < first.length) {
            intr++;
            mix[k] = first[i];
            intr++;
            i++;
            k++;
        }

        while (j < second.length) {
            intr++;
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }


}
