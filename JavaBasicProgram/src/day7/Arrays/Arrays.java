package day7.Arrays;
import java.util.Arrays;
class M_Arrays{
	public static void main(String[] args) {
		char[] copyFrom= {'a','b','c','d'};
		//dublicate arrays 
		char[] copyArrays=copyFrom.clone();
		//sorting copyfrom asending order
		Arrays.sort(copyFrom);
		boolean result=Arrays.equals(copyFrom,copyArrays);
		System.out.println(result);
	}

}
