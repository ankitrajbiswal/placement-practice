public class findrepatingandMissingNumber {
    public static void main(String [] args){
        int n=3;
        int arr[]={1,3,3};
        findtwoElement(arr,n);
    }

   static int[] findtwoElement(int arr[],int n){
       int [] ans=new int[n];
       for(int i=0;i<n;i++){
           int curr=Math.abs(arr[i]);
           if(arr[curr-1]<0)
           ans[0]=curr;
           else
           arr[curr-1]=-arr[curr-1];
       }

       for(int i=0;i<n;i++)
           if(arr[i]>0)
           ans[1]=i+1;

           return ans;
       
        

    }

    
}
