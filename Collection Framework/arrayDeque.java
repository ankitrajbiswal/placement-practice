/*  Array Deque- Double Ended Queue
It has methods of both queue and stack
    OPERATION                          METHOD (return null/false)                 METHOD THROWING EXCEPTION
   -----------                         ----------------------------               ----------------------------
Insertion from head     -->              offerFirst(e)                 -->           addFirst(e)
Removal from Head       -->              pollFirst()                   -->           removeFirst()
Retrieval from Head     -->              peekFirst()                   -->           getFirst()
Insertion from Tail     -->              offerLast(e)                  -->           addLast(e)
Removal from Tail       -->              pollLast()                    -->           removeLast()
Retrieval from Tail     -->              peekLast()                    -->           getLast()
------------------------------------------------------------------------------------------------------------------
*/
import java.util.*;
public class arrayDeque {
    public static void main(String [] args){
        ArrayDeque<Integer> ank= new ArrayDeque<>();
        ank.addFirst(24);
        ank.offerFirst(25);
        ank.add(33);// as it has methods of both queue and stack
        ank.offerFirst(15);
        ank.offerLast(37);
        ank.addLast(32);
        ank.add(7);
        ank.add(67);
        System.out.println(ank);
        System.out.println(ank.peekFirst());
        System.out.println(ank.getFirst());
        System.out.println(ank.peek());//Method of queue and stack
        System.out.println(ank.peekLast());
        System.out.println(ank.getLast());

        System.out.println(ank.pop());
        System.out.println(ank.pollLast());
        System.out.println(ank.removeLast());
        System.out.println(ank.pollFirst());
        System.out.println(ank.removeFirst());
        System.out.println(ank);



    }
    
}
