import java.util.*;
public class nonrepeatingNumbers {
    public int[] singleNumber(int[] nums)
    {
        // Code here
    int i,val=nums[0],len=nums.length;
    int ans[]=new int [2];
    for(i=1;i<len;i++)
    val=val^nums[i];
    
    int mask=val&~(val-1);
   int A=val,B;
    for(i=0;i<len;i++){
        if((nums[i]&mask)!=0)
        A=A^nums[i];
    }
    B=A^val;
    ans[0]=A;
    ans[1]=B;
    Arrays.sort(ans);
    return ans;
    }
    
}
