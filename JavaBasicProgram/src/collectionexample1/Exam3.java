package collectionexample1;

import java.util.ArrayList;

public class Exam3 {

	public static void main(String[] args) {
		ArrayList b = new ArrayList();
		b.add("Vashi");
		b.add("dadar");
		b.add("nerul");
		b.add(27);
		b.add(5678);
		b.add(true);
		for (Object c : b) {
			System.out.println(c);
		}
		System.out.println("*****************************************");
		b.add(2);
		System.out.println(b.get(2));
		ArrayList v = new ArrayList();
		v.add("Ashu");
		v.add(6767);
		b.addAll(v);
		System.out.println(b);
		b.set(6, "shubhu");
		System.out.println(b);
		b.removeAll(v);
		System.out.println(b);
		
	}

}
