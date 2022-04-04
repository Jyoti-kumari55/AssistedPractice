//Initialize a character variable in a program and 
//print 'Alphabhet' if the initialized value is an alphabhet, print 'Digit' if the initialized value
//is a number, and print 'Special Character', if the initialized value is anything else.
package simpli.learn;

import java.util.Scanner;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Loop5 {
	public static void main(String[] args) {
  char c = 'p';
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value");
 
if((c>='A' && c<='Z')||c>='a' && c<='z') {
	System.out.println("Alphabet");
	}else if(c>=47 && c<=58) {
		System.out.println("Digit");
	}
	else {
		System.out.println("Special Variable");
	}
}
}