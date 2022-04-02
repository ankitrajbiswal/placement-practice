//JAVA GFG QUESTION
//Given an array of N positive integers, print k largest elements from the array. 

//Driver Code Start
import java.util.*;
import java.io.*;

class Main{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    int t=sc.nextInt();// Number of test cases
    while(t>0)
    {
      int n=sc.nextInt();
      int k=sc.nextInt();
      
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      Solution ob=new Solution();
      ArrayList<Integer> list=ob.klargest(arr,n,k);
      for(int i=0;i<list.size();i++)
        System.out.print(list.get(i)+"");
      System.out.println();
      t--;
    }
  }
}
//Driver Code End

//User Function Template
class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
         for(int i=0;i<n;i++){
            if(i<k){
                pq.add(arr[i]);
            } else {
                if(pq.peek()<arr[i]){
                    pq.poll();
                    pq.add(arr[i]);
                }
                
            }
        }

        ArrayList <Integer> ans=new ArrayList<>(pq);
        Collections.sort(ans,Collections.reverseOrder());
        // for(int x:ans){
        //     System.out.print(x+" ");
        // }
        // System.out.println();

  return ans;
    }
}

        
