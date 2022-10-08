package Ass11;

public class DemoAccount {

	public static void main(String[] args) {
		
		BankAccount b1=new BankAccount(101,5000);
		b1.show();
		System.out.println(b1.calculateBalance());
		b1.updateIntRate(6);
		System.out.println(b1.calculateBalance());

		
		
	
	

	}

}
