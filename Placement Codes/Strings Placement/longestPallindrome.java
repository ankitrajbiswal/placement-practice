public class longestPallindrome {
    public static void main(String[] args){
        String S = "abbaccd";
        System.out.println(findLongestPalindrome(S));
    }
    static String findLongestPalindrome(String S){
        // code here
         String res = "";
       
    for(int i=0; i<S.length(); i++){
        for(int j=i+1; j<=S.length(); j++) {
          
        
        if (isp(S.substring(i,j))) { if (res.length()<(S.substring(i,j)).length())
        res= S.substring(i,j);} 
    } 
    } return res;  
} 
   static boolean isp(String a){
    int start=0, end = a.length()-1;
       while(start<end){
           if(a.charAt(end)!=a.charAt(start)) return false;
           end--; start++;
       }
       return true;
        
    }
    
}
