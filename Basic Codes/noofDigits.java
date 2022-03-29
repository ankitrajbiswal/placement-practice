import java.util.*;
public class noofDigits {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int numberOfDigits=(int)Math.log10(n)+1;
        System.out.println("Number of digits is "+numberOfDigits);
        sc.close();
    }
    
}
