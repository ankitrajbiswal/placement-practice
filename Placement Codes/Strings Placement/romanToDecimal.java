import java.util.*;
public class romanToDecimal {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Roman Numeral");
        String str=sc.nextLine();
        romtoDec(str);
    }

    static void romtoDec (String str){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
            
        int result = 0;
        int n = str.length();
        
        for(int i=0; i<n-1; i++){
            char curr = str.charAt(i);
            char next = str.charAt(i + 1);
            if(map.get(curr) < map.get(next))
              result -= map.get(curr);
            else
               result += map.get(curr);
        }
        
        result += map.get(str.charAt(n - 1));
        
        System.out.println(result);
    }
    
}
