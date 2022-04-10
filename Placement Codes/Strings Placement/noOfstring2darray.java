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
      static int searchString(String needle,int row, int col, String str[],int row_count,int col_count){
        int found=0;
        int r,c;
        for(r=0;r<row_count;++r){
            for(c=0;c<col_count;++c){
                found+=internalSearch(needle,r,c,str,row_count-1,col_count-1,0);
            }
        }
        return found;
    }
    
}
