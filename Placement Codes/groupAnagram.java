import java.util.*;
// Leet code Question 49
public class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s : strs){
            char charArry[]=s.toCharArray();
            Arrays.sort(charArry);
            String sorted = new String (charArry);
            if(!map.containsKey(sorted)){
                map.put(sorted,new LinkedList<String>());
                
            }
            map.get(sorted).add(s);
        }
        return new LinkedList<>(map.values());
        
    }
}
