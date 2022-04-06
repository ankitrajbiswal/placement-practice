import java.util.Arrays;

public class shuffledSubstring {
    public static void main(String [] args){
        String str1="AnkitRajBiswal";
        String str2="RnkAajtilaBwisnkiAt";

        boolean a=isshuffledSubstring(str1,str2);

        if(a)
        System.out.println("Yes");
        else
        System.out.println("No");
    }

    static boolean isshuffledSubstring(String str1, String str2){
        int n=str1.length();
        int m=str2.length();

        if(n>m){
            return false;
        }
        else{
            str1=sort(str1);

            //Traverse String str2
            for(int i=0;i<m;i++){
                if(i+n-1>m)
                return false;
                String str="";


                for(int j=0;j<n;j++)
                str += str2.charAt(i + j);

                str=sort(str);


                if(str.equals(str1))
                return true;
            }
        }
        return false;

    }

    static String sort(String inputString) {
        char tempArray[]=inputString.toCharArray();
        Arrays.sort(tempArray);
        return String.valueOf(tempArray);
    }
    
}
