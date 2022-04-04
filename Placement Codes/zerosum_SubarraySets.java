import java.util.*;
public class zerosum_SubarraySets {
    public static void main(String [] args){
        int a[]={ 2,3,-3,1,4};
        boolean found=false;
        Set<Integer> subarray=new HashSet<>();
        int sum=0;
        for(int element : a){
            subarray.add(sum);
            sum+=element;
            if(subarray.contains(sum)){
                found=true;
                break;
            }
        }
        System.out.println("Found "+ found);

    }
    
}
