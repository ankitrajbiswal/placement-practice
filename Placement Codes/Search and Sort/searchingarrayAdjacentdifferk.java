public class searchingarrayAdjacentdifferk {
    public static void main(String [] args){
        int arr[]={2,4,5,7,7,6};
        int x=6;
        int k=2;
        int n=arr.length;
        search(arr, n, x, k);

    }

    static int search(int arr[],int n,int x,int k){
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                return i;
                //break;
            }
        }
        return -1;
    }
    
}
