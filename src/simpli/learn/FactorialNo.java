package simpli.learn;


	import java.util.Scanner;

	public class FactorialNo {
		public static void main(String[] agrs) {
			
		int n;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
	    n = sc.nextInt();
	    
		int fact_var = 1;
		//for(int i = 1;i<=n;i++) {	
		//fact_var = fact_var * i;
		int i = 1;
		while(i<=n) {
			fact_var = fact_var * i; // or fact_var *= i----- is same
			i++;
			
		}
		System.out.println("Factorial of the number "+n+" is: "+fact_var);
		
	}
	}

