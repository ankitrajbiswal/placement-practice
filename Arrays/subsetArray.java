import java.util.*;
public class subsetArray {
    public static void main (String [] args){
        long arr1[]={11, 1, 13, 21, 3, 7};
        long arr2[]={11, 3, 7, 1};
        long n=arr1.length;
        long m=arr2.length;

        Arraysubset(arr1,arr2,n,m);
    }

    static String Arraysubset(long arr1[],long arr2[], long n,Long m){
        HashSet <Long> hs=new HashSet<>();
        long temp =0;
        
        
        for(int i =0 ; i<n ; i++)
        hs.add(arr1[i]);

        for(int i =0 ; i<m;i++)
        if(hs.contains(arr2[i]))
        temp++;
            
        if(temp == arr2.length)
        return "Yes";
    
        return "No";

       
    }
    
}
