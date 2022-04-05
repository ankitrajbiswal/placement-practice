//Write an efficient program to count the number of 1s in the binary representation of an integer.


import java.util.*;
public class countSetBits {
    public static void main(String [] args){
        int n=5; //Binary is 101
        int count = 0;
        while (n > 0) {
            count += n & 1; //(101 & 1=001)
            n >>= 1; //(101>>=1  ---> 010)
        }
        System.out.println(count);
    }
 

     
}
