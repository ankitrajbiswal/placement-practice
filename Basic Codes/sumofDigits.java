import java.util.*;
public class sumofDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number for sum of digit");
        int n=sc.nextInt();
        int temp=n,sum=0;
        while(temp!=0){
            sum+=temp%10;
            temp/=10;
        }
        System.out.println("Sum of digits is "+sum);
        sc.close();

    }
    
}
