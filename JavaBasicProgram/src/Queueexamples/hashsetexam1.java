package Queueexamples;

import java.util.HashSet;

public class hashsetexam1 {

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add("pune");
		h1.add("pune");//dublicate canot store,hashset use for unique collection only.
		h1.add("nagpur");
		h1.add("amravti");
		System.out.println(h1);
		for(Object s1:h1) {
			System.out.println(s1);
		}

HashSet h=new HashSet();
h1.add("priyanka");
h1.add("sayali");
h1.add("amravti");
h1.addAll(h);
System.out.println(h1);
	}

}
