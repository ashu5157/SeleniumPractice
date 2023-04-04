package Predefined.Scannerclass1;

import java.util.Scanner;

public class ScannerClassExample1 {
	public static void main(String[] args) {
		String s1 = "Hello Ashwini Here";
		Scanner scan1 = new Scanner(s1);
		System.out.println("result boolean:" + scan1.hasNext());
		System.out.println("sprint print:" + scan1.nextLine());
		scan1.close();
		System.out.println("Enter your deatils ***********");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = in.next();
		System.out.println("my name is :" + name);
		System.out.println("Enter your age");
		int age = in.nextInt();
		System.out.println("my age is:" + age);
		System.out.println("Entere your salary");
		double salary = in.nextDouble();
		System.out.println("salary is :" + salary);
		System.out.println("Enter your empId");
		int empId=in.nextInt();
		System.out.println("my empId is :"+empId);
		in.close();

	}

}
