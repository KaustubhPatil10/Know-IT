package Ass1_7;


public class Person {
 private String name;
 private Date bdate;
public Person() {
	name=null;
	bdate=null;
	
}


 public Person(String name,int d, int m,int y)
 {

	this.name=name;
	bdate= new Date(d,m,y);
 }
 public Person(String name, Date d) {
	
		this.name = name;
		bdate = d;
 }
 public void display()
 {
	 System.out.println("----------------------------------");
	 System.out.println("      Name :"+name);
	 bdate.display();
 }
}    
