package utility;

import java.util.Scanner;

public class Rectangle implements Drawable{
	 public int length,breadth;
	 public double area;

	@Override
	public void Drawshape() {
		 System.out.println("------DrawShape of Rectangle:------");

		
	}

	@Override
	public void calculateArea() {
		 System.out.println("Enter the length and breadth of Rectangle:  ");
		 Scanner sc=new Scanner(System.in);
		 length=sc.nextInt();
		 breadth=sc.nextInt();
		 area= length*breadth;
		 System.out.println("Area of Rectangle: "+area);
		 

		
	}

}
