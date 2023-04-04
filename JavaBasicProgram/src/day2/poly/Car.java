package day2.poly;

class Car {
	int salary = 25000;

	void run() {
		System.out.println("Car fast");
	}
}

class bike extends Car {
	int salary = 15000;

	void run123() {
		System.out.println("bike fast");
	}
}

class ranger {
	public static void main(String[] args) {
		Car c1 = new bike();
		c1.run();
		System.out.println(c1.salary);
		System.out.println("****:" + c1.salary);

	}

}
