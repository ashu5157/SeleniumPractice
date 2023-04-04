package Predefined.Systemexample2;

public class Animal {
	Animal() {
		System.err.println("i am animal");
	}

	void Dog() {
		System.out.println("i m a Dog");
	}

	void Tiger() {
		System.out.println("i am a tiger");
	}
}

final class demo2 {
	static Animal a1 = new Animal();

	public static void main(String[] args) {
		System.out.println("pogram start");
		demo2.a1.Tiger();
		demo2.a1.Dog();
		Animal a2 = new Animal();
		a2.Tiger();
		a2.Dog();
		System.out.println("program ens*********");
		System.err.println("systemodemo2");

	}

}
