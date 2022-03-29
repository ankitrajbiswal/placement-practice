import java.util.*;
public class ap {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            sum=sum+i;
            sc.close();
        }
        System.out.println(sum);
    }
    
}
