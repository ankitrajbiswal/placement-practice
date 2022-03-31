public class exceptionHandling {
    public static void main (String [] args){
        try{    // Use of try block is necessary when error is expected followed by a catch block.
            int a=5;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage()+"Error Occured , Check Your Code");
        }
        finally{
            System.out.println("Fuck You Bitchhhhh");
        }
    }
    
}
