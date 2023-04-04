package Overridingexample5;

class Flower {
	public void name() {
		System.out.println("my name is flower");
	}
}

class butterfly extends Flower {
	public void name() {
		System.out.println("my name is butterfly");
	}
}

class tree extends butterfly {
	public void name() {
		System.out.println("my name is tree");
	}

	public void color() {
		System.out.println("my color is Red");
	}

	public static void main(String args[]) {
		tree t1 = new tree();
		t1.color();
		t1.name();
		System.out.println("***********");
		butterfly b2 = new butterfly();
		b2.name();
		Flower f3 = new Flower();
		f3.name();

	}

}
