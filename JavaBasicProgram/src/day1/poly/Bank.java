package day1.poly;

class Bank {
	float rateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	float rateOfInterest() {
		return 8.1f;
	}
}

class ICIC extends SBI {
	float rateOfInterest() {
		return 5.5f;
	}
}

class Axis extends ICIC {
	float rateOfInterest() {
		return 1.1f;
	}
}

class runtime {
	public static void main(String[] args) {
		Bank b1 = new SBI();
		System.out.println("SBI rate of interest:" + b1.rateOfInterest());
		b1 = new ICIC();
		System.out.println("ICIC rate of interest:" + b1.rateOfInterest());
		b1 = new Axis();
		System.out.println("Axis rate of interest:" + b1.rateOfInterest());

	}

}
