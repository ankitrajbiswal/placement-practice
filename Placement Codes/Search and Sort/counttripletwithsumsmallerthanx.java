import java.util.*;
public class counttripletwithsumsmallerthanx{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        long arr[]=new long [n];

        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Sum");
        int sum=sc.nextInt();

        long countTriplets(arr,n,sum);
    }
  
 static long countTriplets(long arr[], int n,int sum)
    {
Arrays.sort(arr); 
        
        int count=0;
        for(int i=0;i<arr.length;i++){
            
            int start=i+1;
            int end=n-1;
            
            
            while(start<end){
                
                if(arr[i]+arr[start]+arr[end]>=sum){
                        end--;
                    
                }
                else{
                    count+=end-start;
                    start++;
                }
                
            }
            
        }

         return count;
    }
