import java.util.LinkedList;

public class exLinkedList {
    public static void main(String [] args) {
        LinkedList<Integer> ll = new LinkedList();
        ll.add(15);
        ll.add(26);
        ll.add(25);
        ll.add(13);
        ll.add(12);
        ll.add(17);
        ll.add(9);
        ll.add(20);
        System.out.println(ll);
        ll.set(0, 25);
        System.out.println(ll.get(0));
        ll.remove(2);
        System.out.println(ll.get(2));
        // ll.clear();  ----> Empties the Linked List
        // System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.contains(78));
        System.out.println(ll.isEmpty());

        
    }
    
}
