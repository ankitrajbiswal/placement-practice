public class inheritance {
    public static void main(String [] args){
        teacher t=new teacher();
        t.name="Krishna";
        t.walk();
        t.eat();
        singer s=new singer();
        s.name="Mickey Singh";
        s.sing();
        s.walk();
        s.eat();
        
    }
    
    
}
class person{
    protected String name;
    public void walk(){
        System.out.println("Person is walking");
    }
    public void eat(){
        System.out.println("Person is eating");
    }

}

class teacher extends person{
    public void teach (){
        System.out.println("Teacher is teaching");
    }

}

class singer extends person{
    public void sing(){
        System.out.println("Singer is singing");
    }
}