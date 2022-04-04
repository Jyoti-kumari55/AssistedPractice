//2.Write a class MathOperation which accepts 5 integers through command line. 
//Create an array using these parameters. Loop through the array and obtain the sum and average 
//of all the elements and display the result. Various exceptions that may arise like ArithmeticException,
//NumberFormatException, and so on should be handled.

package simpli.learn;
public class ExcepHandling2 {
	public static void main(String[] args) {
		
int sum = 0;
double avg;
int arr[] = new int[5];
try {
	
	for(int i=0;i<5;i++) {
		                                        
	//**here all the three exception ArithmeticException,NumberFormatException and Arrayoutofbound**//

		//arr[i] = Integer.parseInt(null);
		//arr[i]= Integer.parseInt(args[i]);
		sum = sum + arr[i];
	}
	    avg = (sum)/0;
	
	System.out.println("sum :" +sum);
	System.out.println("average :" +avg);
} catch (ArithmeticException e) {
	// TODO: handle exception
	System.out.println("ArithmaticException");
}
catch (NumberFormatException e) {
	// TODO: handle exception
	System.out.println("NumberFormatException");
}
catch (ArrayIndexOutOfBoundsException e) {
	// TODO: handle exception
	System.out.println("ArrayIndexOfBoundsException");
}
}
}