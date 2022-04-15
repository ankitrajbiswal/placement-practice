class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
     int i,j,count;
      int max=arr[0];
      for(i=0;i<n;i++){
          count=0;
          for(j=i;j<n;j++){
              count=count+arr[j];
              if(count>=max){
                  max=count;
              }
          }
      }
    return max;   
        
    }
    
}
