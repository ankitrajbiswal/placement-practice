import java.util.*;
public class subsetArray {
    public static void main (String [] args){
        int arr1[]={11, 1, 13, 21, 3, 7};
        int arr2[]={11, 3, 7, 1};
        int n=arr1.length;
        int m=arr2.length;

        Arraysubset(arr1,arr2,n,m);
    }

    static boolean Arraysubset(int arr1[],int arr2[], int n,int m){
        HashSet <Integer> hset=new HashSet<>();

        // Storing all values of arr1 on hset
        for(int i=0;i<m;i++){
            if(!hset.contains(arr1[i]))
            hset.add(arr1[i]);
        }

        for(int i=0;i<n;i++){
            if(!hset.contains(arr2[i]));
            return false;
        }
        return true;
       
    }
    
}
