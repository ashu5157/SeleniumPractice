
public class UnaryOperation 
{

	public static void main(String[] args) 
	{
		int a = 10;
		int b = a;
		//System.out.println("a: " + a);
		//System.out.println("b: " + b);
		/**
		 * pre: first perform the operation dn use the updated value 
		 * post: first use the value dn perform the operation
		 */
		int k = a++;
		System.out.println("k: " + k);//10
		System.out.println("a: " + a);//11
		int j = k++;
		System.out.println("k: " + k);//11
		System.out.println("j: " + j);//10

		int r = 21;
    	System.out.println("r=: " + r++);//21
		System.out.println("r=: " + r);//22
		System.out.println("r=: " + ++r);//23
		System.out.println("r=: " + r);//23

		int x = 105;
		System.out.println("x=: " + ++x);// 106
		System.out.println("x=: " + x--);//106 
		System.out.println("x=: " + x);//105
		System.out.println("x=: " + x++);//105
		System.out.println("x=: " + --x);//105
	}
}


