package Ass;
import java.io.*;
import java.util.*;

public class DemoSerialisation {

	public static void main(String[] args)throws IOException, FileNotFoundException,ClassNotFoundException {
		
Student s1=new Student(102,"Prince",99.99);
ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:/Kaustubh Vaibhav/amazon.dat")); 
	out.writeObject(s1);
	System.out.println("Data Inserted");
	out.close();

	
	}
}
