//3.Write a Program to take care of Number Format Exception if user enters values other than 
//integer for calculating average marks of 2 students. The name of the students and marks in 3 
//subjects are taken from the user while executing the program.In the same Program write your own 
//Exception classes to take care of Negative values and values out of range.
//(i.e. other than in the range of 0-100)
package simpli.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepHandling3 {
public static void main(String[] args) throws Ex_a,Ex_b{
	
	Scanner scanner = new Scanner(System.in);
	String name1,name2;
	int sum1=0,sum2=0;
	
	try {
		System.out.println("Enter the name of the student -1.");
		name1 = scanner.next();
		System.out.println("Enter the marks of the student");
		int arr[] = new int[3];
		for (int i=0;i<3;i++) 
		{
			arr[i] = scanner.nextInt();
			if(arr[i]<0) 
				throw new Ex_a("No negative values are allowed");
			else if(arr[i]>100)
				throw new Ex_b("Values out of the Range.");
			else 
				sum1 = sum1 + arr[i];
			}
			System.out.println("Enter the name of the student -2.");
			name2 = scanner.next();
			System.out.println("Enter the marks of the student");
			int arr2[] = new int[3];
			for (int j=0;j<3;j++) {
				arr2[j] = scanner.nextInt();
		      if(arr2[j]<0) 
					throw new Ex_a("No negative values are allowed");
				else if(arr2[j]>100)
					throw new Ex_b("Values out of the Range.");
				else 
					sum2 = sum2 + arr2[j];
				}
		      System.out.println("Average Marks of student "+name1+ "and " + name2+ "is :"+(sum1+sum2)/2);
			scanner.close();
		}
			
			catch(InputMismatchException exception){
			
				System.out.println("java.lang.InputMismatchException");
			}
			catch(Ex_a e)
			{
				System.out.println(e);
			}
			catch(Ex_b o)
			{
				System.out.println(o);
			}
      }
}
			
