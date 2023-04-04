package Praticeprogram;

public class RevExample4 {

	public static void main(String[] args) {
		int b=1996;
		int rev=0;
	while(b!=0) {
		int rem=b%10;//1996%10=6,,,199%6=1,
		rev=rev*10+rem;//0*10+6=6,,6*10+1=61
		b=b/10;//1996/10=199,,,,,,,
	}
	System.out.println(rev);	
	}

}