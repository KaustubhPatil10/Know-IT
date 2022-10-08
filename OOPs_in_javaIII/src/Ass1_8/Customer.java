package Ass1_8;

public class Customer {
	private String emid;
	private  Address address;
	
	public Customer() {
		super();
	}

	public Customer(String emid, Address add) {
		super();
		this.emid = emid;
		this.address=add;
		// address=new Address();
	}
	
	public Customer(String emid,String a, String b, String pin) {
		super();
		this.emid = emid;
		address= new Address(a,b,pin);
	}

	public void display()
    {
    	System.out.println("\nCustomer :"+emid+" \nAddress: "+address.display());
    	
    }
	
	
	
}
