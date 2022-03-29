//https://practice.geeksforgeeks.org/problems/number-of-open-doors1552/1/?track=PG-Mathematics&batchId=457#

//import java.io.*;
import java.util.Scanner;

class doorsOpen
{

// Function that counts the number of
// doors opens after the Nth turn
static int countOpenDoors(int N)
{

	// Find the number of open doors
	int doorsOpen = (int) Math.sqrt(N);

	
	return doorsOpen;
}

// Driver Code
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of doors");
		int N = sc.nextInt();
		System.out.println(countOpenDoors(N));
        sc.close();

	}
}

