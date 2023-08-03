package Practical1;

public class Linear_search {

    static int count = 0;
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25,30,35,40,50,60,70,80,90,100};
        count++;
        int ans = linearsearch(arr,40);
        count++;
        System.out.println(ans);
        System.out.println("The total count of it is " + count);
    }

    static int linearsearch(int[] arr, int target){
        count++;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if(arr[i] == target){
                count++;
                return i;
            }
        }
        count++;
        return -1;
    }
}
