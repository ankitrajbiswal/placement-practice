//GFG Write an efficient program to print all the duplicates and their counts in the input string 

public class duplictaesinInputString {
    static final int No_Of_Chars=256;
    public static void main(String [] args){
        String str="Ankit Raj Biswal";
        printDups(str);

    }
    static void printDups(String str){
        int count[]=new int [No_Of_Chars];
        fillcharcounts(str,count);
        for(int i=0;i<No_Of_Chars;i++){
            if(count[i]>1){
                System.out.println((char)(i)+", Count = "+ count[i]);
            }
        }
    }

    static void fillcharcounts(String str, int count[]){

        for(int i=0;i<str.length();i++){ //This loop is counting the occurence of characters
            count[str.charAt(i)]++;
        }
    }
    
}
