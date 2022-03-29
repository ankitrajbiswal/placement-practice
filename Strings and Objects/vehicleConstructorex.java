public class vehicleConstructorex {
    int wheels;
    vehicleConstructorex(){ // No Argument Constructor
        wheels=4;
    }
    vehicleConstructorex(int noOfWheels){ //Parameterized Constructor
        wheels=noOfWheels;
    }
    public static void main(String [] args){
        vehicleConstructorex car=new vehicleConstructorex();
        vehicleConstructorex bike=new vehicleConstructorex(2);
        vehicleConstructorex truck=new vehicleConstructorex(16);
        System.out.println("Earlier Car wheels " +car.wheels);
        car.wheels=8;
        System.out.println("Present Car Wheels " +car.wheels);
        System.out.println("Present wheels in Bike " +bike.wheels);
        System.out.println("Present wheels in truck " +truck.wheels);

    }
    
}
