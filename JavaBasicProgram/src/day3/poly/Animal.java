package day3.poly;

class Animal {
	void run() {
		System.out.println("Animal run fast");
	}
}

class Cat extends Animal {
	void run() {
		System.out.println("Cat run fast");
	}
}

class Dog extends Animal {
	void run() {
		System.out.println("Dog run fast");
	}
}

class Monkey extends Animal {
	void run() {
		System.out.println("mONKEY RUN FAST");
	}
}

class running {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.run();
		Animal b = new Cat();
		b.run();
		Animal c = new Dog();
		c.run();
		Animal d = new Monkey();
		d.run();
	}

}
