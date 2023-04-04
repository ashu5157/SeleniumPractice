package collectionexample1;

import java.util.ArrayList;
import java.util.Collections;

public class examdemo1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("house");
		a.add("bike");
		// a.add(1453);
		System.out.println(a.size());
		for (Object n : a) {
			System.out.println(n);
		}
		System.out.println("*********************************");
		System.out.println(a.get(1));
		ArrayList b = new ArrayList();
		a.add("Shubham");
		a.add("Ashwini");
		a.addAll(b);
		System.out.println(a);
		a.add(4, "swara");
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		System.out.println(a.get(3));
		a.set(4, "sanket");
		System.out.println(a);
		a.add(3, "Ring");
		System.out.println(a);
	}
}
