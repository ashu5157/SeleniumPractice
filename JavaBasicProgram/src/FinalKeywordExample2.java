

public class FinalKeywordExample2 {

	static final int id=101;
	public static void main(String[] args) {
		final int age;
		age=25;
		System.out.println(age);
		System.out.println(id);
				//id=102;
//id=101;//you cann't modify final variable value
	}
}
