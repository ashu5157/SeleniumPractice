package Praticeprogram;

public class Method {
	static void Addnumber(int a,int b) {
	int res=a+b;
	System.out.println(res);
	}
	static void Addnumber(double c,double d,double e) {
	double res=c+d+e;
	System.out.println(res);
	}
	static void Addnumber(int a,double b) {
		double res=a+b;
		System.out.println(res);
	}

	public static void main(String[] args) {
	Addnumber(5,7);
	Addnumber(5,7,9);
	Addnumber(8,8);

	}
	
		
	}

