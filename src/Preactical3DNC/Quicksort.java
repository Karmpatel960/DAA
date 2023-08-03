package Preactical3DNC;

import java.util.Arrays;

public class Quicksort  {
    static int intr = 0 ;
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        intr++;
        sort(arr,0,arr.length-1);
        intr++;
        System.out.println(Arrays.toString(arr));
        System.out.println("The total Iteration it has is : " + intr);

    }
    static void sort(int[] nums,int low,int high){
        intr++;
        if(low>=high){
            intr++;
            return;
        }
        intr++;
        int s =low;
        intr++;
        int e = high;
        intr++;
        int m = s+(e-s)/2;
        intr++;
        int pivot = nums[m];
        intr++;
        while (s<=e) {
            intr++;
            while (nums[s] < pivot) {
                intr++;
                s++;
            }
            while (nums[e] > pivot) {
                intr++;
                e--;
            }
            if (s <= e) {
                intr++;
                int temp = nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                intr++;
                s++;
                e--;

            }
        }
    }
}
