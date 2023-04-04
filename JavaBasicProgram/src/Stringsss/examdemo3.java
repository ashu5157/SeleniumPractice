package Stringsss;

public class examdemo3 {

	public static void main(String[] args) {
		String a="Mumbai";
		String b="Pune";
		System.out.println(a.contentEquals(b));
        char c=a.charAt(3);
        System.out.println(c);
        char h=b.charAt(2);
        System.out.println(h);
      for(int i=b.length()-1;i>=0;i--) {
    	  System.out.println(b.charAt(i));
      }
        for (int j=0;j<a.length();j++) {
        System.out.println(a.charAt(j));
	}

	}
}

