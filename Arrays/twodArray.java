import java.util.*;
public class twodArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows and columns");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int a[][]=new int[rows][cols];
        int b[][]=new int [rows][cols];
        System.out.println("Enter the values in first array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the values in second array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(c[i][j]);
            }
            System.out.println();
        }
sc.close();

    }
    
}
