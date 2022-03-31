import java.util.ArrayList;
public class myArraylist{
    public static void main(String [] args){
        ArrayList<String> fruits =new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Watermelon");
        fruits.add("Grapes");
       // fruits.addAll(another collection)
        for(int i=0;i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }

        System.out.println(fruits.get(2)); //returns the index number 2
        fruits.set(4, "Papaya"); //updates index 4
        System.out.println(fruits.get(4));
        fruits.remove(4);
        fruits.removeAll(fruits);
        // for(int i=0;i<fruits.size();i++){
        //     System.out.println(fruits.get(i));
        // }
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Guava"));
        System.out.println(fruits.isEmpty());
       // object x[]=fruits.toArray(); // convert array list to array
       




    }
}
