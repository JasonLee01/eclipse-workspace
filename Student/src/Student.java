/*
 * The student class models a student having courses and grades. 
 */
public class Student {
	// The private instance variables
	private String name;
	private String address;
	// The courses taken and grades for the courses are kept in 2 parallel arrays
	private String[] courses;
	private int[] grades; //[0..100]
	private int numCourses; // Number of courses taken so far
	private static final int MAX_COURSES = 30; // max number of courses taken by student
	
	// Constructor
	public Student(String name, String address ) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSES]; //allocate arrays
		grades = new int[MAX_COURSES]; 
		numCourses = 0;
	}
	
	// The public getters and setters.
	// No setter for name as it is not designed to be changed.
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address ) {
		this.address = address;
	}
	
	//Describe this instance
	public String toString() {
		return name + "(" + address + ")";
	}
	
	//Add a course ad grade
	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}
	
	// Print all courses taken and their grades
	public void printGrades() {
		System.out.print(name);
		for (int i = 0; i < numCourses; ++i ) {
			System.out.print(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
	}
	// Compute the average grade
	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < numCourses; ++i) {
			sum += grades[i];
		}
		return (double)sum/numCourses;
	}
	//Extra check of number of courses 
	public void printNumCourses() {
		System.out.println(numCourses);
	}
}
