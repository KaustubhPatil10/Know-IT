package reflection_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyClass extends Thread {
	private String Source1,Destination2;
	
	public FileCopyClass(String f1, String f2) {
		this.Source1=f1;
		
		this.Destination2=f2;
	}
	
	
	public void run() {
		FileReader fr= new FileReader(Source1);
		FileWriter fw= new FileWriter(Destination2);
		

}
}