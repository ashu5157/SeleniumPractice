
public class FinalKeywaord1 {
	static {
		System.out.println("Running statis block 1 of class block2");
	}

	public static void main(String[] args) {
		System.out.println("Main()start");
		System.out.println("Hi i am main () of block class2");
		System.out.println("Main()end");


	}
	static {
		System.out.println("Running ststic block2 of class block2");
	}

}
