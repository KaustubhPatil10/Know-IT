package office.staff;

public class person {
private String name;
private int mobno;
private String pin;
public person() {
	super();
}
public person(String name, int mobno, String pin) {
	super();
	this.name = name;
	this.mobno = mobno;
	this.pin = pin;
}

public String display()
{
	String str;
	str="Name :"+name+ "  MobNo :"+mobno+  "  Pin :"+pin;
	return str;
	
}
}
