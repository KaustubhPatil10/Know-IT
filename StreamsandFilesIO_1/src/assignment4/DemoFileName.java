package assignment4;
import java.io.*;
import java.util.Scanner;
public class DemoFileName {
	public static void main(String[] args)throws IOException, FileNotFoundException {
		
		
		FileOutputStream out=new FileOutputStream("c:/kaustubh vaibhav/xyz.txt",true);
		
	    Scanner sc=new Scanner(System.in);
	    String str;
	    str=sc.nextLine();
	    byte arr[]=str.getBytes();
	    out.write(arr);
	    out.close();
	    sc.close();
	}
}
