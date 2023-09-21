package Practical2;

import java.util.Arrays;

public class Bubblesort {
    static int intr = 0 ;
    public static void main(String[] args) {

        int[] inputSizes = {5, 10, 20, 30, 40};

        for (int size : inputSizes) {
            int[] arrWorst = generateWorstCaseArray(size);
            int[] arrBest = generateBestCaseArray(size);
            int[] arrAvg = generateArray(size);

            System.out.println("Array size: " + size);

            intr = 0;
            bubblesort(arrWorst);
            System.out.println("Bubble Sort (Worst Case) Iterations: " + intr);

            intr = 0;
            bubblesort(arrBest);
            System.out.println("Bubble Sort (Best Case) Iterations: " + intr);

            intr = 0;
            bubblesort(arrAvg);
            System.out.println("Bubble Sort (Average Case) Iterations: " + intr);

            System.out.println();
        }
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
