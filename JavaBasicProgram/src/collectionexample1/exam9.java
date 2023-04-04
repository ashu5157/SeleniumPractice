package collectionexample1;

import java.util.ArrayList;
import java.util.Iterator;

public class exam9 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		System.out.println(a.isEmpty());
		a.add("Shivani");
		a.add("shubham");
		a.add("ashwini");
		a.add("vaishnavi");
		ArrayList<String> b=new ArrayList<String>();
		b.add("ashwini");
		b.add("Shivani");
		System.out.println(a);
		System.out.println(b);
		a.retainAll(b);//for match elements
		System.out.println(a);
		Iterator itr = a.iterator();
		while (itr.hasNext()) {//using for print match element in standing way
			System.out.println(itr.next());
		}
		
	}

}
