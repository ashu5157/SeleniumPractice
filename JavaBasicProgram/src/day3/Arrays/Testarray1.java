package day3.Arrays;

public class Testarray1 {
	// creating a method which receives an array as a parameter
	static void min(int arr[]) {// int arr[]=a={ 33, 13, 4, 50,15,1 };
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {// 30>13 | 13 >4 | 4>50 | 4>15 | 4>1
				min = arr[i]; // min=13 | min=4 | min=4 | min=4| min=1
			}
		}
		System.out.println("Min number in array is: " + min);
	}

	static void max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {//
				max = arr[i];
			}
		}
		System.out.println("Max number in array is: " + max);
	}
}

 public class arrays {
	public static void main(String args[]) {
		int a[] = { 33, 13, 4, 50, 15, 1 };// declaring and initializing an array
		Testarray1.min(a);// passing array to method
		Testarray1.max(a);// passing array to method
	}
}