package Practical2;

import java.util.Arrays;

public class Insertionsort {
    static int count = 0 ;
    public static void main(String[] args) {
        count++;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
        count++;
        insertion(arr);
        count++;
        System.out.println(Arrays.toString(arr));
        System.out.println("Total count is "+count);

    }


    static void swap(int[] arr,int f,int s){
        count++;
        int temp = arr[f];
        count++;
        arr[f] = arr[s];
        count++;
        arr[s] = temp;
    }
    static void insertion(int[] arr){
        count++;
        for (int i = 0; i < arr.length - 1; i++) {
            count++;
            for (int j = i+1; j >0; j--) {
                count++;
                if(arr[j]<arr[j-1]){
                    count++;
                    swap(arr,j,j-1);
                }
                else{
                    count++;
                    break;
                }
            }
        }
    }
}
