public class printAllPermutations {
    public static void main(String args[]){
        String str="ankit";
        String ans="";
        printPermu(str,ans);
    }

    static void printPermu(String str, String ans){
        // If the string is empty
        if(str.length()==0){
            System.out.println(ans+ " ");
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i); //ith character of string
            String ros=str.substring(0, i)+str.substring(i+1); //Rest of the string except i

            printPermu(ros, ans+ch); //recursive call

        }
    }
    
}
