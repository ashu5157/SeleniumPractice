package Overridingexample7;

class Owner {
	void eat() {
		System.out.println("eat of owner");
	}
}

class employee extends Owner {
	void work() {
		System.out.println("work of owner");
	}

	void place() {
	System.out.println("place of owner");
	}

	public static void main(String[] args) {
		employee obj = new employee();
		obj.eat();
		obj.place();
		Owner w1=new Owner();
		w1.eat();

	}

}