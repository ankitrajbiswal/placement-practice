import java.util.Arrays;

public class medianofSortedArray {
    public static void main(String [] args){
        int arr[]={1,3,5,6,4,8,9,3,6,7};
        int n=arr.length;
        median(arr,n);
    }
     
    static void median (int arr[], int n){

        Arrays.sort(arr);
        if(n % 2 == 0)
        {
            int avg = (arr[n/2] + arr[n/2 -1])/2;
            System.out.println(avg);
        }
        else
          System.out.println(arr[n/2]);
    }
    
}
