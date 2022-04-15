class Solution {
    static int findPosition(int N) {
        // code here
         if((N&(N-1))!=0)return -1;
      int res=1;
      
      for(int i=N;i>=0;i/=2){
          if(i%2==0)res++;
          else break;
      }
      return res;
    }
};
