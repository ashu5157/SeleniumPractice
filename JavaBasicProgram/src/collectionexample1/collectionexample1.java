package collectionexample1;

import java.util.List;
import java.util.ArrayList;

public class collectionexample1 {

	public static void main(String[] args) {
		List a=new ArrayList();
	    a.add("ashwini");
	    a.add("shubham");
	    a.add(null);
	    a.add(24.0);
	    a.add(true);
	    a.add("ashwini");
	    System.out.println(a.size());
//for(int i=0;i<a.size();i++) {
	//System.out.println(a.get(i));
//}
//System.out.println(a.get(2));
for(Object b:a) {
	System.out.println(b);
}
	}

}
