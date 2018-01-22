/*
 * A test driver program for the Student class
 */
public class testStudent {

	public static void main(String[] args) {
	// Test constructor and to String()
	Student ahTeck = new Student("Tan Ah Teck", "1 Happy Ave");
	System.out.println(ahTeck);

	//Test Setters and Getters
	ahTeck.setAddress("8 Kg Java");
	System.out.println(ahTeck); //run toString() to inspect the modified instance
	System.out.println(ahTeck.getName());
	System.out.println(ahTeck.getAddress());
	
	//Test addCourseGeade(), printGrades() and getAverageGrade()
	ahTeck.addCourseGrade("IM101",89);
	ahTeck.addCourseGrade("IM102",57);
	ahTeck.addCourseGrade("IM103", 96);
	ahTeck.printGrades();
	ahTeck.printNumCourses();
	System.out.printf("The average grade is %.2f%n",  ahTeck.getAverageGrade());
	
	}
}
