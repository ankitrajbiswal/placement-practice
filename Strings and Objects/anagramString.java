//import java.util.*;
public class anagramString {
    public static void main(String [] args){
        String a="act";
        String b="cat";
        boolean isAnagram=false;
        boolean isVisited[]=new boolean [b.length()]; //to keep a check that which which characters are visited
        if(a.length()==b.length()){
            for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            isAnagram=false;
            for(int j=0;j<b.length();j++){
                if(b.charAt(j)==c && !isVisited[j]){
                    isVisited[j]=true;
                    isAnagram=true;
                    break;
                }
            }
            if(!isAnagram){
                break;
            }
            }
        }
        System.out.println(isAnagram);
    }
   
    
}
