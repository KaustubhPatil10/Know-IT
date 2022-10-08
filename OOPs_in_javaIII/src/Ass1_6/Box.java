package Ass1_6;
public class Box
{
	private int height,width,depth;

	public Box() {
		super();
	}

	public Box(int height, int width, int depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	public void display()
	{  
		System.out.println("Height"+height);
		System.out.println("Depth"+depth);
		System.out.println("Width"+width);
	
	
	}
	public void calculateVolume()
	{
		System.out.println("Volume is :"+(height*width*depth));
	}
	
}