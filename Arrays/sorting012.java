//GFG Sorting 0,1,2 without using any sorting algo


public class sorting012 {
    public static void main(String [] args) {
        int arr[]={0,2,1,2,0};
        int n=arr.length;
        sort(arr,n);
        
    }
    
    static void sort(int arr[],int n){
        int i,cnt1=0,cnt2=0,cnt0=0;

        //Count the numbers of 0s,1s and 2s in the array
        for(i=0;i<n;i++){
            switch(arr[i]){
                case 0:
                cnt0++;
                break;
                case 1:
                cnt1++;
                break;
                case 2:
                cnt2++;
                break;
            }
        }
         i=0; //Updating the array


         //Storing the values of 0, 1,2 in sorted way
         while(cnt0>0){
             arr[i++]=0;
             cnt0--;
         }

         while(cnt1>0){
             arr[i++]=1;
             cnt1--;
         }
         while(cnt2>0){
             arr[i++]=2;
             cnt2--;
         }

         print(arr,n);
    }
    static void print(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
