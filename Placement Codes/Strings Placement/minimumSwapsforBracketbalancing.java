public class minimumSwapsforBracketbalancing {
    public static void main (String [] args){
        String s="[][][";
        System.out.println(swapcount(s));
    }
    static int swapcount(String s){

        char [] chars=s.toCharArray();
        int countLeft=0,countRight=0;
        int swap=0, imbalance=0;

        for(int i=0;i<chars.length;i++){
            if(chars[i]=='['){
                countLeft++;
                if(imbalance>0){
                    swap+=imbalance;
                    imbalance--;
                }
            }else if(chars[i]==']'){
                countRight++;
                imbalance=(countRight-countLeft);
            }
        }
        return swap;

    }
    
}
