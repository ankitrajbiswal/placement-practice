public class countBitsFlip {
    public static int countBitsFlip(int a, int b){
        
        // Your code here
         // Your logic here
       int c=a^b;
       int res=0;
       while(c>0){
           c=c&(c-1);
           res++;
       }
       return res;
    }
    
}
