
class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
       if(n == 0){
           return 0;
       }
       int x = largestpowof2(n);
       int bitsTill2powX = x * (1<<(x-1));
       int msbAfter2powX = n - (1<<x) + 1;
       int rest = n - (1 << x);
       int ans = bitsTill2powX+msbAfter2powX+countSetBits(rest);
       return ans;
   }
   public static int largestpowof2(int n){
       int x = 0;
       while((1<<x)<=n){
           x++;
       }
       return x - 1;
    }
}
