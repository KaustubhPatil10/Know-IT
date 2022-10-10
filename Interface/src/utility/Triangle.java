package utility;

import java.util.Scanner;

public class Triangle implements Drawable{
   public double base,height,area;

@Override
public void Drawshape() {
	 System.out.println("------DrawShape of Triangle:------");

	
}

@Override
public void calculateArea() {
	 System.out.println("Enter the base and height of Triangle:  ");
	 Scanner sc= new Scanner(System.in);
	 base= sc.nextDouble();
	 height=sc.nextDouble();
	 area=0.5*base*height;
	 System.out.println("Area of Triangle: "+area);

	
}
   
}
