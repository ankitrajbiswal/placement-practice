import java.util.Stack;
import java.util.Scanner;

public class bracketBalancing {
    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Number of Test cases");
        int t =sc.nextInt();
        sc.nextLine();//for flushing the t
        while(t-- !=0){
            String s=sc.nextLine();
            Stack<Character> myStack= new Stack<>();

            boolean isBalanced=true;

            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);//Return the first and subseqyent index
                if(ch=='(' || ch== '{' || ch=='['){
                    myStack.push(ch); // inserting into stack if they are opening brackets
                    continue;
                }
                if(ch == ')'){
                    if(myStack.peek()=='('){
                        myStack.pop();
                    }else{
                        isBalanced=false;
                        break;
                    }
                }

                if(ch == '}'){
                    if(myStack.peek()=='{'){
                        myStack.pop();
                    }else{
                        isBalanced=false;
                        break;
                    }
                }

                if(ch == ']'){
                    if(myStack.peek()=='['){
                        myStack.pop();
                    }else{
                        isBalanced=false;
                        break;
                    }
                }
            }
            if(!myStack.isEmpty()){
                isBalanced=false;
            }
            if(isBalanced){
                System.out.println("Balanced");
            }else{
                System.out.println("Not Balanced");
            }

        }


    }
    
}
