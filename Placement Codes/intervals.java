import java.util.ArrayList;

public class intervals {

    // there will be three cases here:
    //     // 1. Non Overlapping where interval that is to merged is behind the given interval
    //     // 2. Overlapping interval
    //     // 3. Non Overlapping where interval that is to merge is far ahead of the given interval 

    int start;
    int end;
    Interval() {
        start=0;
        end=0;
    }
    Interval(int s, int e){
        start=s;
        end=e;
    }
    
}

    class solution{
    public ArrayList<Interval> insert (ArrayList<Interval>intervals, Interval newInterval){

        if(intervals==null){
        intervals= new ArrayList<Interval>();
        intervals.add(newInterval); 
        return intervals;
        } else if (intervals.size==0){
            intervals.add(newInterval); 
            return intervals;

        }

        Interval toInsert=newInterval;

        int i=0;
        while(i<intervals.size()){
            Interval current=intervals.get(i);

/* CASE 1 */    if(current.end<toInsert.start){
                i++;
                continue;
            } 
            
/* CASE 2 */  else if (toInsert.end<current.start){
                intervals.add(i,toInsert);
                break;
            }

/* CASE 3 */    else{
                toInsert.start=Math.min(toInsert.start,current.start);
                toInsert.end=Math.min(toInsert.end,current.end);
                intervals.remove(i);
  
            }

        }
/* CASE 4 */ if(i==intervals.size()){
             intervals.add(toInsert);
        }
        return intervals;

       }
}