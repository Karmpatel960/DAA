package Practical2;

import java.util.Arrays;

public class Selectionsort  {
    static int intr = 0 ;
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        intr++;
        selection(arr);
        intr++;
        System.out.println(Arrays.toString(arr));
        System.out.println("The total Iteration it has is : " + intr);
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
}
