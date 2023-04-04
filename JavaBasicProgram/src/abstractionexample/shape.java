package abstractionexample;

abstract class shape {
	abstract void draw();
}

class rectangle extends shape {
	public void draw() {
		System.out.println("Drawing rectangle");
	}
}

class circle extends shape {
	public void draw() {
		System.out.println("Drawing circle");
	}
}

class abstractionclass2 {
	public static void main(String[] args) {
		shape s = new circle();
		s.draw();
		shape s1 = new rectangle();
		s1.draw();
	}

}
