package day2.abstractioninetrface;
interface printable {
	int age = 26;

	void print();
}

interface showable {
	public void show();
}

class interface3 implements printable, showable {
	public static int age = 45;

	public void print() {
		System.out.println("hellow");
	}

	public void show() {
		System.out.println("welcome");
	}

	public static void main(String args[]) {
		interface3 obj = new interface3();
		obj.print();
		obj.show();
		System.out.println(printable.age);
		System.out.println(interface3.age);
	}

}