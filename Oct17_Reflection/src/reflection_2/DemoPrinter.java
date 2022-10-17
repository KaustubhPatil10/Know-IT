package reflection_2;

public class DemoPrinter {

	public static void main(String[] args) {
	 Printer p = new Printer();
	 Myjob pri1 = new Myjob(p,"{","Hello World","}");
	 Myjob pri2 = new Myjob(p,"{","Welcome Multi threading","}");
	 Myjob pri3 = new Myjob(p,"{","Synchronization","}");
	 System.out.println("Printing begins......");
	 
	 pri1.getThread().start();
	 pri2.getThread().start();
	 pri3.getThread().start();
	
	try 
	{
		pri1.getThread().join();
		pri2.getThread().join();
		pri3.getThread().join();
	}
	catch(InterruptedException e) 
	{}
	System.out.println("Printing ends.......");
	}
}
