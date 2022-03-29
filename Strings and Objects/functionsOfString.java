//import java.util.*;
public class functionsOfString {
    public static void main(String[] args){
        String name="Ankit Raj Biswal";
        String name2="Ankit";
        //All string functions create a new string in memory
        System.out.println(name.charAt(4));
        System.out.println(name.length());
        System.out.println(name.substring(6));
        System.out.println(name.substring(6, 9));
        System.out.println(name.contains("Minal"));
        System.out.println(name.equals(name2));
        System.out.println(name.isEmpty());
        System.out.println(name.concat("Raj"));
        System.out.println(name.replace("Ankit", "Minal"));
        System.out.println(name.replace("Raj", "Rai"));
        System.out.println(name.indexOf("R"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());

    }
    
}
