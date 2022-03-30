/* Algorithm: 

1.Sort the array in ascending order.
2.Traverse the array from start to end.
3.For every index i, create two variables l = i + 1 and r = n – 1
4.Run a loop until l is less than r if the sum of array[i], array[l] and array[r] is equal to zero
  then print the triplet and break the loop
5.If the sum is less than zero then increment the value of l, by increasing the value of l
  the sum will increase as the array is sorted, so array[l+1] > array [l]
6. If the sum is greater than zero then decrement the value of r, by decreasing the value of r
   the sum will decrease as the array is sorted, so array[r-1] < array [r].
*/
import java.util.*;

public class tripletwithzeroSum {
    public static void main(String [] args){
        int arr[]={0,-1,2,-3,1};
        int n=arr.length;
        findTriplets(arr,n);
    }

    static void findTriplets(int arr[], int n){
        boolean found=false;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            int l=i+1;
            int r=n-1;
            int x=arr[i];
            while(l<r){
                if(x+arr[l]+arr[r]==0){
                    System.out.println(x+ " ");
                    System.out.println(arr[l]+ " ");
                    System.out.println(arr[r]+ " ");
                    l++;
                    r--;
                    found=true;
                 }
                 else if (x+arr[l]+arr[r]<0)
                 l++;
                 else 
                 r--;
            }
        }
        if (found == false)
            System.out.println(" No Triplet Found");

    }
    
}
