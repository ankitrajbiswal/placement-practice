public class interfacesPerson implements youtuber, student {
    public static void main(String [] args){
        interfacesPerson obj= new interfacesPerson();
        obj.makeVideo();
        obj.study();

        youtuber x= obj;
        x.makeVideo();

    }

    @Override
    public void study() {
        // TODO Auto-generated method stub
        System.out.println(" Person is studying");
        
    }

    @Override
    public void makeVideo() {
        // TODO Auto-generated method stub
         System.out.println("Person is making video");
        
    }
    
}

abstract interface youtuber{
    abstract void makeVideo(); // No Body in abstract methods
}

abstract interface student{
    abstract void study();
}