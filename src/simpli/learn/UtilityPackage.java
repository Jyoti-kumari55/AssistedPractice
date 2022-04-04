package simpli.learn;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UtilityPackage {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		
		String userString = sc.nextLine();
		StringTokenizer St  = new StringTokenizer(userString," ") ;
		
		System.out.println(St);
		System.out.println("\nVowel count for each word is given string are:-");
		
		while (St.hasMoreElements()) {
			String word =  St.nextToken();
			System.out.println("Processing word:" + word);
			
			int vowelcount = 0;
			for(char c:word.toCharArray()) {
				c=Character.toLowerCase(c);
				if(c=='a' || c=='e' ||c=='i'||c=='o'||c=='u' ) {
					vowelcount++;
					
				}
			}
			System.out.println("The word " + word +" has " + vowelcount +" vowels");
		}
		
		
	}
}
