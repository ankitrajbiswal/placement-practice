public class encapsulation {
    public static void main(String [] args) 
    {
        student obj1=new encapsulation.student();//encapsulation.student because student class is inside encapsulation
        obj1.setData(22 ,"Ankit");
        System.out.println(obj1.getAge()+","+obj1.getName());

    }
    public static class student{
        private int age;
        private String name;

        public int getAge(){
            return age;
            
        }

        public void setData(int age,String name){
            this.age=age;
            this.name=name;

        }
        public String getName(){
            return name;
        }

    }
    
}
