import java.util.*;

public class pallindrome {
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int temp=n,reversedNumber=0;
        while(temp>0){
            int lastDigit=temp%10;
            reversedNumber=reversedNumber*10+lastDigit;
            temp/=10;
        }
        if(reversedNumber==n){
            System.out.println("Yes its pallindrome");
        }
        else{
            System.out.println("No its not a pallindrome");
        }
        sc.close();
        }

        
    }
    

