class Solution {
    static int findPosition(int N) {
        // code here
        if(N==0)
       return -1;
       if((int)Math.ceil(Math.log(N)/Math.log(2))!=(int)Math.floor(Math.log(N)/Math.log(2)))
       return -1;
       else
       return (int)(Math.log(N)/Math.log(2))+1;
    }
};
