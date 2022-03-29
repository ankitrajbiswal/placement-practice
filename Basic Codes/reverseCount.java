import java.util.*;
public class reverseCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for reverse count");
        int n=sc.nextInt();
        for(int i=n;i>=0;i--){
            System.out.println(i);
        }
        sc.close();
    }
    
}
