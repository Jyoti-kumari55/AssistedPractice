package simpli.learn;

import java.util.Scanner;

public class ArithmaticCalculator {
public static void main(String[] args) {
	double n1;
	double n2;
	double output = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers :-");
	n1 = sc.nextDouble();
	n2 = sc.nextDouble();
	System.out.println("Enter the Arithmatic operator (+,-,*,/)");
	char operator = sc.next().charAt(0);
	
	switch (operator) {
	case '+':
		output = n1 + n2;
		System.out.println("Addition of "+n1+" and "+n2+" = "+output);
		break;
    case '-':
    	output = n1 - n2;
		System.out.println("Subtraction of "+n1+" and "+n2+" = "+output);
		break;
    case '*':
    	output = n1 * n2;
		System.out.println("Multification of "+n1+" and "+n2+" = "+output);
		break;
		
		case'/':
			output = n1 / n2;
			System.out.println("Division of "+n1+" and "+n2+" = "+output);
			break;
	default:
		System.out.println("Oops! Invalid Operator");
		break;
	}
	sc.close();
}
}
