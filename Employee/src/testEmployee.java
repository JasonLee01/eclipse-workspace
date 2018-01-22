//test employee
public class testEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//construct
		Employee e1 = new Employee(10, "Jason", "Lee", 10000);
		
		//before increase
		System.out.println("before increase");
		System.out.println(e1);
		
		//after increase
		e1.raiseSalary(5);
		
		System.out.println("after increase");
		System.out.println(e1.toString());
		
		System.out.println("Annual Salary =" + e1.getAnnualSalary());
	
		
	}

}
