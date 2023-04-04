package day2.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		int age1[];
		age1 = new int[6];
		age1[0] = 25;
		age1[1] = 26;
		age1[2] = 27;
		age1[3] = 28;
		age1[4] = 29;
		age1[5] = 30;
		System.out.println(age1.length);
		System.out.println(age1[0]);
		System.out.println(age1[1]);
		System.out.println(age1[2]);
		System.out.println(age1[3]);
		System.out.println(age1[4]);
		System.out.println(age1[5]);
		System.out.println("********using for loop***********");
		for (int i = 0; i < age1.length; i++) {
			System.out.println(age1[i]);
			if (age1[i] == 30) {
				System.out.println(age1[i]);
				break;
			} else {
				System.out.println("age is not 30");
			}
			int[] numbers = { 5, 3, 2, 1 };
			int sum = 0;
			int avarage;
			for (int number : numbers) {
				sum = sum + number;
			}
			int arraylength = numbers.length;
			int avrage = sum / arraylength;
			System.out.println("sum of elements :" + sum);
			System.out.println("avrg of elements:" + avrage);
		}
	}
}
