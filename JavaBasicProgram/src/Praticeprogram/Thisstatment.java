package Praticeprogram;

public class Thisstatment {
	Thisstatment() {
		System.out.println("zero para");

	}

	Thisstatment(int a) {
		this();
		System.out.println("single para");
		
	}

	Thisstatment(int s, int e) {
	    this(8);
		System.out.println("double para");
	
	}

	public static void main(String[] args) {
		Thisstatment t1 = new Thisstatment(5, 17);
		//Thisstatment t2 = new Thisstatment();
	}

}
