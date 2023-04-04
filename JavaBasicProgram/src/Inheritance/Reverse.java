package Inheritance;

public class Reverse {
	public static void main(String[] args) {
	int num=123;
	int rev=0;
	while(num!=0) {
		int rem=num%10;//3,,,,12%10=2,,1%10=1
		rev=rev*10+rem;//0*10+3=3,,,,3*10+2=32,,,32*10+1=321
		num=num/10;//123/10=12,,,12/10=1,,,1/10=0
	}
	System.out.println(rev);
	
	}

}
