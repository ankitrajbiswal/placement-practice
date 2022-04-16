import java.util.HashMap;

public class majorityElement {
    public static void main(String [] args) {
        int n=5;
        int a[]={3,1,3,3,2};

        majorityElementfind(a,n);
        
    }
    
    static int majorityElementfind(int a[], int n){
        HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(a[i])){
                hm.put(a[i],1);
            }
            else{
                int value=hm.get(a[i]);
                hm.replace(a[i], value, value+1);
            }
        }
        int max=0;
        int major=-1;
        for(int i: hm.keySet()){
            if(hm.get(i)>max && hm.get(i)>(n/2)){
                max=hm.get(i);
                major=i;
            }
        }
        return major;

    }
}
