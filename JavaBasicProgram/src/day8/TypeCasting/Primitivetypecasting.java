package day8.TypeCasting;

class Primitivetypecasting {
	public static void main(String[] args) {
		int myint = 9;
		double mydouble = myint;
		double d = (double) myint;
		System.out.println(myint);
		System.out.println(mydouble);
		System.out.println(d);
		double salary = 450000;
		int sal = (int) salary;
		long mysal = (long) salary;
		float f = (float) salary;
		System.out.println(salary);
		System.out.println(sal);
		System.out.println(mysal);
		System.out.println(f);
	}

}
