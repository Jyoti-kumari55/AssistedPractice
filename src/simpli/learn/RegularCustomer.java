package simpli.learn;

public class RegularCustomer extends Customer {
	String customerID;
	String customerName;
	String customerType;
	double amount;
	
	public RegularCustomer(String custID,String custName,String custType,double amt) {
		// TODO Auto-generated constructor stub
		super(custID, custName, custType);
		this.customerID = custID;
		this.customerName = custName;
		this.customerType = custType;
	     this.amount = amt;
	}
	//method
	double get_final_amoun(double interest,int year) {
		double simpleInterest = this.amount *interest *year;
		double amount = this.amount + simpleInterest;
		
		amount = amount -500;
		if(this.customerType == "Domestic") {
			return amount - 500;
		}
		else if(this.customerType == "Business") {
			return amount;
		}
		return amount;
		}
	}


