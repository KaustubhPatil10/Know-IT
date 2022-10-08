package Ass1_6;

public class DemoBox {

	public static void main(String[] args) {
     Box b[]=new Box[3];
     b[0]=new Box(10,20,30);
     b[1]=new Box(2,4,5);
     b[2]=new Box(1,6,9);
     for(int i=0;i<3;i++)
     {
    	 b[i].display();
    	 b[i].calculateVolume();
     }
	}

}
