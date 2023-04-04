package Queueexamples;

import java.util.HashMap;

public class Maphashexam1 {

	public static void main(String[] args) {
		HashMap h1=new HashMap ();
		h1.put("key1", 156);//in hashmap allow to store key and value pair where key should be unique.
		h1.put("key2", 142);
		h1.put("key4", 6767);
		h1.put("key5","age");
		System.out.println(h1.size());
		System.out.println(h1);
	HashMap h2=new HashMap();
	h2.put("key2", 142);
	h2.put("key4", "ashu");//if you try insert a duplicate key it will replace the element of corresponding key.
    h1.putAll(h2);
System.out.println(h1);//
System.out.println(h1.get("key5"));
h1.replace("key2", 142, 155);//replace value
System.out.println(h1);
h1.get(2);
System.out.println(h1.get("key4"));

	}

}
