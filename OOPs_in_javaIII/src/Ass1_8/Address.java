package Ass1_8;

public class Address {
	private String area;
	private String city;
	private String pincode;
	
	public Address()
	{   
		area=null;
		city=null;
		pincode=null;
	}

	public Address(String area, String city, String pincode) {
		super();
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	
	public String display()
	{
		return ""+area+" city :"+city+"  pincode :"+pincode;
	
	}

}
