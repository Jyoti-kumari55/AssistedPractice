package simpli.learn;

import java.util.Scanner;

public class QuizAnotherMethod {
	public static void main(String agrs[]) {
		int n;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("Who is the founder of the blue origin ?");
		System.out.println("1. Bill Gates\n2. Nadella\n3. Tim Cook\n4. Jeff Bezos\n5.Exit Program");
		
		
		System.out.println("Enter the choices : (1/2/3/4/5)?");
		n = sc.nextInt();
		if(n == 4) {
			System.out.println("Congratulations : You got this.");
			break;
		}else if (n == 5) {
			break;
		}
		else {
			System.out.println("Wrong! Try again.");
		}
	}

}
}
