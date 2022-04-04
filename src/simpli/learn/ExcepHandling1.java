//1.Write a program that takes as input the size of the array and the elements in the array. 
//The program then asks the user to enter a particular index and prints the element at that index. 
//Index  starts from zero. This program may generate Array Index Out Of Bounds Exception  or 
//NumberFormatException .  Use exception handling mechanisms to handle this exception. 

package simpli.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepHandling1 {
public static void main(String[] args)  {
	int n;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number of array.");
	n = scanner.nextInt();
	int[] arr = new int[n];
	try {
		System.out.println("Enter the elements of array:");
		for(int i = 0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the index of the array that you want to access:");
		int k = scanner.nextInt();
		System.out.println("The accessed array "+k+"=" +arr[k]);
		System.out.println("The array is successfully accessed.");
			
	} catch (ArrayIndexOutOfBoundsException  e) {
		System.out.println("ArrayOutOfBoundException");
	}
	catch (InputMismatchException e) {
		// TODO: handle exception
		
			System.out.println("InputMismatchedException");
			
		}
	}
}
	


