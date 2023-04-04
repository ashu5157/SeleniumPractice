package Exceptionhandlig;

import java.util.Scanner;

public class Exmaple1 {

	public static void main(String[] args) {
		System.out.println("program starts from here...");
		// 1. abnormal statements
		int i, j, k;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first num1: ");
		i = scn.nextInt();
		System.out.println("Enter first num2: ");
		j = scn.nextInt();
		try {
			System.out.println("******You are inside try block **********");
			k = i
					/ j;// ArithmeticException
			System.out.println("res: " + k);
			System.out.println("*********No Exceptuin found***********");
		} catch (ArithmeticException e) {
			System.out.println("*********You are in catch()*********");
			// System.out.println("Exception handled:
			// "+obj);//java.lang.ArithmeticException: / by zero
			e.printStackTrace();// complete exception detail
			System.out.println("******Exception Handled*******");
		}
		System.out.println("Programs ends here...");
	}
}