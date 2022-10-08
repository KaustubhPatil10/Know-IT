package Ass11;

public class BankAccount {
	private int acno;
	private static float rate;
	private double balance;
    private static int count;

    static
    {
    	rate=5.5f;
    	count= 100;
	
    }
    
public BankAccount()
{
	
	acno=++count;
	
}
public BankAccount(int acno, double balance)
{
	this.acno= acno;
	this.balance=balance;
}
public static void updateIntRate(float rates)
{
	rate= rates;
}
public double calculateBalance()
{
	 
	return balance = balance+( balance *(rate/100));
	  
}
 public void show()
 {
	 System.out.println("");
	 System.out.println("BankAccount :"+acno+"\t"+balance+"\t"+rate);
 }
}