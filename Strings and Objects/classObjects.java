
//Classes never occupy memory, objects occupy memory in Heap Memory
public class classObjects {
    boolean hasFur;
    String color;
    String breed;
    int legs;
    public void walk(){
        System.out.println(" The Dog is walking");
    }

    public static void main(String [] args){
        classObjects Dog1= new classObjects();
        Dog1.walk();
        Dog1.legs=4;
        Dog1.breed="Rottvieler";
        Dog1.color="Black";

    }
    
}
