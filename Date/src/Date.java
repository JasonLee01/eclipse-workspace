
public class Date {
	private int day;
	private int month;
	private int year;
	
	//construct
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//get day
	public int getDay() {
		return this.day;
	}
	
	//getMonth
	public int getMonth() {
		return this.month;
	}
	
	//get year
	public int getYear() {
		return this.year;
	}
	
	//set day
	public void setDay(int day) {
		this.day = day;
	}
	
	//set month
	public void setMonth(int month) {
		this.month = month;
	}
	
	//set year
	public void setYear(int year) {
		this.year = year;
	}
	
	//set date
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//toString
	public String toString() {
		return this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
	}
	
}


