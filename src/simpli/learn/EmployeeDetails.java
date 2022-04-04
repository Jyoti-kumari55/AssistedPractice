package simpli.learn;

	class EmployeeData{
		int emp_id,salary;
		String name,address,department,email;
		public int getEmp_id() {
			return emp_id;
		}
		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String toString() {
			return "EmployeeData [emp_id = " + emp_id + " , salary = " +salary + " , name = " + name + " , address = " + address
					+ " , department = " + department + " , email = " + email + "]";	
		}	
	}
	public class EmployeeDetails {
		public static void main(String agrs[]) {
			EmployeeData emp = new EmployeeData();
			emp.setEmp_id(110);
			emp.setSalary(20000);
			emp.setName("JYOTI");
			emp.setDepartment("electronics");
			emp.setEmail("Jyoti.chaudhary@gmail.com");
			emp.setAddress("krishna puram colony");
			System.out.println(emp);
			int sal = emp.getSalary();
			int incre = 0;
			if ((sal >=10000) && (sal <=15000))  
	        {  
	          incre += (sal*2)/100;
			sal = sal + incre;
			
			 emp.setSalary(sal);  
	         System.out.println("\n Salary is incremented \n");  
	         System.out.println(emp); 
	        }
	         else
	        	 System.out.println("\n Salary is not incremented \n");  
	        System.out.println(emp);	
		}

}
