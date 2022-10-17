package reflection_2;

public class Printer {
	private String header;
	private String body;
	private String footer;
	
	
	
	public void Print(String h1, String b1, String f1) throws InterruptedException {
		synchronized(this) {
       this.header=h1;
       this.body=b1;
       this.footer=f1;
       System.out.println(header);
       Thread.sleep(500);
       System.out.println(body);
       Thread.sleep(400);
       System.out.println(footer);
       Thread.sleep(300);
	}
	}

}
