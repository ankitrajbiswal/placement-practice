//Leet code
import java.util.*;
class majority_element_ii
{
    public static void main(String args[])
    {
        int[] a = {1 , 2 , 3 , 3 , 2};
        List <Integer> result = majorityElement(a);
        if(result.size() == 0)
            System.out.println("No majority elements");
        else
            for(int i : result)
                System.out.print(i + " ");
    }
    static List <Integer> majorityElement(int[] a)
    {
        List <Integer> result = new ArrayList <Integer>();
        HashMap <Integer , Integer> frequency = new HashMap <>();
        for(int i = 0 ; i < a.length ; i++)
            frequency.put(a[i] , frequency.getOrDefault(a[i] , 0) + 1);
        for(Map.Entry i : frequency.entrySet())
        {
            Integer value = (int)i.getValue() , key = (int)i.getKey();
            if((int)value > ((a.length) / 3))
                result.add(key);
        }
        return result;
    }
}
