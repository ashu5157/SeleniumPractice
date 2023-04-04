package day7.encapsulation;

class Encap {
	private char grade = 'A';
	private double salary = 2000;
	private int empID = 1001;

	public char getgrade() {
		return grade;
	}

	public int getempID() {
		return empID;
	}

	public double getsalary() {
		return salary;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	public void setgrade(char grade) {
		this.grade = grade;
	}
}

class example1 {
	public static void main(String[] args) {
		Encap e1 = new Encap();
		System.out.println("Accessing private member:" + e1.getgrade());
		System.out.println("Accessing private member:" + e1.getempID());
		System.out.println("Accessing private member:" + e1.getsalary());
		System.out.println("****************************");
		e1.setsalary(2500);
		e1.setgrade('B');
		System.out.println("updating private member:" + e1.getsalary());
		System.out.println(":updating private members:" + e1.getgrade());

	}

}
