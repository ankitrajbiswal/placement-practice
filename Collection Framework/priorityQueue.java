
/* Priority queue is a special type of queue in which each element is associated with a priority.
   If two elements have same priority , then they are served in order of the queue
   it have all functions of the queue
   METHODS OF PRIORITY QUEUE:
   1. add()   2. remove()   3.element ()

   when elements are removed they are removed in sorted order
 */
import java.util.PriorityQueue;
public class priorityQueue {
    public static void main(String [] args){
        PriorityQueue <String> ank=new PriorityQueue<>();
        ank.add("Ankit");
        ank.add("Suvasmita");
        ank.add("Manju");
        ank.add("Abhaya");
        ank.add("Aakash");
        ank.add("Tirtha");
        System.out.println(ank);

        System.out.println(ank.element());
        System.out.println(ank.remove());
        System.out.println(ank);



    }
    
}
