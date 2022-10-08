package Ass1;

public class Employee {
 private int eid;
 private String name;
 private Date doj;
public Employee() {
	eid=0;
	name=null;
	doj=null;
	
}


 public Employee(int eid, String name,int d, int m,int y)
 {
	this.eid=eid;
	this.name=name;
	doj= new Date(d,m,y);
 }
 public Employee(int eid, String name, Date d) {

		this.eid = eid;
		this.name = name;
		doj = d;
 }
 public void display()
 {
	 System.out.println("----------------------------------");
	 System.out.println("Employe Id :"+eid);
	 System.out.println("      Name :"+name);
	 doj.display();
 }
}    
