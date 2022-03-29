//import java.util.*;
public class strings{
    public static void main(String [] args){
        String name="Ankit Raj Biswal"; //Initialized By Literals
        String name2=new String("Ankit Raj Biswal");//By New Object, this will create two string one in pool area and one in heap area
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name==name2); //false because name is stored in pool area and name2 is stored in heap area
    }
}
//it is always suggested to create new string always by initializing by literals as it is more optimized as the string will
//be stored in String pool area and if the same string has been created earlier, it will use that instead of creating new one.