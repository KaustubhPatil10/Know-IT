package Ass1;

public class DemoEmployee {

	public static void main(String[] args) {
	 Employee e1= new  Employee(101,"Ram",1,1,1001);
	  Date d1 = new Date(2,2,2022);
	  Employee e2=new Employee(102,"Lakshman",d1);
	  Employee e3=new Employee(103,"Seeta",d1);
	  Employee e4=new Employee(104,"Hanuman",d1);
	  Date d2= new Date(3,3,2033);
	  Employee e5=new Employee(105,"Ravan",d2);
	   Date d3= new Date(3,5,2022);
	  Employee e6=new Employee(106,"Kumbhakaran",d3);
	  Employee e7=new Employee(106,"Meghanad",d3);
      e1.display();
      e2.display();
      e3.display();
      e4.display();
      e5.display();
      e6.display();
      e7.display();
	}

}
