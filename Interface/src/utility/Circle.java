package utility;

import java.util.Scanner;

public class Circle implements Drawable{
	double radius;

	@Override
	public void Drawshape() {
	 System.out.println("------DrawShape of Circle:------");
		
	}

	@Override
	public void calculateArea() {
	System.out.println("Enter the radius of circle:");
	Scanner sc= new Scanner(System.in);
	radius=sc.nextDouble();
	 double area= pi*(radius*radius);
	System.out.println("Area of circle :"+area);
		
	}
 
 
 
}
