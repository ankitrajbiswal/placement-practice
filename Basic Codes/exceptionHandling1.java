public class exceptionHandling1 {
    public static void main(String [] args){
        fun1();
    }

    static void fun1(){
        int a=5;
        int b=3;
        int c=a/b;

        System.out.println(c);

        boolean isDanger=true;
        if(isDanger){
            throw new ArrayIndexOutOfBoundsException("Gaand Phatne waali thi");
        }
    }
    
}
