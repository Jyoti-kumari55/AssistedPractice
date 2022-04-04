package simpli.learn;


public class BankAccount {
	public static void main(String[] args) {
		RegularCustomer regC1 = new RegularCustomer("R123" , "JYOTI" , "Domestic", 40000) ;
		RegularCustomer regC2 = new RegularCustomer("R145" , "ANKIT" , "Business", 46000) ;
		
		EnterpriseCustomer entC1 = new EnterpriseCustomer("E123", "AMIT", "Small Scale", 36000);
		EnterpriseCustomer entC2 = new EnterpriseCustomer("E190", "SUMIT", "Big Scale", 36780);
		
		
		regC1.showCustomerDetails();
		System.out.println("Final amount:" + regC1.get_final_amoun(5, 8));
		

		regC2.showCustomerDetails();
		System.out.println("Final amount:" + regC2.get_final_amoun(4, 3));
		
		
		entC1.showCustomerDetails();
		System.out.println("Final amount:" + entC1.get_final_amoun(5, 8));
		
		entC2.showCustomerDetails();
		System.out.println("Final amount:" + entC2.get_final_amoun(5, 8));
		
		
	}
	}

