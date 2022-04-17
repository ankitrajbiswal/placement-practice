import java.util.*;
public class findPairGivenDiffence {
    public static void main(String [] args){
        int arr[]={5,20,3,2,5,80};
        int size=arr.length;
        int n=78; //diffrence

        findPair(arr,n,size);
    }
    
    static boolean findPair(int arr[],int n, int size){
        Arrays.sort(arr);
        int low=0, high=1;
        while(low < size-1 && high<size){
            if(low!=high){
            if(arr[high] - arr[low] == n) return true;
            else if(arr[high] - arr[low] < n) high++;
            else low++;
            }else{
                high++;
            }
        }
        return false;
    }
}
