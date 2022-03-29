public class constructorOverloading {

    //Once you make a constructor, you cant call the default constructor of same class

    int wheels;
    int headlights;
    String color;

    constructorOverloading(int wheels){
        this.wheels=wheels;
        headlights=2;

    }
    constructorOverloading(int wheels, String color){
        this.wheels=wheels;
        headlights=2;
        this.color=color;
    }

    public static void main(String [] args){
        constructorOverloading ertiga=new constructorOverloading(4,"white");
        constructorOverloading audir8=new constructorOverloading(4,"red");
        constructorOverloading xuv700=new constructorOverloading(4,"black");
        constructorOverloading harrier=new constructorOverloading(4,"black");
        constructorOverloading continentalgt=new constructorOverloading(2);

        System.out.println(ertiga.wheels + "Wheels and " +ertiga.color+ "Color of vehicle" + ertiga.headlights +"No.of Headlights");
        System.out.println(audir8.wheels + "Wheels and " +audir8.color+ "Color of vehicle"+ audir8.headlights +"No.of Headlights");
        System.out.println(xuv700.wheels + "Wheels and " +xuv700.color+ "Color of vehicle"+ xuv700.headlights +"No.of Headlights");
        System.out.println(harrier.wheels + "Wheels and " +harrier.color+ "Color of vehicle"+ harrier.headlights +"No.of Headlights");
        System.out.println(continentalgt.wheels + "Wheels and " +continentalgt.color+ "Color of vehicle");

        
    }
    
}
