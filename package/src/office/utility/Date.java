package office.utility;

public class Date {
	private int day,month,year;
	
	public Date()
	{
		
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void display()
	{
		System.out.println("Date :"+day+"/"+month+"/"+year);
	}

}
