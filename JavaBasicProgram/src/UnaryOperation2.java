
public class UnaryOperation2
{

	public static void main(String[] args)
	{
		
				int a = 0, b;
				b = a++ + ++a + ++a + a;// b=0+2+3+3
				
				System.out.println("a: "+a);//3
				System.out.println("b: "+b);//8
				System.out.println("**********************");
				a = -5;
				b = a-- + --a + --a + a;//b=-5+-7+-8-8
				System.out.println("a: "+a);// -8
				System.out.println("b: "+b);//-28

				a = 21;
				b = --a + --a + --a + a + ++a + a++;// b-20+19+18+18+19+19

				System.out.println(a);// 20
				System.out.println(b);// 113

				a = -2;
				b = a-- + a + ++a + a++ + ++a + a++ + a;
				//b=-2-3-2-2+0+0+1
				System.out.println(a);//1
				System.out.println(b);//-8
			}

	}



