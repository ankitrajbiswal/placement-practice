public class maxMinArraygfg {
    static pair getMinMax(long a[], long n)  
    {
         long min = a[0],max=a[0];
     
       for(long i : a){
          if(min>i)
              min = i;
          if(max<i)
              max = i;
      }
      return new pair(min,max);
    }
    
}
