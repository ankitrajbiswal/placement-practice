public class rotationString {
    public static void main(String [] args){
        String str1="ARBMR";
        String str2="RARBM";

        if (areRotations(str1, str2))
        System.out.println("Strings are rotations of each other");
    else
        System.out.printf("Strings are not rotations of each other");
    }

    static boolean areRotations(String str1,String str2){
        return (str1.length()==str2.length()) && ((str1+str1).indexOf(str2)!=-1);

    }
    
}
