//Given an array of positive and negative numbers, find if there is a subarray (of size at-least one) with 0 sum.
//Brute Force Approch
import java.util.*;
public class zeroSum_subarray {
    public static void main (String [] args){
        int a[]={2,1,-3,4,2};
        boolean found=false;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;i<a.length;j++){
                sum+=a[j];
                if(sum==0){
                    found=true;
                    break;
                }

            }
            if(found) break;
        }
        System.out.println("Found " +found);

    }
    
}
