package simpli.learn;

import java.io.*;

//Main class
public class FileHandlingAssistedP{

	public static void appendStrToFile(String fileName,String handle)
	{
		// Try block to check for exceptions
		try {

			BufferedWriter out = new BufferedWriter(
				new FileWriter(fileName, true));

			// Writing on output stream
			out.write(handle);
			
			out.close();
		}

		// Catch block to handle the exceptions
		catch (IOException e) {
			System.out.println("exception occurred" + e);
		}
	}

	
	public static void main(String[] args) throws Exception
	{
		// Creating a file....
		String fileName = "Jyoti.txt";

		
		try {

			
			BufferedWriter out = new BufferedWriter(
				new FileWriter(fileName));

			
			out.write("File handling program\n");

			
			out.close();
		}

		// Catch block to handle exceptions
		catch (IOException e) {

			
			System.out.println("Exception Occurred" + e);
		}

		
		String handle = "This is a file handling code to read, write and append to a file:";

		
		appendStrToFile(fileName, handle);

		
		try {
			BufferedReader in = new BufferedReader(
				new FileReader("Jyoti.txt"));

			String mystring;

			
			while ((mystring = in.readLine()) != null) {
				System.out.println(mystring);
			}
		}

		catch (IOException e) {
			System.out.println("Exception Occurred" + e);
		}
	}
}

	