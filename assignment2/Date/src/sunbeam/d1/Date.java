package sunbeam.d1;

public class Date {
	int month;
	int day;
	int year;
	
	public Date() {
		this.month = 0;
		this.day = 0;
		this.year = 0;
		
	}
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate() {
		System.out.println("Enter date is: " +this.month+"/"+this.day+"/"+this.year);
		
	}
	

}
