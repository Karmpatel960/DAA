package Practical1;

public class Binary_search {

    static int count = 0;
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25,30,35,40,50,60,70,80,90,100,110,120};
        int target = 77;
        count++;
        int ans = Binary1(arr,target);
        count++;
        System.out.println(ans);
        System.out.println("The total count of it is " + count);
    }

    static int Binary1(int[] arr, int target){
        count++;
        int s=0;
        count++;
        int e = arr.length -1;

        count++;
        while(s <= e){
            count++;
            int m = s + (e-s)/2;

            count++;
            if(target <  arr[m]){
                count++;
                e = m-1;
            }else if(target > arr[m]){
                count++;
                s = m+1;
            }
            else{
                count++;
                return m;
            }
        }
        count++;
        return -1;
    }
}
