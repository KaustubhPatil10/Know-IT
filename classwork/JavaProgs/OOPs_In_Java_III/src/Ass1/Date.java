package Ass1;

public class Date {
	private int day,month,year;
	public Date() {
		day=month=1;
		year=2022;
				
	}
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void display()
	{
		System.out.println(" Date "+day+"/"+month+"/"+year);
	}
	
}
