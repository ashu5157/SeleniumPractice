package OverridingExample2;

class parents {
	void show() {
		System.out.println("Parents show");
	}
}

class child5 extends parents {
	void show() {
		super.show();
		System.out.println("Childs show");
	}
}

class Grandchild extends child5 {
	void show() {
		super.show();
		System.out.println("Grandchilds show");
	}
}

class Overriding2 {
	public static void main(String[] args) {
		parents p1 = new Grandchild();
		p1.show();
	}

}
