package office.app;

import office.staff.person;
import office.utility.Date;

public class DemoApp {

	public static void main(String[] args) {
		Date d1=new Date(10,12,2023);
		 d1.display();
      person p1=new person("Ram",123456,"440034");
        System.out.println(p1.display());
	}

}
