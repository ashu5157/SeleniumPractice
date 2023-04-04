package Exceptionhandlig;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program starts from here");
		try {
			// below code do not throw any exception
			int data = 25 / 5;
			System.out.println(data);
		//}
		// catch won't be executed
		//catch (Throwable e) {
		//	System.out.println("Exception handled...");
		}
		// executed regardless of exception occurred or not
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
