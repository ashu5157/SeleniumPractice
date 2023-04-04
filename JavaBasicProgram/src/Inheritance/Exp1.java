package Inheritance;
class Car6{
	void addnumber(int a,int b) {
		int res=a+b;
		System.out.println("add two num:"+res);
	}
}
class Bike extends Car6{
	void multiply(int f,double h) {
		double result=f+h;
		System.out.println("multiply two number:"+result);
	}
}

public class Exp1 {

	public static void main(String[] args) {
		Car6 c1=new Car6();
		c1.addnumber(8, 5);
	  Bike b1=new Bike();
	  b1.multiply(10, 5);
	}

}
