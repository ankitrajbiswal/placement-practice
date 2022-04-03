/* You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array
 to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
Return the max sliding window.
 */

import java.util.*;
public class slidingWindowmax {
    public static void main(String [] args){
        solution solution=new solution();
        int a[]={4,3,1,2,5,3,4,7,1,9,4,6,3};
        int k=3;//size of the window
        int ans[]=maximumSlidingWindow(a,k);
        for(int x:ans){
            System.out.println(x+" ");
        }
    }
    private static int[] maximumSlidingWindow(int[] a, int k) {
        return null;
    }
 
    class Solution{
        public int[] maximumSlidingWindow(int a[], int k){
            int n=a.length;
            if(n<=1) return a;

            Deque<Integer> dq=new LinkedList<>();
            int ans[]=new int[n-k+1];
            int i=0;

            for(;i<k;i++){
                while(!dq.isEmpty() && a[dq.peekLast()]<=a[i])
                dq.removeLast();
            }
            dq.addLast(i);
        
        for(;i<n;i++){
            ans[i-k]=a[dq.peekFirst()];
            while(!dq.isEmpty()&&dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty()&&a[dq.peekLast()]<=a[i]){
                dq.removeLast();
            }
            dq.addLast(i);

        }
        ans[i-k]=a[dq.peekFirst()];
        return ans;



    }
}
}

    

