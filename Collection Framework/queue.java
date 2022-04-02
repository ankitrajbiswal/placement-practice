import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String [] args){
        //FIFO- First In First Out
        Queue <Integer> myQueue=new LinkedList<>();
        myQueue.add(16);
        myQueue.add(25);
        myQueue.add(13);
        myQueue.add(15);
        myQueue.add(12);
        myQueue.add(17);
       // System.out.println(myQueue);

        myQueue.offer(23);
        myQueue.offer(5446);
        System.out.println(myQueue);
        // Offer and add have same work , except that offer dont throw exceptions

        System.out.println(myQueue.element());
        System.out.println(myQueue.peek());
        // element and peek have same work , except that peek dont throw exceptions

        System.out.println(myQueue.remove());
        System.out.println(myQueue.poll());
        // remove and poll have same work , except that poll dont throw exceptions
        

    }
}
