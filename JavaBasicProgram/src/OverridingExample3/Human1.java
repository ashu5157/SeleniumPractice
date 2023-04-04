package OverridingExample3;

class Human1 {
	void eat() {
		System.out.println("Human is eat");
	}
}

class Boy extends Human1 {
	void eat() {
		System.out.println("boy is eat");
	}
}

class Overriding4 {
	public static void main(String args[]) {
		Boy obj = new Boy();
		obj.eat();

		Human1 n1 = new Boy();
		n1.eat();
	}

}
