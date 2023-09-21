package Preactical3DNC;

public class Quicksort  {
    static int intr = 0 ;
    public static void main(String[] args) {
        int[] inputSizes = {5, 10, 20, 30, 40};

        for (int size : inputSizes) {
            int[] arrWorst = generateWorstCaseArray(size);
            int[] arrBest = generateBestCaseArray(size);
            int[] arrAvg = generateArray(size);

            System.out.println("Array size: " + size);

            intr = 0;
            sort(arrBest, 0, arrBest.length - 1);
            System.out.println("Quick Sort (Best Case) Iterations: " + intr);

            intr = 0;
            sort(arrAvg, 0, arrAvg.length - 1);
            System.out.println("Quick Sort (Average Case) Iterations: " + intr);

            intr = 0;
            sort(arrWorst, 0, arrWorst.length - 1);
            System.out.println("Quick Sort (Worst Case) Iterations: " + intr);

            System.out.println();
        }

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
