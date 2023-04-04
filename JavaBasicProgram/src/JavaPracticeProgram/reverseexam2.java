package JavaPracticeProgram;

public class reverseexam2 {

	public static void main(String[] args) {
		int emp=231;
		int rev=0;
		while(emp!=0) {
			int rem=emp%10;
			rev=rev*10+rem;
			emp=emp/10;
			
		}
System.out.println(rev);
	}

}
