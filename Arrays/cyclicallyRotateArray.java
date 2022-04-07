import java.util.*;
public class cyclicallyRotateArray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Current elements in array are");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        
        int x=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;

        System.out.println(" Rotated elements in array are");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }

    }
    
}
