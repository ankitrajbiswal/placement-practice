public class thisKeyword {
    public static void main (String [] args){
        pen trimax=new pen();
        pen pilot=new pen();
        pen pentonic=new pen();
        trimax.color="Blue";
        trimax.type="Gel Pen";
        pilot.color="Black";
        pilot.type="Gel Pen";
        pentonic.color="Red";
        pentonic.type="Ball Pen";
        trimax.printColor();
        trimax.printType();
        trimax.write();
        pilot.printColor();
        pilot.printType();
        pilot.write();
        pentonic.printColor();
        pentonic.printType();
        pentonic.write();
    }
    
}
class pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing the names of Army Officers");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
