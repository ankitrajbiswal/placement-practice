import java.util.*;
public class subsequencesString {

    static List<String> al=new ArrayList<>();
    public static void main(String [] args){
        String s="ankit";
        String ans="";
        findsubsequences(s,ans);
        System.out.println(al);

    }

    private static void findsubsequences(String s,String ans){
        if(s.length()==0){
        al.add(ans);
        return;
    }
    findsubsequences(s.substring(1)/*nkit*/ ,ans+s.charAt(0) /* a */); //This will function recursively ---> Recursion
    findsubsequences(s.substring(1), ans); //this will function when it will hit Return statement ----> Backtracking

    }
    
}
