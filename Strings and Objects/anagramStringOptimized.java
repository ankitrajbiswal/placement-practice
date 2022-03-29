//import java.util.*;
public class anagramStringOptimized {
    public static void main(String [] args){
        String a="cat";
        String b="act";
        boolean isAnagram=true;
        int al[]=new int[256];
        int bl[]=new int[256];
        for(char c:a.toCharArray()){
            int index=(int) c;
            al[index]++;
        }
        for(char c:b.toCharArray()){
            int index=(int) c;
            bl[index]--;
        }
        for(int i=0;i<256;i++){
            if(al[i]!=0){
                isAnagram=false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("The Strings are Anagram");
        }
        else{
        System.out.println("The Strings are not Anagram");
        }
    }
    
}
