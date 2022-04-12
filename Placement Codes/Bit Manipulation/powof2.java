public class powof2 {
    public static void main(String [] args){

    }
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        long i=2;
        if(n==1 || n==2)
        return true;
        
        while(i<n)
        i*=2;
        
        return i==n ? true : false;
        
    }
    
}
