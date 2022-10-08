package Ass1_9;

public class Line {
	private int x1, y1,x2,y2;
	
	public Line()
	{
		x1=1;
		y1=1;
		x2=1;
		y2=1;
		
	}

	public Line(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	
	
	public void showLine()
	{
		System.out.println("Starting Line: ["+x1+","+y1+"]");
		System.out.println("Starting Line: ["+x2+","+y2+"]");

	}

}
