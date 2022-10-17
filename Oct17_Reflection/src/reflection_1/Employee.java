package reflection_1;

public class Employee {
	private String name;
	private int eid;
	private double salary;
	
	public Employee() {
		name= "vaibhav";
		eid= 10;
		salary= 1000;
	}
	public Employee(String name,int eid, double salary) {
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}
	
	public String toString() {
		return "Name: "+name+" Eid: "+eid+" Salary: "+salary;
	}

}
