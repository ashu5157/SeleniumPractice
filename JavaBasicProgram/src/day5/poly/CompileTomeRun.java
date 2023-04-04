package day5.poly;

public class CompileTomeRun {
	static void sum(int a, int b) {
		int c = a + b;
		System.out.println("addition of two number sum:" + c);
	}

	static void sum(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("addition of three number:" + d);
	}

	public static void main(String[] args) {
		CompileTomeRun.sum(20, 20, 20);
		CompileTomeRun.sum(50,50);

	}

}
