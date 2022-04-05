//Leet Code Q-38
/*The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of groups so that each group is a contiguous section all of the
 same character. Then for each group, say the number of characters, then say the character. To convert the saying into a digit string,
 replace the counts with a number and concatenate every saying. */

public class countAndSay {
    class Solution {
        public String countAndSay(int n) {
            String val="1";
            for(int i=0;i<n-1;i++)
            {
                char c=val.charAt(0);
                StringBuilder s= new StringBuilder();
                int count=1;
                
                for(int j=1;j<val.length();j++)
                {
                    if(c!=val.charAt(j)){
                        s.append(count);
                        s.append(c);
                        count=0;
                        c=val.charAt(j);
                    }
                    count++;
                }
                s.append(count);
                s.append(c);
                val=s.toString();
            }
            return val;
        }
    }
}
