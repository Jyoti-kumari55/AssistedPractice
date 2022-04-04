package simpli.learn;

	public class EnterpriseCustomer extends Customer {
		String customerID;
		String customerName;
		String customerType;
		double amount;
		
		//create constructor
		EnterpriseCustomer(String custID,String custName,String custType,double amt){
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
			if(this.customerType == "Small Scale") {
				return amount - 500;
			}
			else if(this.customerType == "Big Scale") {
				return amount;
			}
			return amount;
			}
		}

