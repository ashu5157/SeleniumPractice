package Predefined.Scannerclass2;
import java.util.Scanner;
public class ScannerExample2 {
	public static void main(String[] args) {
		int[] empId=new int[5];
		empId[0]=20;
		empId[1]=20;
		empId[2]=20;
		empId[3]=20;
		empId[4]=20;
		System.out.println(empId[0]);
		System.out.println(empId[1]);
		System.out.println(empId[2]);
		System.out.println(empId[3]);
		System.out.println(empId[4]);
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<empId.length;i++) {
		System.out.println("array element :"+empId);
	}
		int i=0;
		for(int num:empId) {
			System.out.println("Index"+i+": "+num);
			i++;
		}		
	}

	}

