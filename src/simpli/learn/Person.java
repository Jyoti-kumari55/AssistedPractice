package simpli.learn;
//Create a class called Person with a member variable “name”.->person.java Create a class called Employee that inherits the person property .
//The other  data Member of the Employee class are annualsalary:double, the year the employee started to work. 
//National insurance number which is taken as a String —>Employee.java Ur class has the necessary constructors and getters and setters
//Write another class TestEmp contains the main method to fully test your class definitions

	class person{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}	
	}
	class Employee1 extends person{
		private double annualSalary ;
		private int year;
		private String NatInsNO;

		public double getAnnualSalary() {
			return annualSalary;
		}
		public void setAnnualSalary(double annualSalary) {
			this.annualSalary = annualSalary;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getNatInsNO() {
			return NatInsNO;
		}
		public void setNatInsNO(String natInsNO) {
			NatInsNO = natInsNO;
		}
		

	public String toString() {
		return "Employee [ annualSalary=" + annualSalary + ", year=" + year + ", NatInsNO =" + NatInsNO +"]";
	   }

	 }



