package simpli.learn;


	public abstract class Customer {
		String customerID;
		String customerName;
		String customerType;
		
		//constructor
		public Customer(String custId,String custname,String custype) {
			this.customerID = custId;
			this.customerName = custname;
			this.customerType = custype;
			
		
		}
		void showCustomerDetails() {	
		System.out.println("Customer ID: "+ this.customerID);
		System.out.println("Customer Name: "+ this.customerName);
		System.out.println("Customer Type: "+ this.customerType);
			
		}
	}

