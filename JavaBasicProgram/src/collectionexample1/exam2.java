package collectionexample1;

import java.util.List;
import java.util.ArrayList;

public class exam2 {

	public static void main(String[] args) {
		ArrayList b = new ArrayList();
		b.add("nagpur");
		b.add("pune");
		b.add("mumbai");
		b.add("salary");
		b.add(26);
		
		for (Object e : b) {
			System.out.println(e);
		}
		b.add(1, "aSHWINI");
		System.out.println(b);
		b.add(2, "Shubham");
		System.out.println(b);
		ArrayList c = new ArrayList();
		c.add("malkapur");
		c.add("pune");
		c.add("nagpur");
		b.addAll(c);
		System.out.println(b);
		b.retainAll(c);
	System.out.println(b);
	}
}
