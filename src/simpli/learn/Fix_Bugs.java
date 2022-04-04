package simpli.learn;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Scanner;
	public class Fix_Bugs {
	public static void main(String[] args) {
	 /*System.out.println("Hello World!");*/
	 System.out.println("*********************************************************************************");
	 System.out.println("**********************WELCOME TO THE DESK APPLICATION********************************");
	 
	 optionsSelection();
	 }
	 private static void optionsSelection() {
	 String[] arr = {"1. Disply my all money ",
	 "2. Add some new money ",
	 "3. Delete some money ",
	 "4. sorting of money ",
	 "5. Search for a particular money ",
	 "6. Close the desk application"
	 };
	 int[] arr1 = {1,2,3,4,5,6};
	 int len = arr1.length;
	 for(int i=0; i<len;i++){
	 System.out.println(arr[i]);
	 // display the all the Strings mentioned in the String array
	 }
	 ArrayList<Integer> arrlist = new ArrayList<Integer>();
	 ArrayList<Integer> money = new ArrayList<Integer>();
	 money.add(46000);
	 money.add(23900);
	 money.add(45000);
	 money.add(32000);
	 money.add(19100);
	 money.addAll(arrlist);
	 System.out.println("Enter your choice:-");
	 Scanner sc = new Scanner(System.in);
	 int options = sc.nextInt();
	 for(int j=1;j<=len;j++){
	 if(options==j){
	 switch (options){
	 
	 case 1:
		 
	 System.out.println(" Saved money are listed below ->");
	 System.out.println(money+"\n");
	 optionsSelection();
	 break;
	 
	 case 2:
	 System.out.println("Enter the amount to add in your money: ");
	 int value = sc.nextInt();
	 money.add(value);
	 System.out.println(" Amount is updated\n");
	 money.addAll(arrlist);
	 System.out.println(money+"\n");
	 optionsSelection();
	 break;
	 
	 case 3:
	 System.out.println("You are about the delete all your money!.....");
	 int amount = sc.nextInt();
	if(amount==options){
	 money.clear();
	 System.out.println(money+"\n");
	 System.out.println("All your money is deleted!");
	 } else {
	 System.out.println("Oops... try again!");
	 }
	 optionsSelection();
	 break;
	 
	 case 4:
	 sortExpenses(money);
	 optionsSelection();
	 break;
	 
	 case 5:
	 searchExpenses(money);
	 optionsSelection();
	 break;
	 
	 case 6:
	 closeApp();
	 break;
	 default:
	 System.out.println("You have made an invalid choice!");
	 break;
	 }
	 }
	 }
	 }
	 private static void closeApp() {
	 System.out.println("Close your application... \nThank you!");
	}
	private static void searchExpenses(ArrayList<Integer> arrayList) {
	 int length = arrayList.size();
	 System.out.println("Enter the amount that you want to search in your money list:");
	 //
	 Scanner sc = new Scanner(System.in);
	 int input = sc.nextInt();
	 //Linear Search
	 for(int i=0;i<length;i++) {
	 if(arrayList.get(i)==input) {
	 System.out.println("Amount found " + input + " at " + i + " position");
	 }
	 }
	 }
	 private static void sortExpenses(ArrayList<Integer> arrayList) {
	 int arrlength = arrayList.size();
	 // Money sorted in ascending order.
	 
	 Collections.sort(arrayList);
	 System.out.println("Sorted expenses: ");
	 for(Integer i: arrayList) {
	 System.out.print(i + " ");
	 }
	 
	 System.out.println("\n");}
	}

