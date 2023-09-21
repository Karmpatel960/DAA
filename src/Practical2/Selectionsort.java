package Practical2;

import java.util.Arrays;

public class Selectionsort  {
    static int intr = 0 ;
    public static void main(String[] args) {
        int[] inputSizes = {5, 10, 20, 30, 40};

        for (int size : inputSizes) {
            int[] arr = generateArray(size);
            int[] arrCopy = Arrays.copyOf(arr, arr.length);

            System.out.println("Array size: " + size);

            intr = 0;
            selection(arr);
            System.out.println("Selection Sort (Worst Case) Iterations: " + intr);

            intr = 0;
            selection(arrCopy);
            System.out.println("Selection Sort (Best Case) Iterations: " + intr);

            intr = 0;
            selection(arr);
            System.out.println("Selection Sort (Average Case) Iterations: " + intr);

            System.out.println();
        }


    }



    static void selection(int[] arr){
        intr++;
        for (int i = 0; i < arr.length; i++) {
            intr++;
            int last = arr.length - i -1;
            intr++;
            int maxindex = getMaxIndex(arr,0,last);
            intr++;
            swap(arr,maxindex,last);
            intr++;
        }
    }

    static void swap(int[] arr,int f,int s){
        intr++;
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
        intr++;
    }
    private static int getMaxIndex(int[] arr, int start, int end) {
        intr++;
        int max = start;
        intr++;
        for (int i = start; i <= end; i++) {
            intr++;
            if(arr[max] <arr[i]){
                intr++;
                max = i;
            }
            intr++;
        }
        intr++;
        return max;
    }
        static int[] generateArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = i + 1;
            }
            return arr;
        }
}
