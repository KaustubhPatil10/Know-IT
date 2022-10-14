package assignment4;

import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.*;
public class Demo1 {

	public static void main(String[] args) throws IOException, FileNotFoundException{
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter file name with path: ");
		name= sc.next();
		
		
		
	    File fname = new File(name);
		FileOutputStream out=new FileOutputStream(fname);
	    String str;
	    str=sc.nextLine();
	    byte arr[]=str.getBytes();
	    out.write(arr);
	    out.close();
	    sc.close();

	}

}
