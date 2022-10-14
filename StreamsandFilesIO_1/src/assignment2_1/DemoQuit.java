package assignment2_1;
import java.io.*;
public class DemoQuit {

	public static void main(String[] args) throws IOException, FileNotFoundException {
	System.out.println("Enter the String Data: ");
	BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
	
	
	  while(true) {
		  String fname= buffer.readLine();
		  System.out.print((String)fname);
		  if(fname.equals("quit"))
			  break;
	  }  
		
  


	}

}
