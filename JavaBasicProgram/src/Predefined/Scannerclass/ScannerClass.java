package Predefined.Scannerclass;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		// create obj of scanner class
		Scanner refscan = new Scanner(System.in);
		int age;
		double salary;
		String name;
		boolean Valid;
		// initialization of variable using scanner class
		System.out.println("enter age vale from conosle");
		age = refscan.nextInt();
		System.out.println("enter salary from conosle");
		salary = refscan.nextDouble();
		System.out.println("enter name from console");
		name = refscan.next();
		System.out.println("enter valid from console");
		Valid = refscan.hasNextBoolean();
		System.out.println("entre single char from console");
		int num1,num2;
		num1=refscan.nextInt();
		System.out.println("Enter num1:");
		num2=refscan.nextInt();
		char op;
		System.out.println("Enter operator:");
		op=refscan.next().charAt(0);
		System.out.println("Addition of two numbers: " + addNumber(op, num1, num2));
		System.out.println("*****************************************");
	}
	static int addNumber(char op, int num1, int num2) {
		if (op == '+') {
			return num1 + num2;
		} else {
			return 0;
		}
	}

	

	}


