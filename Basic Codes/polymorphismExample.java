
public class polymorphismExample {
    public static void main(String [] args){

        animal myAnimal=new animal();
        pig myPig=new pig();
        dog myDog=new dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

    }
}
    class animal{
        public void animalSound(){
            System.out.println("The Animal makes a sound");
        }
    }
    
    class pig extends animal{
        public void animalSound(){
            System.out.println("The Pig says: weeee weeee");
        }

    }

    class dog extends animal{
        public void animalSound(){
            System.out.println("The dog says : bow wow");
        }
    }

    

