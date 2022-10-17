package reflection_2;

public class Myjob extends Thread{
	private String header;
	private String body;
	private String footer;
	private Thread t;
	Printer p;
	
	public Myjob(Printer p,String header, String body, String footer) {
		t= new Thread(this);
		this.p=p;
		this.header=header;
		this.body=body;
		this.footer=footer;
	}
	
	public Thread getThread() {             //method.getThread
		return t;
	}
	
	public void run() {						//entry point for the thread
		try {
			p.Print(header, footer, body);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
