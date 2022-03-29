//https://www.geeksforgeeks.org/find-number-of-triangles-possible/

import java.util.*;

public class countnoofTriangles {
    public static void main(String[]args){
        int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
        int size = arr.length;
     
        System.out.println( "Total number of triangles possible is "+
        findNumberOfTriangles(arr, size));
    }
    static int findNumberOfTriangles(int arr[],int size){
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]>arr[k]){
                        count++;
                    }
                }
                }
            }

        return count;
        
    }
    
}
