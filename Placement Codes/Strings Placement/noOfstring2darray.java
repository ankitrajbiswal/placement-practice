public class noOfstring2darray {
    public static void main(String [] args){
        String needle="MAGIC";
        String input[]={"BBABBM", "CBMBBA", "IBABBG", "GOZBBI", "ABBBBC", "MCIGAM" };
        
        String[] str= new String[input.length];
        for(int i=0;i<input.length;i++){
            str[i]=input[i];
        }
        System.out.println("Count :" +searchString(needle,0,0,str,str.length,str[0].length()));
    }
    
}
