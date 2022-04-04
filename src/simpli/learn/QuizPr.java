package simpli.learn;

import java.util.Scanner;

public class QuizPr {
	public static void main(String agrs[]) {
		int n;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Who is the founder of the blue origin ?");
		System.out.println("1. Bill Gates\n2. Nadella\n3. Tim Cook\n4. Jeff Bezos");
		
		
		System.out.println("Enter the choices : (1/2/3/4)?");
		n = sc.nextInt();
		if(n == 4) {
			System.out.println("Congratulations : You got this.");
		}else {
			System.out.println("Wrong! Try again.");
		}
	}
}
