// test account
public class testAccount {

	public static void main(String[] args) {
	
		
		//with overriding id/name
		Account a1 = new Account("1234","Jason Lee");
		System.out.println(a1);
		
		//deposit 5000
		a1.credit(5000);
		System.out.println(a1);
		
		//debit 1500
		int returnValue = a1.debit(1500);
		if (returnValue == -1) {
			System.out.println("Amount exceeded balance");
		}
//		else {
//			System.out.println(returnValue);
//		}
		System.out.println(a1);
		
		//debit 1000
		returnValue = a1.debit(2000);
		if (returnValue == -1) {
			System.out.println("Amount exceeded balance");
		}
//		else {
//			System.out.println(returnValue);
//		}
		System.out.println(a1);
		
		//transfer 1600
		returnValue = a1.transfer("5555", 1600);
		if (returnValue == -1) {
			System.out.println("Amount exceeded balance");
		}
//		else {
//			System.out.println(returnValue);
//		}
		System.out.println(a1);
				
	}

}
