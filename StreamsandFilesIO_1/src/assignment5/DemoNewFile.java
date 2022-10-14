package assignment5;
import java.io.*;
public class DemoNewFile {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileInputStream fin=new FileInputStream("c:/kaustubh vaibhav/xyz.txt");

		FileOutputStream fout = new FileOutputStream("c:/kaustubh vaibhav/abc.txt");
		
		int ch;
		while((ch=fin.read())!=-1)
		{
			fout.write(ch);
		}
		fin.close();
		fout.close();
	}

}
