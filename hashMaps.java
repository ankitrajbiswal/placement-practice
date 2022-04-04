
/* Elements are stored in (Key, Value) pairs, No duplicate data can be stored and each key is associated with a single value.
   Following are the classes of Map Interface:
   1. Hash Map                      4. Weak Hash Map
   2. Enum Map                      5. Tree Map
   3. Linked Hash Map

   All Operations are performed under O(1) time.
   output returned by Hash Function is Int.
 */
import java.util.*;
public class hashMaps {
    public static void main(String [] args){
        Map<Integer,String> relations= new HashMap<>();
        //Methods of HashMap
        relations.put(01, "Nation");
        relations.put(02, "Father");
        relations.put(03, "Mother");
        relations.put(04, "Sister");
        relations.put(05, "Girlfriend");
        relations.put(06, "Wife");
        System.out.println(relations);
       // relations.putAll(m); ---> Insert all entries from a specified map
       relations.putIfAbsent(07, "Brother");
       System.out.println(relations.get(01));
       System.out.println(relations.get(10));
       System.out.println(relations.containsKey(10));
       System.out.println(relations.containsValue("Sautan"));
       //relations.replace(key, oldValue, newValue)
       relations.remove(07);
       relations.remove(07, "Brother");
       System.out.println(relations.keySet());
       System.out.println(relations.values());
       System.out.println(relations.entrySet());
       


    }
    
}
