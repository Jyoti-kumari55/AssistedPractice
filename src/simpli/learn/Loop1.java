 //Write a program to check if a given integer number is Positive, Negative, or Zero. 


package simpli.learn;

import java.math.BigInteger;
import java.util.Scanner;

public class Loop1 {
	public static void main(String args[]) {
	int n=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number");
		n = sc.nextInt();
		if(n>=1) {
			System.out.println(" Number is positive integer: " +n);
		}
	else if (n<0) {
		System.out.println(" Number is negative integer: " +n);
	}
	else {
		System.out.println(" Number is zero: " +n);
	}
	}
		
	}

