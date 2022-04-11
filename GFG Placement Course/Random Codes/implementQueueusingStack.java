import java.util.*;

public class implementQueueusingStack {
    public static void main(String [] args){
        Queue q =new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        System.out.println(q.remove());
    }
    class Main{
        static class Queue{ //Nested Class
            static Stack<Integer> s1=new Stack<>();
            static Stack<Integer> s2=new Stack<>();

            public static boolean isEmpty(){
                return s1.isEmpty() && s2.isEmpty();
            }

            public static void add(int data){
                s1.push(data);
            }

            public static int remove(){
                if(s1.isEmpty() && s2.isEmpty()){
                    System.out.println("Underflow");
                    System.exit(0);
                }
                if(s2.isEmpty()){
                    while(!s1.isEmpty()){
                        int x=s1.pop();
                        s2.push(x);
                    }
                }
                return s2.pop();
            }
            public static int peek(){
                return s1.peek();
            }

        }
    }

    
}
