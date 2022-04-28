import java.util.Arrays;
import java.util.HashMap;

public class minimumSwapstosort {
    public static void main(String [] args){
        int a[]={1,5,4,3,2};
        minSwaps(a);
    }

    static void minSwaps(int a []){
        int length=a.length;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<length;i++){
            map.put(a[i],i);
        }

        Arrays.sort(a);

        boolean visited[]=new boolean[length]; //to keep a track of visited elements initialize with false
        Arrays.fill(visited, false);

        int ans=0;
        for(int i=0;i<length;i++){
            //if already swapped or in a correct position then this
            if(visited[i]||map.get(a[i])==i)
            continue;

            int j=i, cycle_size=0;
            while(!visited[j]){
                visited[j]=true;

                //moving to next node
                j=map.get(a[j]);
                cycle_size++;
            }

            if(cycle_size>0){
                ans+=(cycle_size-1);
            }
        }
        System.out.println(ans);
    }
    
}
