// Write a program to check if a given integer number is odd or even.

package simpli.learn;

import java.util.Scanner;

public class Loop2 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the integer number:");
   Integer n = new Integer(0);
		   int a  = n;
	n = sc.nextInt();
	if(n%2==0) {
		System.out.println("The number is EVEN integer." +n);
		
	}
	else {
		System.out.println("The number is ODD integer.");
	}
}
}
