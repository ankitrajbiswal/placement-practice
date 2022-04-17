import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class findAllfoursumNumbers {
    public static void main(String [] args){
        int arr[]={0,0,2,1,1};
        int N=arr.length;
        int k=3;
        fourSum(arr,N,k);
    }

    static ArrayList<ArrayList<Integer>> fourSum(int arr[], int N,int k){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        HashSet<ArrayList<Integer>> subResult = new HashSet<ArrayList<Integer>>();

        ArrayList<Integer> sortList;
        for(int i=0; i<N-3; i++) {
            for(int j=i+1; j<N-2; j++) {
             for(int p=j+1; p<N-1; p++) {
              for(int r=p+1; r<N; r++) {
               
               if(arr[i] + arr[j] + arr[p] + arr[r] == k) {
                sortList = new ArrayList<Integer>();
                
                sortList.add(arr[i]);
                sortList.add(arr[j]);
                sortList.add(arr[p]);
                sortList.add(arr[r]);
                
               // Collections.sort(sortList);
                
                int size = subResult.size();
                
                subResult.add(sortList);
                
                if(size != subResult.size()) {
                 resultList.add(sortList);
                }
               }
              }
             }
            }
           }
           
           return resultList;
    }
}
