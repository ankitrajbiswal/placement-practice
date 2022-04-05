public class pallindromeString {
    class Solution {
        int isPalindrome(String S) {
            
            int i=0,j=S.length()-1;
            while(i<j){
                 if (S.charAt(i) != S.charAt(j))
                    return 0;
     
                // Increment first pointer and
                // decrement the other
                i++;
                j--;
            }
     
            // Given string is a palindrome
            return 1;
            }
        }
    
    
}
