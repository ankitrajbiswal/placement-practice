import java.util.*;
public class reverseArray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Now we will reverse the array");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        sc.close();
    }
    
}
