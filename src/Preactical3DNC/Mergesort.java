package Preactical3DNC;

import java.util.Arrays;
import java.util.Scanner;

public class Mergesort {
    static int intr = 0 ;
    public static void main(String[] args) {
        int[] inputSizes = {10, 20, 40, 80, 120};

        for (int size : inputSizes) {
            int[] arrWorst = generateWorstCaseArray(size);
            int[] arrBest = generateBestCaseArray(size);
            int[] arrAvg = generateArray(size);

            System.out.println("Array size: " + size);

            intr = 0;
            int[] resultBest = merges(arrBest);
            System.out.println("Merge Sort (Best Case) Iterations: " + intr);

            intr = 0;
            int[] resultAvg = merges(arrAvg);
            System.out.println("Merge Sort (Average Case) Iterations: " + intr);

            intr = 0;
            int[] resultWorst = merges(arrWorst);
            System.out.println("Merge Sort (Worst Case) Iterations: " + intr);


            System.out.println();
        }

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

    static int[] generateWorstCaseArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - i;
        }
        return arr;
    }

    static int[] generateBestCaseArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
