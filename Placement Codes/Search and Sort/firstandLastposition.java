import java.util.*;
public class firstandLastposition {
    public static void main(String [] args){
        long arr[]={2,4,6,2,9,5,28,57,3,2,9,23,87};
        int n=arr.length;
        int x=2;
        Arrays.sort(arr);
        find(arr,n,x);

    }

    static ArrayList<Long> find(long arr[], int n, int x){
        ArrayList<Long> res=new ArrayList<>();
        long first=-1;
        long last=-1;

        for(int i=0;i<n;i++){
            if(arr[i]==x){
                arr[i]=first;
                break;
            }
        }

        for(int i=n-1;i>=0;i--){
            if(arr[i]==x){
                arr[i]=last;
                break;
            }
        }

        res.add(first);
        res.add(last);
        return res;
    }
    
}
