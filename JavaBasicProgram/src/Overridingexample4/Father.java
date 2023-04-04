package Overridingexample4;

class Father {
	void name() {
		System.out.println("father name is Ravindra");
	}
}

class doughter extends Father {
	void name() {
		super.name();
		System.out.println("Doughter name is Ashwinin");
	}

	public static void main(String args[]) {
		doughter obj = new doughter();
		obj.name();
	}

}
