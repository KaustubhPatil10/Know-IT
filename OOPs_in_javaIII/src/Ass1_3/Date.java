package Ass1_3;

public class Date {
	private int day,month,year;
	private static int count;
	
	public Date()
	{
		day=1;
		month=10;
		year=2022;
		count++;
	}
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	
		count++;
	}
	public static void displayCount()
	{
		System.out.println("Count is: "+count);
		
	}

}
