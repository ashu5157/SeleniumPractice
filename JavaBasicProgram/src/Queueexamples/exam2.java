package Queueexamples;

import java.util.PriorityQueue;

public class exam2 {

	public static void main(String[] args) {
	PriorityQueue q2=new PriorityQueue	();
	q2.add("ishu");
	q2.add("shubh");
	q2.add("pune");
	q2.add("ashu");
	q2.add("mumbai");
	System.out.println(q2);
	System.out.println(q2.size());//print element count
	System.out.println(q2.peek());//print top most element,but when we print this method without element then it will print Null.
	System.out.println(q2.element());//print top most method,without element it will print exception
	System.out.println(q2.remove());//this method remove top most element but when element is empty then it will throw nosuchelement excpettion
	System.out.println(q2);//
	
	System.out.println(q2.poll());//this method remove top most element,when element is empty then it will print null.
	System.out.println(q2);
	
	}

}
