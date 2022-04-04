import java.util.*;
public class ksum_subarraySet {
    public static void main(String [] args){
        int arr[]={2,1,-4,-3,2};
        boolean found=false;
        int k=6;
        Set<Integer> ksum=new HashSet<Integer>();
        int sum=0;
        for(int element:arr){
            ksum.add(sum);
            sum+=element;
            if(ksum.contains(sum-k)){
                found=true;
                break;
            }
        }
            System.out.println(found);
        

    }
    
}
