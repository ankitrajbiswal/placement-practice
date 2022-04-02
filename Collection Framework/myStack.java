import java.util.Stack;

public class myStack {
    //Stack follows LIFO - Last In First Out
    //Stack Classes extends Vector Class
    public static void main (String [] args){
        Stack <Integer> myStack=new Stack<>();
        myStack.push(12);
        myStack.push(25);
        myStack.push(13);
        myStack.push(15);
        myStack.push(9);
        myStack.push(20);
        System.out.println(myStack);

        int popped=myStack.pop(); // pop out the top element or remove
        System.out.println(popped);

        int peeked=myStack.peek(); //Element which is at top
        System.out.println(peeked);
    }
    
}
