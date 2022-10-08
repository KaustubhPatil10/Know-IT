package Ass1_2;

public class Book {
	private int bookid;
	private float price;
	private static int count;
	
	static
	{
		count=100;
	}
	public Book()
	{
		bookid=++count;
		
		
	}
	public Book(float price)
	{
	    bookid=++count;
		this.price=price;
	}
    public void display()
    {
    	System.out.println("Book iD: "+bookid+"  price: "+price);
    	
    }
}
