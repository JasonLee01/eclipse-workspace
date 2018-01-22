// example 1.4 - practiced Jan.7, 2018 

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	//Employee constructor
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	//get ID
	public int getId() {
		return this.id;
	}
	
	//get first name
	public String getFirstName() {
		return this.firstName;
	}
	
	//get last name
	public String getLastName() {
		return this.lastName;
	}
	
	//get name
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	
	//get salary
	public int getSalary() {
		return this.salary;
	}
	
	//set salary
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//get annual salary
	public int getAnnualSalary() {
		return this.salary * 12;
	}
	
	//raise salary by percent and return salary
	public void raiseSalary(int percent) {
		this.salary = getSalary() + getSalary() * percent / 100 ;
		//return this.salary;
	}
	
	//toString
	public String toString() {
		return "Employee[id=" + this.getId() + ", name= " + this.getName() + ", salary= " + this.getSalary() + "]"; 
	}
}


