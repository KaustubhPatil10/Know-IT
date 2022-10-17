package assign1;
import java.util.ArrayList;
import java.util.List;

public class DemoArray {



	public static void main(String[] args) {
		List<Integer> e= new ArrayList<>();
		e.add(2);
		e.add(3);
		e.add(6);
		e.add(8);
		e.add(11);
		e.add(15);
		e.add(14);
		e.add(17);
		e.add(18);
		e.add(20);
		System.out.println(e);

		List<Integer> Even= new ArrayList<>();
		List<Integer> Odd= new ArrayList<>();

		for(int i=0;i<e.size();i++) {
			if(e.get(i)%2==0) {
				Even.add(e.get(i));	
			}
			else {
				Odd.add(e.get(i));
			}

		}
		System.out.println("Even: "+Even);
		System.out.println("Odd: "+Odd);
	}

}
