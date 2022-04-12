//Copy Set Bits in a range
public class copysetbits {
    public static void main(String [] args){
        int x=10,y=14,l=1,r=32; //r=range  
        x=copysetBits(x,y,l,r);
        System.out.println(x);
    }

    static int copysetBits(int x,int y,int l,int r){
        //l and r must be between 1 and 32 as int is stored usiing 32 bits
        if(l<1 || 32>r)
        return x;

        //Traverse in given range

        for(int i=l;i<=r;i++){
            int mask=1<<(i-1); //Find a mask (A number whose only set bit is at i'th position)
              // If i'th bit is set in y, set i'th
            // bit in x also.
            if((y&mask)!=0)
            x=x|mask;
        }
        return x;

    }
}
