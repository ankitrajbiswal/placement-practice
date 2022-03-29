import java.util.*;
public class kthsmallestelement {
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of K");
        int k=sc.nextInt();

        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        sc.close();
        
    }
    
}
