package day1.Arrays;

public class Arrays0 {

	public static void main(String[] args) {
		String[] cars;
		String[] cars1 = new String[4];
		cars1[0] = "man";
		cars1[1] = "women";
		cars1[2] = "dog";
		cars1[3] = "cat";
		// String[] cras1={"man","women","dog","cat"};
		System.out.println(cars1[0]);
		System.out.println(cars1[1]);
		System.out.println(cars1[2]);
		System.out.println(cars1[3]);
		// change an array element
		cars1[0] = "mini";
		System.out.println(cars1[0]);
		// array element count
		System.out.println(cars1.length);
		System.out.println(cars1[3]);
		System.out.println("******for loop***********");
		// array element using for loop
		for (int i = 0; i < cars1.length; ++i) {
			System.out.println(cars1[i]);
		}
		// array element using for each loop
		System.out.println("*******for each loop***********");
		for (String i : cars1) {
			System.out.println(i);
			// delcartion
			int a[];
			a = new int[5];// size intitialization
			a[0] = 20;
			a[1] = 30;
			a[2] = 40;
			a[3] = 50;
			a[4] = 60;
			System.out.println("*******after initilaization*******");
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			System.out.println(a[4]);
			System.out.println("element count is :" + a.length);
			System.out.println("*********normal for loop********");
			for (int f = 0; f < a.length; f++)
				;
			{
				System.out.println(a[3]);
			}
			for (int total : a) {
				System.out.println(total);
			}
			char[] grade = new char[3];
			grade[0] = 'a';
			grade[1] = 'b';
			grade[2] = 'c';
			System.out.println("*****************");
			for (char num : grade) {
				System.out.println(num);
			}
			// create an array
			int[] age = { 12, 4, 25, 2, 5 };
			// access each array elements
			System.out.println("Accessing Elements of Array:");
			System.out.println("First Element: " + age[0]);
			System.out.println("Second Element: " + age[1]);
			System.out.println("Third Element: " + age[2]);
			System.out.println("Fourth Element: " + age[3]);
			System.out.println("Fifth Element: " + age[4]);
			System.out.println("array size: " + age.length);
			System.out.println("***************Using for Loop:");
			for (int n = 0; n < age.length; n++) {
				System.out.println(age[n]);
				if (age[n] == 25) {
			//	System.out.println(age[n]);
				break;
			} else {
				System.out.println("age is not 25");
			}
			}
			System.out.println("************Using for-each Loop:");
			for (int l : age) {
				System.out.println(l);
			if(l==25){
			//System.out.println(l);
				break;
			}else {
				System.out.println("age is not 25");
		}
	}

	}
	}
}
