import java.util.*;
public class anagramoptimized {
    public static void main(String [] args){
        String a="ACT";
        String b="CAT";
        a.toLowerCase();
        b.toLowerCase();
        char al[]=a.toLowerCase().toCharArray();
        char bl[]=b.toLowerCase().toCharArray();
        Arrays.sort(al);
        // for(int i=0;i<al.length;i++){
        //     System.out.println(al[i]);
        // }
        Arrays.sort(bl);
        // for(int i=0;i<bl.length;i++){
        //     System.out.println(bl[i]);
        // }
        if(Arrays.equals(al, bl)){
            System.out.println("Yes");
        
        }
        else
        System.out.println("No");
 
    }
    
}
