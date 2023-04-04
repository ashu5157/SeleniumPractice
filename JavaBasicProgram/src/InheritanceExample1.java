
public class InheritanceExample1 {
	public static void main(String[] args) {
		Example10 e1 = new Example10();
		e1.callingme();
		testing1 t1 = new testing1();
		t1.callingFromVoda();
		testing2 t2 = new testing2();
		t2.callingFromIdea();
		testing3 t3 = new testing3();
		t3.callingFromAirtel();
	}
}

class testing1 {
	void callingFromVoda() {
		System.out.println("Voda");
	}
}

class testing2 {
	void callingFromIdea() {
		System.out.println("Idea");
	}
}

class testing3 {
	void callingFromAirtel() {
		System.out.println("Airtel");
	}
}

class Example10 {
	void callingme() {
		System.out.println("calling me");
	}
}
