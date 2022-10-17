package reflection_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DemoReflection {

	public static void main(String[] args) {
	    Employee e = new Employee();
	    Class obj = e.getClass();
	    System.out.println("--------Constructors--------");
	    Constructor []carr= obj.getConstructors();
	    for(Constructor c: carr)
	    	System.out.println("Name: "+c.getName()+" \tModifier: "+c.getModifiers());
	    Method []marr= obj.getMethods();
	    for(Method m: marr)
	    	System.out.println("Name: "+m.getName()+" \tModifier: "+m.getModifiers());
	    

	}

}
