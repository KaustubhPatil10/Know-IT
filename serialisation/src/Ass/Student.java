package Ass;

import java.io.Serializable;

public class Student implements Serializable {

	private int Rno;
	private String name;
	private double marks;
	
	public Student() {
		Rno=10;
		name="name";
		marks=95.6;	
	}
	
	public Student(int rno,String name, double marks) {
		this.Rno=rno;
		this.name=name;
		this.marks=marks;	
	}

	@Override
	public String toString() {
		return "Student [Rno=" + Rno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
