import java.util.*;
public class merge2arrays {
    public static void main(String [] args){
        int arr1[]={2,9,7,7,4,12,9};
        int arr2[]={4,7,9,3,13,4};
        int n =arr1.length;
        int m=arr2.length;
        merge(arr1,arr2,n,m);
    }

    public static void merge (int[] arr1,int[] arr2,int n,int m ){
        int ans[]=new int [n+m];
        for(int i=0;i<n;i++){
            ans[i]=arr1[i];
        }
        for(int i=n,j=0;i<m+n;i++){
            ans[i]=arr2[j++];
        }
        Arrays.sort(ans);
        for(int i=0;i<n;i++){
            arr1[i]=ans[i];
        }
       // int j;
        for(int i=0;j=n;i<m;i++){
            arr2[i]=ans[j++];
        }
    }
    
}
