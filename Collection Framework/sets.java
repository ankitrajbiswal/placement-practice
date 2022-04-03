import java.util.HashSet;
import java.util.Set;

//Sets do not contain duplicate elments as they store data in accordance of key
//Sets does operation in constant time
//ordering is not sorted in set, if you want result in same order in which it was inserted use "Linked Hashset<>()"
//if you want output in sorted manner , then we can use "TreeSet<>()"

public class sets {
    public static void main(String [] args){
        Set <String> fruits= new HashSet<>();
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Mango");
        fruits.add("Watermelon");
        fruits.add("Papaya");
        fruits.add("Chiku");
        fruits.add("Orange");
        fruits.add("Banana");
        System.out.println(fruits);

        Set <String> names= new HashSet<>();
        names.add("Ankit");
        names.add("Shivum");
        names.add("Aanya");
        names.add("Minal");
        names.add("Raiza");
        names.add("Isha");
        names.add("Uma");
        names.add("Mohit");
        System.out.println(names);
        names.addAll(fruits);
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        

        //Operations on sets
        System.out.println(names.addAll(fruits));
        System.out.println(names.retainAll(fruits));
        System.out.println(names.containsAll(fruits));
    }
    
    
}
