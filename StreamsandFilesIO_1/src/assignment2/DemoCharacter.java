package assignment2;
import java.io.*;
public class DemoCharacter {

	public static void main(String[] args) throws IOException,FileNotFoundException{
	  BufferedReader b1= new BufferedReader(new InputStreamReader(System.in));
	  int ch='A';
	  System.out.println("Enter the data:");
	  
	  while((ch=b1.read())!='q') {
		  System.out.print((char)ch);
	  }

	}

}
