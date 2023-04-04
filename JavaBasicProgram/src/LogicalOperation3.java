
public class LogicalOperation3 
{

	public static void main(String[] args) 
	{
		System.out.println("Program Start");
	    //variable initialization
		int num1=5,num2=5;
		boolean bool1=(num1==num2);//t
		boolean bool2=(num1== num2);//t
		//Logical && AND
		System.out.println("bool1 && bool2 = "+(bool1 && bool2));//t
		//Logical || OR
		System.out.println("bool1 ||bool2 ="+(bool1||bool2));//t
		//Logical ! NOT
		System.out.println("!(bool1 && bool2)="+!(bool1 && bool2));//f
		

	}

}
