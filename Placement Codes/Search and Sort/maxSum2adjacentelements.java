public class sticklerthief {
    public static void main(String [] args){
        int arr[]={5,5,10,100,10,5};
        int n=arr.length;
        findMaxSum(arr,n);
    }

    static void findMaxSum(int arr[], int n){
        int included=0, excluded=0;
        for(int i=0;i<n;i++){
            int temp=included;
            included=arr[i]+excluded;
            excluded=Math.max(temp,excluded);
        }
        System.out.println(Math.max(included,excluded));
    }
}
