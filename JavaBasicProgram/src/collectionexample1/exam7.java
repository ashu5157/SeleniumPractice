package collectionexample1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.Iterator;

public class exam7 {

	public static void main(String[] args) {
		System.out.println("Traversing list through Iterator interface:");
		Iterator itr = List.iterator();
		/**
		 * List element: [Banana, Dates, Grapes, Mango]
		 * Iterator is a Interface in collection, which is used to iterate collection elements
		 * Iterator interface has following method to iterate collection elements
		 * 1. hasNext() ---> boolean --> true next element is present, false no next element
		 * 2. next() ---> Object --> it will return next element from collection
		 * 3. remove() --> void --> element deletion
		 * Iterator object can be use to iterate a collection only once, for 2nd iteration create new Iterator object
		 */
//		System.out.println(itr.hasNext());
//		System.out.println(itr.next());//123
//		System.out.println(itr.next());//Dates
//		System.out.println(itr.next());//Grapes
//		System.out.println(itr.next());//Mango
//		System.out.println(itr.next());//NoSuchElementException exception
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());//
		System.out.println("*********with used Iterator Object**********");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*******with new Iterator Object************");
		Iterator itr2 =list.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
