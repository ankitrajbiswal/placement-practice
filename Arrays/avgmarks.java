import java.util.*;
public class avgmarks{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n=sc.nextInt();
        int marks[]=new int[n];
        System.out.println("Enter the marks of the student");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        int avgMarks=0;
        for(int i=0;i<n;i++){
            avgMarks=avgMarks+marks[i];
        }
        System.out.println("The Average Marks of the students are " +avgMarks/n);
sc.close();
    }
}