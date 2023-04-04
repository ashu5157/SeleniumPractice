package Queueexamples;

import java.util.PriorityQueue;

public class exam1 {

	public static void main(String[] args) {
		PriorityQueue q1 = new PriorityQueue();
		q1.add(2345);
		q1.add(27);
		q1.add(71);
		q1.add(89);
		System.out.println(q1.size());
		System.out.println(q1.element());
		System.out.println(q1.peek());
		System.out.println(q1.remove());
		System.out.println(q1);
		
	    

	}

}
