package day10.TypeCasting;

class A {
	void test1() {
		System.out.println("test1");
	}
}

class B extends A {
	void test2() {
		System.out.println("TEST2");
	}
}

class C extends B {
	void test3() {
		System.out.println("test3");
	}
}

class Explicitupcasting {
	public static void main(String[] args) {
		System.out.println("here start");
		C c1 = new C();
		B b1 = (B) c1;
		b1.test1();
		b1.test2();
		System.out.println("here program end");
	}

}
